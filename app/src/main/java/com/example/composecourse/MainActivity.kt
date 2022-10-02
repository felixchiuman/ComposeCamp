package com.example.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.graphics.Color
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecourse.ui.theme.ComposeCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCourseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    ComposeQuadrantApp()
                    /*TaskManager()*/
                    /*ComposeArticle()*/
                    /*BirthdayGreetingWithImage(message = getString(R.string.hbd_text), from = getString(
                                            R.string.signature_text))*/
                }
            }
        }
    }
}
//practice compose basic

@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(R.string.first_title),
                description = stringResource(R.string.first_description),
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.second_title),
                description = stringResource(R.string.second_description),
                backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(R.string.third_title),
                description = stringResource(R.string.third_description),
                backgroundColor = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.fourth_title),
                description = stringResource(R.string.fourth_description),
                backgroundColor = Color.LightGray,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview
@Composable
fun ComposableCardInfo() {
    ComposeCourseTheme() {
        ComposableInfoCard(
            title = stringResource(R.string.fourth_title),
            description = stringResource(R.string.fourth_description),
            backgroundColor = Color.LightGray)
    }
}
@Preview(showBackground = true)
@Composable
fun ComposeQuadrantAppPreview() {
    ComposeCourseTheme() {
        ComposeQuadrantApp()
    }
}

//Task manager
/*@Composable
fun TaskManager(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxWidth()
        .fillMaxHeight(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center) {
        val painter = painterResource(id = R.drawable.ic_task_completed)
        Image(painter = painter,
            contentDescription = null,)

        Text(text = "All tasks completed",
            fontSize = 24.sp,
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp))

        Text(text = "Nice work!", fontSize = 16.sp)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TaskManagerPreview() {
    ComposeCourseTheme {
        TaskManager()
    }
}*/

// compose article
/*
@Composable
fun ComposeArticle(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        val painter = painterResource(id = R.drawable.bg_compose_background)
        Image(painter = painter, contentDescription = null)

        Text(
            text = stringResource(R.string.title),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )

        Text(text = stringResource(R.string.first_paragraph),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Text(
            text = stringResource(id = R.string.second_paragraph),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview (showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposeCourseTheme {
        ComposeArticle()
    }
}*/

//birthday
/*
@Composable
fun BirthdayGreetingWithText(message:String, from: String) {
    Column {
        Text(
            text = message,
            fontSize = 36.sp,
            modifier = Modifier.fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = from,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp)
        )
    }
}

@Composable
fun BirthdayGreetingWithImage(message:String, from: String) {
    val image = painterResource(id = R.drawable.androidparty)
    Box (){
        Image(painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxHeight()
                .fillMaxHeight(),
             contentScale = ContentScale.Crop)
        BirthdayGreetingWithText(message = message, from = from)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeCourseTheme {
        BirthdayGreetingWithText(message = "Hbd sam", "-from emma")
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayGreetingWithImagePreview() {
    ComposeCourseTheme {
        BirthdayGreetingWithImage(message = "hbd sam", from = "-from emma")
    }
}
*/
