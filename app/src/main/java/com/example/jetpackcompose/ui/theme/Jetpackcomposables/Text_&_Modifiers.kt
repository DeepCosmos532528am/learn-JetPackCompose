package com.example.jetpackcompose.ui.theme.Jetpackcomposables


import android.R.attr.onClick
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import androidx.compose.ui.res.stringResource
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.SemanticsActions.OnClick
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.text.style.TextAlign
import com.example.jetpackcompose.MainActivity
import com.example.jetpackcompose.R
import com.example.jetpackcompose.R.string


//Text
@Composable
fun LearnText_and_Modifiers(name: String = "Sachin") {
    Box(            // Box is layout, will study further in future.
        modifier = Modifier
            .height(500.dp)
            .width(180.dp)  // # If the parent don't have size then it will depend upon the child's size , but if it have then strictly it will not depend on the child size, even if the child have size more or less then the parent , means if we don't apply a the elements like height or width in parent then the size of the Size of the parent will depend upon the size of the child ,
            // (to see this ,remove width* or height or both from the parent like Box here, and start changing the width of the child like text is the child here ,  to see the effect )
            // , this happens because the we have not given the parent its size so it grows and sink , ad teh child do , but when we give it this all , parent's changes will then no longer depend upon the child, no any changes will be visible to the parent then .
            .background(Color.Yellow),
        contentAlignment = Alignment.Center
    ) {
        Text(
            // Text composable with modifier and other styling elements for styling
            text = "Hello $name",
            color = Color.Red,
            fontFamily = FontFamily.Cursive,
            fontSize = 32.sp, // always remember to give .sp unit here, not .dp
            letterSpacing = 5.sp,
            modifier = Modifier
                .height(20.dp)
                .width(140.dp)
                .background(Color.Cyan)
                .padding(60.dp),
            fontStyle = Italic,

            )

        Text(text = stringResource(id = R.string.developer_intro)) // Can create our text also in the string resource file and use here
    }
}

// Modifiers
@Composable
fun Learn_Modifiers() {
    var clicked by remember { mutableStateOf(false) }

    Text(
        text = if (clicked) "Yeah.. you done this!!" else "Hello World!",
        color = Color.Red,
        fontSize = 22.sp,
        fontStyle = Italic,
        modifier = Modifier
            .padding(22.dp)
            .background(Color.Gray)
            .clickable {
                clicked = !clicked
            } // using modifiers for making text clickable and changing the text.  Toggle on each click
    )
}

@Preview(showSystemUi = true, showBackground = true, name = "Text")
@Composable
fun ShowPreview() {
    JetpackComposeTheme {
        LearnText_and_Modifiers()
        Learn_Modifiers()
    }
}