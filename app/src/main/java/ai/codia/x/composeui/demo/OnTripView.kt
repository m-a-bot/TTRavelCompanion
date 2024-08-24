package ai.codia.x.composeui.demo

import ai.codia.x.composeui.demo.ui.theme.CodiaDemoComposeUITheme
import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Created by codia-figma
 */

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun OnTripView(navController: NavHostController?) {

    // Box-196:512-6 Запрос
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xffffffff), RoundedCornerShape(40.dp))
            .height(844.dp)
            .clip(RoundedCornerShape(40.dp)),
    ) {


        // Image-196:522-map1 2
        Image(
            painter = painterResource(id = R.drawable.image2_196522),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 10.dp, y = 75.dp)
                .size(390.dp, 500.dp),
        )
        // Image-196:527-Иконка
        Image(
            painter = painterResource(id = R.drawable.image3_196527),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 70.dp, y = 509.dp)
                .size(25.dp, 25.dp),
        )
        // Image-196:530-Иконка
        Image(
            painter = painterResource(id = R.drawable.image4_196530),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 142.dp, y = 529.dp)
                .size(25.dp, 25.dp),
        )
        // Image-196:533-Иконка
        Image(
            painter = painterResource(id = R.drawable.image5_196533),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 316.dp, y = 422.dp)
                .size(25.dp, 25.dp),
        )
        // Text-196:536-Максим
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 96.dp, y = 514.dp)
                .size(47.dp, 17.dp),
            text = "Максим",
            color = Color(0xff000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:537-Данис
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 171.dp, y = 532.dp)
                .size(47.dp, 17.dp),
            text = "Данис",
            color = Color(0xff000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:538-Катя
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 345.dp, y = 426.dp)
                .size(47.dp, 17.dp),
            text = "Катя",
            color = Color(0xff000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Empty-196:539-Rectangle 36
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 10.dp, y = 422.dp)
                .background(Color(0xffffffff), RoundedCornerShape(26.dp))
                .size(393.dp, 367.dp),
        )
        // Empty-196:540-Line 14
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 119.dp, y = 439.dp)
                .size(186.003.dp, 1.dp)
                .border(2.dp, Color(0xff000000)),
        )
        // Text-196:541-Максим
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 76.dp, y = 503.dp)
                .width(136.dp),
            text = "Максим",
            color = Color(0xaf000000),
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-196:542-user-profile-circle
        Image(
            painter = painterResource(id = R.drawable.image6_196542),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 28.dp, y = 498.dp)
                .size(32.dp, 32.dp),
        )
        // Text-196:543-Ближайший водитель
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 29.dp, y = 458.dp)
                .size(245.dp, 32.dp),
            text = "Водитель",
            color = Color(0xff000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        Box(
        )
        {
            BottomBar(navController)
        }
        // Empty-196:552-Rectangle 39
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 95.dp, y = 622.dp)
                .background(Color(0x00b44242))
                .size(214.dp, 20.dp),
        )
        // Text-196:554-Ваша заявка отправленаЖдем ответ...
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
//                .layoutId("text1")
                .offset(x = 62.dp, y = 630.dp),
            text = "В пути ...",
            color = Color(0xff000000),
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )


        Button(onClick = {
            navController?.navigate(
                ScreenListOfPeople(
                    1, 1
                )
            )
        },
            modifier = Modifier
                .offset(135.dp, 700.dp)
                .padding(0.dp)
                .layoutId("button1")
                .size(150.dp, 30.dp),
            contentPadding = PaddingValues(0.dp),
            border = BorderStroke(1.dp, Color.Magenta),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            ),

            ) {
            Text(
                modifier = Modifier
                    .wrapContentSize()
                    .offset(x = 0.dp, y = 0.dp),
                text = "...",
                color = Color.Magenta,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
        }

        // Text-196:556-Отменить

        // Empty-196:557-Line 16
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 13.dp, y = 764.dp)
                .size(390.dp, 1.dp)
                .border(1.dp, Color(0x42000000)),
        )
        // Empty-196:558-6 delimeter
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 10.dp, y = 611.dp)
                .size(390.dp, 1.dp)
                .border(1.dp, Color(0x42000000)),
        )
        // Text-196:559-Казань,ул. Кремлевская 35
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 29.dp, y = 549.dp)
                .size(180.dp, 64.dp),
            text = "Казань,\nул. Кремлевская 35",
            color = Color(0x91000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )

        Image(
            painter = painterResource(id = R.drawable.image4_14310),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 20.dp, y = 565.dp)
                .fillMaxWidth()
                .height(21.dp),
        )

        // Text-196:561-Буинск,ул. Ефремова 123
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 257.dp, y = 549.dp)
                .size(180.dp, 64.dp),
            text = "Буинск,\nул. Ефремова 123",
            color = Color(0x91000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:562-543 м
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 275.dp, y = 480.dp)
                .width(116.dp),
            text = "Прошло 1 ч.\nОсталось 6 ч.",
            color = Color(0xaa000000),
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-196:891-search-01
        Image(
            painter = painterResource(id = R.drawable.image11_196891),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 18.dp, y = 28.dp)
                .size(30.dp, 30.dp),
        )
        // Image-196:892-marker-02
        Image(
            painter = painterResource(id = R.drawable.image12_196892),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 341.dp, y = 28.dp)
                .size(30.dp, 30.dp),
        )
        // Empty-196:893-Rectangle 43
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 81.dp, y = 24.dp)
                .background(Color(0xd3d9d9d9), RoundedCornerShape(5.dp))
                .size(233.dp, 34.dp),
        )
        // Empty-196:894-Rectangle 44
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 195.dp, y = 26.dp)
                .background(Color(0xffffffff), RoundedCornerShape(5.dp))
                .size(117.dp, 30.dp),
        )
        // Text-196:895-Список
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 108.dp, y = 31.dp)
                .size(80.dp, 23.dp),
            text = "Список",
            color = Color(0x87000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:896-Карта
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 229.dp, y = 31.dp),
            text = "Карта",
            color = Color(0x87000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
    }

    var showWindow by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()

    scope.launch {
        delay(1800L) // Задержка в миллисекундах (3000 = 3 секунды)
        navController?.navigate(ScreenDriversResponse)
    }

}

@Preview(showBackground = true)
@Composable
fun OnTripViewPreview() {
    CodiaDemoComposeUITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                OnTripView(null)
            }
        }
    }
}
