package com.example.composetrial

import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.material.TopAppBar
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.composetrial.ui.ComposeTrialTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ComposeTrialTheme {
//                Greeting("Tijo")
//            }
            MyApp()
        }
    }


}

@Preview
@Composable
fun MyApp() {
    MaterialTheme
        Column() {
            TopAppBar(title = {
                Text(text = "I AM THE TITLE", modifier = Gravity.CENTER),

            }, backgroundColor = Color.Black, contentColor = Color.White)
            Text("HELLO WOLRD")
            Text(text = "FROM TIJO")
            
            Button(onClick = {}) {
                Text(text = "CLICK ME")
            }
        }
    }


@Composable
fun Greeting(name: String) {
    Surface(color = Color.Yellow) {
        Text(text = "Hello $name!", modifier = Modifier.padding(14.dp), style = TextStyle(color = Color.Red))
    }

}
