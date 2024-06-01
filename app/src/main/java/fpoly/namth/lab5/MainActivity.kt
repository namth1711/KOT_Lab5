package fpoly.namth.lab5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fpoly.namth.lab5.Home
import fpoly.namth.lab5.LoginApp

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                val navControl = rememberNavController()
                NavHost(navController = navControl,
                    startDestination = "home"
                ){
                    composable("home"){
                        Home(navControl)
                    }
                    composable("bai1"){
                        LoginApp()
                    }
                    composable("bai2"){
                        LightSwitch()
                    }
                    composable("bai3"){
                        CategoryApp()
                    }

                }
            }
        }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}