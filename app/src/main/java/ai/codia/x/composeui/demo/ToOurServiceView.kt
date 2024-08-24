package ai.codia.x.composeui.demo

import ai.codia.x.composeui.demo.ui.theme.CodiaDemoComposeUITheme
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
import androidx.navigation.NavController
import androidx.navigation.NavHostController

/**
 * Created by codia-figma
 */
@Composable
fun ToOurServiceView(navController: NavHostController?) {
    // Box-196:422-9 Переход на наш сервис

    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffffffff), RoundedCornerShape(40.dp))
            .size(390.dp, 844.dp)
            .clip(RoundedCornerShape(40.dp)),
    ) {

        // Image-196:423-9 zabota service
        Image(
            painter = painterResource(id = R.drawable.image1_196423),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 23.dp, y = 592.dp)
                .size(360.dp, 70.dp),
        )
        Box(
        )
        {
            BottomBar(navController)
        }
//        // Empty-196:424-Rectangle 1
//        Box(
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .offset(x = -18.dp, y = 764.dp)
//                .background(Color(0x00d9d9d9))
//                .size(422.dp, 80.dp)
//        )
//        // Image-196:425-wallet-02
//        Image(
//            painter = painterResource(id = R.drawable.image2_196425),
//            contentDescription = null,
//            contentScale = ContentScale.Fit,
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .offset(x = 144.dp, y = 772.dp)
//                .size(35.dp, 29.dp),
//        )
//        // Image-196:426-Icon
//        Image(
//            painter = painterResource(id = R.drawable.image3_196426),
//            contentDescription = null,
//            contentScale = ContentScale.Fit,
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .offset(x = 235.dp, y = 775.dp)
//                .size(35.dp, 29.dp)
//        )
//        // Image-196:427-user-profile-circle
//        Image(
//            painter = painterResource(id = R.drawable.image4_196427),
//            contentDescription = null,
//            contentScale = ContentScale.Fit,
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .offset(x = 53.dp, y = 770.dp)
//                .size(35.dp, 35.dp),
//        )
//        // Image-196:428-message-alert-circle
//        Image(
//            painter = painterResource(id = R.drawable.image5_196428),
//            contentDescription = null,
//            contentScale = ContentScale.Fit,
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .offset(x = 326.dp, y = 771.dp)
//                .size(35.dp, 33.939.dp),
//        )
//        // Text-196:429-Главная
//        Text(
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .wrapContentSize()
//                .offset(x = 47.dp, y = 805.dp),
//            text = "Главная",
//            color = Color(0xbc000000),
//            fontSize = 12.sp,
//            fontWeight = FontWeight.Normal,
//            textAlign = TextAlign.Center,
//            overflow = TextOverflow.Ellipsis,
//        )
//        // Text-196:430-Платежи
//        Text(
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .wrapContentSize()
//                .offset(x = 136.dp, y = 805.dp),
//            text = "Платежи",
//            color = Color(0xbc000000),
//            fontSize = 12.sp,
//            fontWeight = FontWeight.Normal,
//            textAlign = TextAlign.Center,
//            overflow = TextOverflow.Ellipsis,
//        )
//        // Text-196:431-Акции
//        Text(
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .wrapContentSize()
//                .offset(x = 235.dp, y = 805.dp),
//            text = "Акции",
//            color = Color(0xbc000000),
//            fontSize = 12.sp,
//            fontWeight = FontWeight.Normal,
//            textAlign = TextAlign.Center,
//            overflow = TextOverflow.Ellipsis,
//        )
//        // Text-196:432-Новости
//        Text(
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .wrapContentSize()
//                .offset(x = 319.dp, y = 805.dp),
//            text = "Новости",
//            color = Color(0xbc000000),
//            fontSize = 12.sp,
//            fontWeight = FontWeight.Normal,
//            textAlign = TextAlign.Center,
//            overflow = TextOverflow.Ellipsis,
//        )
        // Text-196:433-Алия
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = -16.dp, y = 18.dp)
                .size(128.dp, 35.dp),
            text = "Алия",
            color = Color(0xff000000),
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:434-Мои карты
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 7.dp, y = 87.dp)
                .size(150.dp, 35.dp),
            text = "Мои карты",
            color = Color(0xff000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:435-Детские карты
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 15.dp, y = 231.dp)
                .size(170.dp, 35.dp),
            text = "Детские карты",
            color = Color(0xff000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:436-Сервисы
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 23.dp, y = 464.dp)
                .size(95.dp, 45.dp),
            text = "Сервисы",
            color = Color(0xff000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-196:437-Setting
        Image(
            painter = painterResource(id = R.drawable.image6_196437),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 342.dp, y = 18.dp)
                .size(35.dp, 35.dp),
        )
        // Box-196:438-Group 1
        Button(

                onClick = {
                    /*ToDo*/
                    navController?.navigate(ScreenPassengerView(
                        34
                    ))
                },
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 75.125.dp, y = 486.679.dp)
                .size(290.875.dp, 77.665.dp)
            ,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,  // Цвет фона

            )
        ) {
            Box(
                contentAlignment = Alignment.TopStart

            ) {
                // Text-196:439-TTRavel Companion
                Text(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .size(280.875.dp, 24.332.dp),
                    text = "TTRavel",
                    color = Color(0xba000000),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left,
                    overflow = TextOverflow.Ellipsis,
                )
                // Text-196:440-Описание
                Text(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(x = 0.dp, y = 32.076.dp)
                        .size(172.262.dp, 20.589.dp),
                    text = "Поиск попутчиков",
                    color = Color(0xff8d8d8d),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Left,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        // Image-196:441-9 obrkarta service
        Image(
            painter = painterResource(id = R.drawable.image7_196441),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 20.dp, y = 678.dp)
                .size(315.dp, 70.dp),
        )
        // Image-196:442-9 children cards
        Image(
            painter = painterResource(id = R.drawable.image8_196442),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 23.dp, y = 272.dp)
                .size(263.dp, 167.dp),
        )
        // Image-196:443-9 my cards
        Image(
            painter = painterResource(id = R.drawable.image9_196443),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 20.dp, y = 130.dp)
                .size(269.dp, 77.dp),
        )
        // Image-196:445-9 ttr logo
        Image(
            painter = painterResource(id = R.drawable.image10_196445),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 23.dp, y = 516.dp)
                .size(52.dp, 52.dp),
        )


    }
}

@Preview(showBackground = true)
@Composable
fun ToOurServiceViewPreview() {
    CodiaDemoComposeUITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                ToOurServiceView(null)
            }
        }
    }
}

@Composable
fun BottomBar(navController: NavHostController?) {
    Box(
        modifier = Modifier
            .background(Color(0x00d9d9d9))
            .size(422.dp, 80.dp)
    ) {
        // Image-196:425-wallet-02
        Image(
            painter = painterResource(id = R.drawable.image2_196425),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 144.dp, y = 772.dp)
                .size(35.dp, 29.dp),
        )


        // Image-196:426-Icon
        Image(
            painter = painterResource(id = R.drawable.image3_196426),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 235.dp, y = 775.dp)
                .size(35.dp, 29.dp)
        )
        Button(
            onClick = {
                navController?.navigate(ScreenA)
            },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(0.dp)
                .align(Alignment.Center)
                .offset(x = 35.dp, y = 770.dp)
                .size(70.dp, 55.dp),
            contentPadding = PaddingValues(0.dp),
            shape = RoundedCornerShape(0),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            )
        ) {
            Column {
            // Image-196:427-user-profile-circle
                Image(
                    painter = painterResource(id = R.drawable.image4_196427),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .offset(x = 0.dp, y = 0.dp)
                        .size(35.dp, 35.dp),
                )
                // Text-196:429-Главная
                Text(
                    modifier = Modifier
                        .wrapContentSize()
                        .offset(x = (-5).dp, y = 1.dp),
                    text = "Главная",
                    color = Color(0xbc000000),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }

        // Image-196:428-message-alert-circle
        Image(
            painter = painterResource(id = R.drawable.image5_196428),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 326.dp, y = 771.dp)
                .size(35.dp, 33.939.dp),
        )

        // Text-196:430-Платежи
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 136.dp, y = 805.dp),
            text = "Платежи",
            color = Color(0xbc000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:431-Акции
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 235.dp, y = 805.dp),
            text = "Акции",
            color = Color(0xbc000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:432-Новости
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 319.dp, y = 805.dp),
            text = "Новости",
            color = Color(0xbc000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
    }
}
