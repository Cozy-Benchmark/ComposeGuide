package com.example.composeguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeguide.ui.theme.ComposeGuideTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val painter = painterResource(id = R.drawable.kermit)
            val title = "Kermit playing in the snow"
            val description = "Kermit playing in the snow"
            Box(modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(16.dp)){
                ImageCard(
                    painter = painter,
                    contentDescription = description,
                    title = title
                )
            }
//          COLUMN
//              - horizontal = Alignment
//              - vertical = Arrangement
//            Column(
//                Modifier
////                    Order Matters - Sequential
//                    .background(Color.Green) // Set Background
////                    .fillMaxSize() // Fills all possible spaces
////                    .width(600.dp) // Set Width Manually using dp
//                    .fillMaxWidth(0.5f) // Set Max Width using float
////                    .requiredWidth(600.dp) // Forces the width to be exactly the specific width
////                    .height(300.dp) // Set Height Manually
//                    .fillMaxHeight(0.5f) // Set Max Height using float
//                    .border(5.dp, Color.Magenta) // Creates Border
//                    .padding(5.dp) // Pushes the content
////                    .padding(top = 60.dp) // Pushes the content from the top
//                    .border(5.dp, Color.Blue)
//                    .padding(5.dp)
//                    .border(10.dp, Color.Red)
//                    .padding(10.dp)
//                horizontalAlignment = Alignment.CenterHorizontally, // x-axis
//                verticalArrangement = Arrangement.Center // y-axis - Place on the center of the screen
//                verticalArrangement = Arrangement.SpaceBetween // y-axis - Max space between components
//                verticalArrangement = Arrangement.SpaceEvenly // y-axis - Even space between each components
//                verticalArrangement = Arrangement.SpaceAround // y-axis - Same Space between components but only half the space on outside
//          ROW
//              - horizontal = Arrangement
//              - vertical = Alignment
//            Row(
//               Modifier
//                   .fillMaxSize()
//                   .background(Color.Red),
//                horizontalArrangement = Arrangement.SpaceAround, // x-axis
//                verticalAlignment = Alignment.CenterVertically // y-axis
//            ) {
////                Text(
////                    text = "Hello",
////                    modifier = Modifier
////                        .border(5.dp, Color.Yellow)
////                        .padding(5.dp)
////                        .offset(
////                            20.dp,
////                            20.dp
////                        ) // Offsets the item similar to margin but does not affect other composable
////                        .border(10.dp, Color.Black)
////                        .padding(10.dp)
////                        .clickable { } // Makes the composable actionable
//////                        .scrollable() // Makes the composable scrollable
//////                        .draggable()  // Makes the composable draggable
////                )
////                Spacer(modifier = Modifier.height(50.dp)) // Creates Space
////                Text(text = "World")
//            }
        }
    }
}

@Composable
fun ImageCard (
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Box(modifier = Modifier.height(200.dp)){
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 300f
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }

        }
    }
}