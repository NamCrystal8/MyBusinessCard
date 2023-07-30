package com.example.businesscardwithandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardwithandroid.ui.theme.BusinessCardWithAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardWithAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(68, 70, 84)
                ) {
                    MyBusinessCard()
                }
            }
        }
    }
}

@Composable
fun MyBusinessCard() {
    val main_img = painterResource(id = R.drawable.shiroko)
    val callIcon = rememberVectorPainter(image = Icons.Filled.Call)
    val emailIcon = rememberVectorPainter(image = Icons.Filled.Email)
    val addressIcon = rememberVectorPainter(image = Icons.Filled.LocationOn)

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(Modifier.weight(2f), verticalArrangement = Arrangement.Center) {

            Image(
                painter = main_img, contentDescription = "main image",
                modifier = Modifier
                    .size(150.dp)
                    .align(CenterHorizontally)
            )

            Text(
                text = stringResource(R.string.name),
                color = Color(90, 226, 230),
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(CenterHorizontally),
                textAlign = TextAlign.Center
            )
            Text(
                text = stringResource(R.string.job),
                color = Color(90, 226, 230),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                modifier = Modifier.align(CenterHorizontally),
                textAlign = TextAlign.Center

            )
        }

        Column(Modifier.weight(1f)) {
            Row() {
                Icon(
                    painter = callIcon, contentDescription = "call icon",
                    tint = Color(90, 226, 230),
                    modifier = Modifier.padding(top = 18.dp)
                )
                Text(
                    text = stringResource(R.string.phone_number),
                    color = Color(90, 226, 230),
                    fontSize = 20.sp,
                    modifier = Modifier.padding(16.dp),
                    textAlign = TextAlign.Center
                )
            }
            Row() {
                Icon(
                    painter = emailIcon, contentDescription = "email icon",
                    tint = Color(90, 226, 230),
                    modifier = Modifier.padding(top = 18.dp)
                )
                Text(
                    text = stringResource(R.string.email),
                    color = Color(90, 226, 230),
                    fontSize = 20.sp,
                    modifier = Modifier.padding(16.dp),
                    textAlign = TextAlign.Center
                )
            }
            Row() {
                Icon(
                    painter = addressIcon, contentDescription = "address icon",
                    tint = Color(90, 226, 230),
                    modifier = Modifier.padding(top = 18.dp)
                )
                Text(
                    text = "Đà Nẵng",
                    color = Color(90, 226, 230),
                    fontSize = 20.sp,
                    modifier = Modifier.padding(16.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardWithAndroidTheme {
        MyBusinessCard()
    }
}