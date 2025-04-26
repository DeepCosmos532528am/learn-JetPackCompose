package com.example.jetpackcompose.ui.theme.Jetpackcomposables

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R

// For Button example I have take the Toast to display on click of the button , you can take anything you want like Text() or Image(),
// As I am displaying the Toast() it takes teh parameters Toast(context, message, duration), context means on which screen the toast to be displayed ,
//message means , the message that to be displayed with the toast , and the duration is the duration to of toast to be displayed
@Composable
fun Learn_Button() {
    val context = LocalContext.current.applicationContext
    Button(
        onClick = { Toast.makeText(context, "Downloading...", Toast.LENGTH_SHORT).show() },
        enabled = true, // Helps in enabling and disabling the button on certain conditions like all details in the form is filled or not
        shape = RoundedCornerShape(
            12.dp,
            1.dp,
            12.dp,
            1.dp
        ), // Explore more shapes like CircleShape, RectangleShape, RoundedCornerShape()
        colors = ButtonDefaults.buttonColors(
            //button Colors only have these for parameters, and this is the way to give colors to the button
            containerColor = Color.Blue,  //sets the colour of button
            contentColor = Color.Yellow,  //sets the colour of text inside the button
            disabledContainerColor = Color.LightGray, //sets the colour of button when it is disabled
            disabledContentColor = Color.Black,  //sets the colour of text inside the button when it is disabled
        )

    ) {
        Text(text = "Download") // Text inside the button
    }
}


@Composable
fun Learn_Image() {
    Image(
        painter = painterResource(id = R.drawable.daco),
        contentDescription = "Image",
        modifier = Modifier.border(color = Color.Black, width = 2.dp, shape = CircleShape)
    )
}

@Composable
fun Image_Button_UI() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Learn_Image()
        Learn_Button()
    }

}

@Preview
@Composable
fun ButtonAndImage_Preview() {
    Learn_Button()
    Learn_Image()
}

