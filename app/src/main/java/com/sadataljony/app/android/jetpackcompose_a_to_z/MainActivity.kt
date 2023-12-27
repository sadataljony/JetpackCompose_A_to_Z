package com.sadataljony.app.android.jetpackcompose_a_to_z

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.sadataljony.app.android.jetpackcompose_a_to_z.ui.theme.JetpackCompose_A_to_ZTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose_A_to_ZTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        FilledButtonExample()
                        FilledTonalButtonExample()
                        OutlinedButtonExample()
                        ElevatedButtonExample()
                        TextButtonExample()
                        ButtonWithAction()
                    }
                }
            }
        }
    }
}

@Composable
fun FilledButtonExample() {
    Button(onClick = {/* Do something! */ }) {
        Text("Filled Button")
    }
}

@Composable
fun FilledTonalButtonExample() {
    FilledTonalButton(onClick = {/* Do something! */ }) {
        Text("Tonal Button")
    }
}

@Composable
fun OutlinedButtonExample() {
    OutlinedButton(onClick = {/* Do something! */ }) {
        Text("Outlined Button")
    }
}

@Composable
fun ElevatedButtonExample() {
    ElevatedButton(onClick = {/* Do something! */ }) {
        Text("Elevated Button")
    }
}

@Composable
fun TextButtonExample() {
    TextButton(onClick = {/* Do something! */ }) {
        Text("Text Button")
    }
}

@Composable
fun ButtonWithAction() {
    val context = LocalContext.current
    Button(onClick = {
        Toast.makeText(
            context, "You clicked the button",
            Toast.LENGTH_LONG
        ).show()
    }) {
        Text("Button with Action")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackCompose_A_to_ZTheme {
//        Greeting("Android")
    }
}