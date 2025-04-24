package com.example.jetpackcompose.ui.theme.Jetpackcomposables

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Row_Column_Box() {


    /*   Row(        // For Row Layout
           verticalAlignment = Alignment.CenterVertically,   // Many more Alignments and Arrangements are there , but due to the constraint , we can use only one Alignment and one Arrangement at a axis
           horizontalArrangement = Arrangement.Center,
           modifier = Modifier.fillMaxSize()

       ) {
           Text("hello 1,", color = Color.Black)
           Text("hello 2,", color = Color.Black)
           Text("hello 3", color = Color.Black)

       }*/

    /*   Column(     // For Column Layout
           horizontalAlignment = Alignment.CenterHorizontally,   // Many more Alignments and Arrangements are there , but due to the constraint , we can use only one Alignment and one Arrangement at a axis
           verticalArrangement = Arrangement.Center,
           modifier = Modifier.fillMaxSize()

       ) {
           Text("hello 1,", color = Color.Black)
           Text("hello 2,", color = Color.Black)
           Text("hello 3", color = Color.Black)

       }*/

    /* Box(modifier = Modifier  // For Box Layout
         .fillMaxSize()
         .background(Color.Cyan),
         contentAlignment = Alignment.Center // For Centering the content in the Box
     )
     {// this box will be in the center of the Screen
          Box(modifier = Modifier.height(80.dp).width(150.dp ).background(Color.Yellow)){// this box will be in the center of the parent box

               Text("Hello Dear!", modifier = Modifier.align( Alignment.Center).background(Color.LightGray))  // this text will be in the center of the box

          }
     }*/

}


@Preview
@Composable
fun Row_Column_Preview() {
    Row_Column_Box()
}