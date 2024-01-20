package com.example.learningcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Screen()
        }
    }
}

@Composable
fun Screen() {
    Column {
        ShowColumn()
        ShowRow()
    }
}


@Composable
fun ShowRow() {
    Row(
        modifier = Modifier
            .background(
                Color.Green
            )
            .fillMaxSize(
                0.5f
            ),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Line 1")
        Text(text = "Line 2")
        Text(text = "Line 3")
    }
}

@Composable
fun ShowColumn() {
    Column(
        modifier = Modifier
            .background(
                Color.Green
            )
            .width(200.dp)
            .height(400.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Line 1")
        Text(text = "Line 2")
        Text(text = "Line 3")
    }
}

@Preview
@Composable
fun ShowColumnPreview() {
    ShowColumn()
}

@Preview
@Composable
fun ShowRowPreview() {
    ShowRow()
}

@Preview
@Composable
fun ShowScreenPreview() {
    Screen()
}