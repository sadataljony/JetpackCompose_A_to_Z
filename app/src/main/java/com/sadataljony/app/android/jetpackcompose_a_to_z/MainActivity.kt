package com.sadataljony.app.android.jetpackcompose_a_to_z

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
                        MyAppBarWithActions()
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAppBar() {
    TopAppBar(
        title = { Text("My App") }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAppBarWithActions() {
    TopAppBar(
        title = { Text("My App") },
        actions = {
            IconButton(onClick = { /* Do something */ }) {
                Icon(Icons.Default.Search, contentDescription = "Search")
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackCompose_A_to_ZTheme {
        MyAppBarWithActions()
    }
}