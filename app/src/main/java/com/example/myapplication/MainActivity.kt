package com.example.myapplication

import android.os.Bundle
import android.view.Display.Mode
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    JetComposeTutorial()
                }
            }
        }
    }
}

@Composable
fun JetComposeTutorial(modifier: Modifier = Modifier)
{
    val image = painterResource(R.drawable.bg_compose_background)
    Column(modifier = modifier){
        Image(
            painter = image,
            contentDescription = null,
            )
        Text(
            text = stringResource(R.string.jetpack_compose_tutorial),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.what_is_jet_compose),
            Modifier.padding(16.dp)
            )
        Text(
            text = stringResource(R.string.jet_compose_tutorial),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )

    }

}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name  = "Jet Compose Tutorial"
)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        JetComposeTutorial()
    }
}
