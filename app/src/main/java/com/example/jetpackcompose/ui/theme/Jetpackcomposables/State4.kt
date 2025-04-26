package com.example.jetpackcompose.ui.theme.Jetpackcomposables

import android.R.attr.color
import android.R.attr.name
import android.R.attr.textStyle
import android.R.color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.DividerDefaults.color
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SnackbarDefaults.color
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Hello(name: String = "", customColor: Color = Color.Gray) {
    Text(
        text = "Hello, $name",
        color = (customColor),
        style = TextStyle(fontSize = 30.sp, fontStyle = Italic)
    )
}


@Composable
fun StateTestScreen() {

    var name by  remember {   // created state value for recomposing UI on value or state change
        mutableStateOf("")
    }


    var color by remember {
        mutableStateOf(Color.Black)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        if (name.isNotBlank())
            Hello(name, color)
        else Hello("Guest")

        OutlinedTextField(
            value = name,
            onValueChange = {
                name = it
                color = Color.Black
            },
            label = {
                Text(text = "Enter your name ")
            },
            singleLine = true
        )

    }

}