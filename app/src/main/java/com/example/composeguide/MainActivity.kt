package com.example.composeguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeguide.ui.theme.ComposeGuideTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//          COLUMN
//              - horizontal = Alignment
//              - vertical = Arrangement
            Column(
                Modifier
//                    .fillMaxSize() // Fills all possible spaces
                    .width(200.dp) // Set Width Manually
                    .height(200.dp) // Set Height Manually
                    .background(Color.Green), // Set Background
                horizontalAlignment = Alignment.CenterHorizontally, // x-axis
//                verticalArrangement = Arrangement.Center // y-axis - Place on the center of the screen
//                verticalArrangement = Arrangement.SpaceBetween // y-axis - Max space between components
//                verticalArrangement = Arrangement.SpaceEvenly // y-axis - Even space between each components
                verticalArrangement = Arrangement.SpaceAround // y-axis - Same Space between components but only half the space on outside
//          ROW
//              - horizontal = Arrangement
//              - vertical = Alignment
//            Row(
//               Modifier
//                   .fillMaxSize()
//                   .background(Color.Red),
//                horizontalArrangement = Arrangement.SpaceAround, // x-axis
//                verticalAlignment = Alignment.CenterVertically // y-axis
            ) {
                Text(text = "Hello")
                Text(text = "World")
            }
        }
    }
}