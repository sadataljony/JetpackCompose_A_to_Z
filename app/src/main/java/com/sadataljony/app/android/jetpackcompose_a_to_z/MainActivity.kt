package com.sadataljony.app.android.jetpackcompose_a_to_z

import android.os.Bundle
import android.util.EventLogTags
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
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
//                        SampleText()
//                        TextFromStringResource()
//                        TextWithParams("Android")
//                        TextStyleFontSize()
                        CustomStylingText()
                    }
                }
            }
        }
    }
}

@Composable
fun SampleText() {
    Text(
        text = "Normal Text"
    )
}

@Composable
fun TextFromStringResource() {
    Text(stringResource(R.string.from_string_resource))
}

@Composable
fun TextWithParams(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "TextWithParams $name!",
        modifier = modifier
    )
}

@Composable
fun TextStyleFontSize() {
    Column {
        Text("bodyLarge", style = MaterialTheme.typography.bodyLarge)
        Text("bodyMedium", style = MaterialTheme.typography.bodyMedium)
        Text("bodySmall", style = MaterialTheme.typography.bodySmall)
        Text("displayLarge", style = MaterialTheme.typography.displayLarge)
        Text("displayMedium", style = MaterialTheme.typography.displayMedium)
        Text("displaySmall", style = MaterialTheme.typography.displaySmall)
        Text("headlineLarge", style = MaterialTheme.typography.headlineLarge)
        Text("headlineMedium", style = MaterialTheme.typography.headlineMedium)
        Text("headlineLarge", style = MaterialTheme.typography.headlineSmall)
        Text("labelLarge", style = MaterialTheme.typography.labelLarge)
        Text("labelMedium", style = MaterialTheme.typography.labelMedium)
        Text("labelSmall", style = MaterialTheme.typography.labelSmall)
        Text("titleLarge", style = MaterialTheme.typography.titleLarge)
        Text("titleMedium", style = MaterialTheme.typography.titleMedium)
        Text("titleSmall", style = MaterialTheme.typography.titleSmall)
    }
}

@Composable

fun CustomStylingText() {

    Column {
        // Color
        Text(
            text = "Text with Color",
            style = TextStyle(color = Color.Red)
        )

        //Background Color
        Text(
            text = "Text with Background Color",
            style = TextStyle(background = Color.Yellow)
        )

        //Shadow
        Text(
            text = "Text with Shadow",
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Black,
                    offset = Offset(5f, 5f),
                    blurRadius = 5f
                )
            )
        )

        //Font Family
        Text(
            text = "Text with custom font",
            style = TextStyle(fontSize = 20.sp, fontFamily = FontFamily.Cursive)
        )

        //Font Size
        Text(
            text = "Text with big font size",
            style = TextStyle(fontSize = 30.sp)
        )

        //Style
        Text(
            text = "Text with Italic text",
            style = TextStyle(fontSize = 20.sp, fontStyle = FontStyle.Italic)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackCompose_A_to_ZTheme {
        TextWithParams("Android")
    }
}