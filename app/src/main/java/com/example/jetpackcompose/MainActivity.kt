package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import com.example.jetpackcompose.ui.theme.Jetpackcomposables.LearnText_and_Modifiers
import com.example.jetpackcompose.ui.theme.Jetpackcomposables.Learn_Modifiers

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        installSplashScreen()  //installSplashScreen(): Initializes and shows the splash screen when the app starts, handling display and animation.Note : it don't need to be call explicitly after android 12 version , unless in the AndroidManifest.xml file the line
        //android:theme="@style/Theme.MySplashScreen" is not removed from <application></application> tag
        //With installSplashScreen(): You can customize the behavior (e.g., control the duration, add animations, etc.) if needed.
        setContent {

            /*JetpackComposeTheme {
                LearnText_and_Modifiers()
                Greeting(", Welcome Ji")
                 }*/// one out of this topic knowledge : for displaying multiple UI elements from the two separate function they should not be called in this way, otherwise the last called composable function will overlap all the previously called composable function
            // as the solution for displaying multiple UI function we will place them in any suitable layout like Row(){} or Column(){}, these layout helps in arranging the UI elements in a row or column sequentially as they are defined

            JetpackComposeTheme {
                Column(
                    modifier = Modifier
                        .background(Color.Blue)

                ) { // The correct way to do so !
                    LearnText_and_Modifiers()
                    Greeting(", Welcome Ji, I am by default text ")
                    Learn_Modifiers()
                }
            }
        }

    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .height(100.dp)
            .background(Color.Green),

        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        Greeting("Android")
    }
}