package com.sadataljony.app.android.jetpackcompose_a_to_z

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sadataljony.app.android.jetpackcompose_a_to_z.ui.theme.JetpackCompose_A_to_ZTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose_A_to_ZTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        FloatingActionButton()
                        FloatingActionButtonSmall()
                        FloatingActionButtonLarge()
                        ExtendedFloatingActionButton()
                    }
                }
            }
        }
    }
}

@Composable
fun FloatingActionButton() {
    val context = LocalContext.current
    FloatingActionButton(
        onClick = { Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show() },
    ) {
        Icon(Icons.Filled.Add, "Floating action button.")
    }
}

@Composable
fun FloatingActionButtonSmall() {
    val context = LocalContext.current
    SmallFloatingActionButton(
        onClick = {Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show()},
        containerColor = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = MaterialTheme.colorScheme.secondary
    ) {
        Icon(Icons.Filled.Add, "Small floating action button.")
    }
}

@Composable
fun FloatingActionButtonLarge() {
    val context = LocalContext.current
    LargeFloatingActionButton(
        onClick = {Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show()},
        shape = CircleShape,
    ) {
        Icon(Icons.Filled.Add, "Large floating action button")
    }
}


@Composable
fun ExtendedFloatingActionButton() {
    val context = LocalContext.current
    ExtendedFloatingActionButton(
        icon = { Icon(Icons.Filled.Favorite, "") },
        text = { Text("FloatingActionButton") },
        onClick = {Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show()},
        elevation = FloatingActionButtonDefaults.elevation(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackCompose_A_to_ZTheme {

    }
}