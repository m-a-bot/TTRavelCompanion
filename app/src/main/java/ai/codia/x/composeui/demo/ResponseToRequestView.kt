package ai.codia.x.composeui.demo

import ai.codia.x.composeui.demo.ui.theme.CodiaDemoComposeUITheme
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
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

/**
 * Created by codia-figma
 */
@Composable
fun ResponseToRequestView(navController: NavHostController?) {
    // Box-196:367-10 Ответ
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffffffff), RoundedCornerShape(40.dp))
            .size(390.dp, 844.dp)
            .clip(RoundedCornerShape(40.dp)),
    ) {

        Box(
        )
        {
            BottomBar(navController)
        }

        // Image-196:376-Setting
        Image(
            painter = painterResource(id = R.drawable.image4_196376),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 343.dp, y = 18.dp)
                .size(35.dp, 35.dp),
        )
        // Text-196:378-Максим
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 0.dp, y = 18.dp)
                .size(128.dp, 35.dp),
            text = "Максим",
            color = Color(0xff000000),
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )

        // Box-196:380-Group 1
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 97.125.dp, y = 77.dp)
                .size(249.875.dp, 48.665.dp),
        ) {
            // Text-196:381-TTRavel Companion
            Text(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .size(250.875.dp, 24.332.dp),
                text = "TTRavel Companion",
                color = Color(0xff000000),
                fontSize = 24.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left,
                overflow = TextOverflow.Ellipsis,
            )
            // Text-196:382-Описание
            Text(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 0.dp, y = 28.076.dp)
                    .size(172.262.dp, 20.589.dp),
                text = "Описание",
                color = Color(0xff8d8d8d),
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left,
                overflow = TextOverflow.Ellipsis,
            )
        }

        // Box-196:386-10 map template
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 330.dp)
                .size(326.dp, 310.dp),
        ) {
            YandexMapWithRoute()
        }
        // Box-196:392-10 accept
        Button(
            onClick = {
                navController?.navigate(ScreenAccrual)
            },
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 100.dp, y = 715.dp)
                .size(97.dp, 36.dp),
            contentPadding = PaddingValues(0.dp),
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xff34a853)
            )
        ) {
            // Empty-196:393-Rectangle 46
//            Box(
//                modifier = Modifier
//                    .align(Alignment.TopStart)
//                    .background(Color(0xff34a853), RoundedCornerShape(5.dp))
//                    .size(97.dp, 35.dp),
//            )
            // Text-196:394-Помочь
            Text(
                modifier = Modifier
                    .offset(x = 0.dp, y = 5.dp)
                    .size(85.dp, 35.dp),
                text = "Принять",
                color = Color(0xff000000),
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
        }
        // Box-196:395-10 cancel
        Button(
            onClick = {
                navController?.navigate(ScreenA)
            },
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 210.dp, y = 715.dp)
                .size(97.dp, 35.dp),
            contentPadding = PaddingValues(0.dp),
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xff34a853)
            )
        ) {
            // Empty-196:396-Rectangle 47
//            Box(
//                modifier = Modifier
//                    .align(Alignment.TopStart)
//                    .background(Color(0xffd9d9d9), RoundedCornerShape(5.dp))
//                    .size(97.dp, 35.dp),
//            )
            // Text-196:397-Отклонить
            Text(
                modifier = Modifier
                    .offset(x = 0.dp, y = 5.dp)
                    .size(85.dp, 35.dp),
                text = "Отклонить",
                color = Color(0xff000000),
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
        }
        // Text-196:398-Пользователь Алия ...
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 70.dp, y = 140.dp)
                .size(269.dp, 35.dp),
            text = "Пользователь Алия \n...",
            color = Color(0xff000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:399-Дата отправки - 08.08.2024 17:04
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 72.dp, y = 645.dp)
                .size(269.dp, 35.dp),
            text = "Дата отправки - 08.08.2024 17:04",
            color = Color(0xff000000),
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:400-Длинное описание (можно сделать заготовки для пользователя, которому требуется помощь)
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 175.dp)
                .size(327.dp, 100.dp),
            text = "Пункт отправления\nПункт назначения",
            color = Color(0xff8d8d8d),
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:401-Статус - ...
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 100.dp, y = 680.dp)
                .size(214.dp, 29.dp),
            text = "Статус - ...",
            color = Color(0xff8d8d8d),
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-196:402-10 User
        Image(
            painter = painterResource(id = R.drawable.image6_196402),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 275.dp)
                .size(45.dp, 45.dp),
        )
        // Text-196:403-Алия
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 89.dp, y = 284.dp)
                .size(73.dp, 35.dp),
            text = "Алия",
            color = Color(0xff000000),
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-196:404-10 ttr logo
        Image(
            painter = painterResource(id = R.drawable.image7_196404),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 26.dp, y = 75.dp)
                .size(52.dp, 52.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ResponseToRequestViewPreview() {
    CodiaDemoComposeUITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                ResponseToRequestView(null)
            }
        }
    }
}
