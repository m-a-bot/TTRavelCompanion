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
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Created by codia-figma
 */
@SuppressLint("CoroutineCreationDuringComposition")
@OptIn(DelicateCoroutinesApi::class)
@Composable
fun DriverResponseView(navController: NavHostController?) {
    // Box-196:563-7 Ответ
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffffffff), RoundedCornerShape(40.dp))
            .size(390.dp, 844.dp)
            .clip(RoundedCornerShape(40.dp)),
    ) {

        // Image-196:566-map1 2
        Image(
            painter = painterResource(id = R.drawable.image1_196566),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 10.dp, y = 75.dp)
                .size(390.dp, 500.dp),
        )
        // Image-196:578-Иконка
        Image(
            painter = painterResource(id = R.drawable.image2_196578),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 70.dp, y = 509.dp)
                .size(25.dp, 25.dp),
        )
        // Image-196:581-Иконка
        Image(
            painter = painterResource(id = R.drawable.image3_196581),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 142.dp, y = 529.dp)
                .size(25.dp, 25.dp),
        )
        // Text-196:584-Максим
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
        // Text-196:585-Данис
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
        // Empty-196:586-Rectangle 36
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 10.dp, y = 457.dp)
                .background(Color(0xffffffff), RoundedCornerShape(26.dp))
                .size(393.dp, 332.dp),
        )
        // Text-196:587-ул. Кремлевская 35
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 38.dp, y = 579.dp)
                .size(245.dp, 32.dp),
            text = "ул. Кремлевская 35",
            color = Color(0x91000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:588-543 м
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 215.dp, y = 537.dp)
                .width(116.dp),
            text = "543 м",
            color = Color(0xaa000000),
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Empty-196:589-Line 14
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 112.dp, y = 475.dp)
                .size(186.003.dp, 1.dp)
                .border(2.dp, Color(0xff000000)),
        )
        // Text-196:590-Максим
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 86.dp, y = 537.dp)
                .width(136.dp),
            text = "Максим",
            color = Color(0xaf000000),
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-196:591-user-profile-circle
        Image(
            painter = painterResource(id = R.drawable.image4_196591),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 38.dp, y = 538.dp)
                .size(32.dp, 32.dp),
        )
        // Text-196:592-Ближайший водитель
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 39.dp, y = 498.dp)
                .size(245.dp, 32.dp),
            text = "Ближайший водитель",
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
        // Empty-196:601-Rectangle 39
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 95.dp, y = 622.dp)
                .background(Color(0x00b44242))
                .size(214.dp, 20.dp),
        )
        // Text-196:603-Водитель спешит к Вам
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 70.dp, y = 651.dp),
            text = "Водитель спешит к Вам",
            color = Color(0xff000000),
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Box-196:604-7 cancel with red text

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
            border = BorderStroke(1.dp, Color.Gray),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            ),

            ) {
            Text(
                modifier = Modifier
                    .wrapContentSize()
                    .offset(x = 0.dp, y = 0.dp),
                text = "Отменить",
                color = Color.Gray,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
        }

        // Empty-196:607-Line 16
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 13.dp, y = 764.dp)
                .size(390.dp, 1.dp)
                .border(1.dp, Color(0x42000000)),
        )
        // Empty-196:608-7 delimeter
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 10.dp, y = 611.dp)
                .size(390.dp, 1.dp)
                .border(1.dp, Color(0x42000000)),
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
        navController?.navigate(ScreenEndOfTrip)
    }
}

@Preview(showBackground = true)
@Composable
fun DriverResponseViewPreview() {
    CodiaDemoComposeUITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                DriverResponseView(null)
            }
        }
    }
}
