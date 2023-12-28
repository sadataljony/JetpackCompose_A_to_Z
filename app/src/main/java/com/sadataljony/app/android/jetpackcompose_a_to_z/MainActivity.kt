package com.sadataljony.app.android.jetpackcompose_a_to_z

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
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
                    SimpleCheckboxComponent()
                }
            }
        }
    }
}

@Composable
fun SimpleCheckboxComponent() {
    val cbSunday = remember { mutableStateOf(false) }
    val cbMonday = remember { mutableStateOf(false) }
    val cbTuesday = remember { mutableStateOf(false) }
    val cbWednesday = remember { mutableStateOf(false) }
    val cbThursday = remember { mutableStateOf(false) }
    val cbFriday = remember { mutableStateOf(false) }
    val cbSaturday = remember { mutableStateOf(false) }
    Column {
        Text(text = "Select the working days")
        Row {
            Checkbox(
                // below line we are setting
                // the state of checkbox.
                checked = cbSunday.value,
                // below line is use to add padding
                // to our checkbox.
                modifier = Modifier.padding(16.dp),
                // below line is use to add on check
                // change to our checkbox.
                onCheckedChange = { cbSunday.value = it },
            )
            // below line is use to add text to our check box and we are
            // adding padding to our text of checkbox
            Text(text = "Sunday", modifier = Modifier.padding(16.dp))
        }
        Row {
            Checkbox(
                // below line we are setting
                // the state of checkbox.
                checked = cbMonday.value,
                // below line is use to add padding
                // to our checkbox.
                modifier = Modifier.padding(16.dp),
                // below line is use to add on check
                // change to our checkbox.
                onCheckedChange = { cbMonday.value = it },
            )
            // below line is use to add text to our check box and we are
            // adding padding to our text of checkbox
            Text(text = "Monday", modifier = Modifier.padding(16.dp))
        }
        Row {
            Checkbox(
                // below line we are setting
                // the state of checkbox.
                checked = cbTuesday.value,
                // below line is use to add padding
                // to our checkbox.
                modifier = Modifier.padding(16.dp),
                // below line is use to add on check
                // change to our checkbox.
                onCheckedChange = { cbTuesday.value = it },
            )
            // below line is use to add text to our check box and we are
            // adding padding to our text of checkbox
            Text(text = "Tuesday", modifier = Modifier.padding(16.dp))
        }
        Row {
            Checkbox(
                // below line we are setting
                // the state of checkbox.
                checked = cbWednesday.value,
                // below line is use to add padding
                // to our checkbox.
                modifier = Modifier.padding(16.dp),
                // below line is use to add on check
                // change to our checkbox.
                onCheckedChange = { cbWednesday.value = it },
            )
            // below line is use to add text to our check box and we are
            // adding padding to our text of checkbox
            Text(text = "Wednesday", modifier = Modifier.padding(16.dp))
        }
        Row {
            Checkbox(
                // below line we are setting
                // the state of checkbox.
                checked = cbThursday.value,
                // below line is use to add padding
                // to our checkbox.
                modifier = Modifier.padding(16.dp),
                // below line is use to add on check
                // change to our checkbox.
                onCheckedChange = { cbThursday.value = it },
            )
            // below line is use to add text to our check box and we are
            // adding padding to our text of checkbox
            Text(text = "Thursday", modifier = Modifier.padding(16.dp))
        }
        Row {
            Checkbox(
                // below line we are setting
                // the state of checkbox.
                checked = cbFriday.value,
                // below line is use to add padding
                // to our checkbox.
                modifier = Modifier.padding(16.dp),
                // below line is use to add on check
                // change to our checkbox.
                onCheckedChange = { cbFriday.value = it },
            )
            // below line is use to add text to our check box and we are
            // adding padding to our text of checkbox
            Text(text = "Friday", modifier = Modifier.padding(16.dp))
        }
        Row {
            Checkbox(
                // below line we are setting
                // the state of checkbox.
                checked = cbSaturday.value,
                // below line is use to add padding
                // to our checkbox.
                modifier = Modifier.padding(16.dp),
                // below line is use to add on check
                // change to our checkbox.
                onCheckedChange = { cbSaturday.value = it },
            )
            // below line is use to add text to our check box and we are
            // adding padding to our text of checkbox
            Text(text = "Saturday", modifier = Modifier.padding(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackCompose_A_to_ZTheme {
        SimpleCheckboxComponent()
    }
}