package com.example.android.codelab.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.android.codelab.layout.ui.compose.LayoutsCodelab
import com.example.android.codelab.layout.ui.compose.ScrollingList
import com.example.android.codelab.layout.ui.theme.LayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutTheme {
//                Greeting("Android")
//                ScrollingList()
                LayoutsCodelab()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LayoutTheme {
        Greeting("Android")
    }
}