package com.example.alertrix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.alertrix.ui.theme.AlertrixTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlertrixTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AlertrixApp()
                }
            }
        }
    }
}

@Composable
fun AlertrixApp() {
    Text(text = "Welcome to Alertrix!")
}

@Preview(showBackground = true)
@Composable
fun AlertrixAppPreview() {
    AlertrixTheme {
        AlertrixApp()
    }
}