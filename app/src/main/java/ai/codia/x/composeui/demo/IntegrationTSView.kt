package ai.codia.x.composeui.demo

import ai.codia.x.composeui.demo.ui.theme.CodiaDemoComposeUITheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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


@Composable
fun IntegrationTSView() {
    // Box-301:328-8 Подсказка достроения
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xffffffff), RoundedCornerShape(40.dp))
            .height(844.dp)
            .clip(RoundedCornerShape(40.dp)),
    ) {
        // Empty-301:329-Rectangle 1
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = -18.dp, y = 764.dp)
                .background(Color(0x00d9d9d9))
                .size(422.dp, 80.dp)
                .border(1.dp, Color(0x6d000000)),
        )
        // Image-301:330-search-01
        Image(
            painter = painterResource(id = R.drawable.image1_301330),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 12.dp, y = 58.dp)
                .size(30.dp, 30.dp),
        )
        // Empty-301:331-Rectangle 2
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 75.dp, y = 54.dp)
                .background(Color(0xd3d9d9d9), RoundedCornerShape(5.dp))
                .size(233.dp, 34.dp),
        )
        // Image-301:332-marker-02
        Image(
            painter = painterResource(id = R.drawable.image2_301332),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 341.dp, y = 58.dp)
                .size(30.dp, 30.dp),
        )
        // Empty-301:333-Rectangle 3
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 189.dp, y = 56.dp)
                .background(Color(0xffffffff), RoundedCornerShape(5.dp))
                .size(117.dp, 30.dp),
        )
        // Text-301:334-Список
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 102.dp, y = 61.dp)
                .size(62.dp, 23.dp),
            text = "Список",
            color = Color(0x87000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Box-301:335-Status Bar
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .fillMaxSize()
                .padding(start = 0.dp, end = 0.dp, top = 2.dp, bottom = 788.dp),
        ) {
            // Box-I301:335;523:41289-Time
            Box(
                contentAlignment = Alignment.TopStart,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .size(140.5.dp, 54.dp),
            ) {
                // Text-I301:335;523:41290-Time
                Text(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .wrapContentSize()
                        .offset(x = 51.924.dp, y = 18.34.dp),
                    text = "9:41",
                    color = Color(0xff000000),
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            // Image-I301:335;523:41291-Levels
            Image(
                painter = painterResource(id = R.drawable.image_i30133552341291),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .offset(x = 252.5.dp, y = 0.dp)
                    .size(140.5.dp, 54.dp),
            )
        }
        // Image-301:336-Home Indicator
        Image(
            painter = painterResource(id = R.drawable.image3_301336),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .fillMaxWidth()
                .padding(start = 0.dp, end = 0.dp)
                .height(21.dp),
        )
        // Text-301:337-Карта
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 223.dp, y = 61.dp),
            text = "Карта",
            color = Color(0x87000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Empty-301:338-Rectangle 4
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 75.dp, y = 54.dp)
                .background(Color(0xd3d9d9d9), RoundedCornerShape(5.dp))
                .size(233.dp, 34.dp),
        )
        // Empty-301:339-Rectangle 5
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 189.dp, y = 56.dp)
                .background(Color(0xffffffff), RoundedCornerShape(5.dp))
                .size(117.dp, 30.dp),
        )
        // Text-301:340-Список
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 102.dp, y = 61.dp)
                .size(62.dp, 23.dp),
            text = "Список",
            color = Color(0x87000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-301:341-Карта
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 223.dp, y = 61.dp),
            text = "Карта",
            color = Color(0x87000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-301:342-Иконка
        Image(
            painter = painterResource(id = R.drawable.image4_301342),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 60.dp, y = 146.dp)
                .size(25.dp, 25.dp),
        )
        // Image-301:345-Иконка
        Image(
            painter = painterResource(id = R.drawable.image5_301345),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 132.dp, y = 166.dp)
                .size(25.dp, 25.dp),
        )
        // Text-301:348-Максим
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 86.dp, y = 151.dp)
                .size(47.dp, 17.dp),
            text = "Максим",
            color = Color(0xff000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-301:349-Данис
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 161.dp, y = 169.dp)
                .size(47.dp, 17.dp),
            text = "Данис",
            color = Color(0xff000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Empty-301:350-Rectangle 36
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = -9.dp, y = 103.dp)
                .background(Color(0xffffffff), RoundedCornerShape(26.dp))
                .size(393.dp, 675.dp),
        )
        // Text-301:351-ул. Кремлевская 35
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 28.dp, y = 216.dp)
                .size(245.dp, 32.dp),
            text = "ул. Кремлевская 35",
            color = Color(0x91000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Empty-301:352-Line 14
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 99.dp, y = 114.dp)
                .size(186.003.dp, 1.dp)
                .border(2.dp, Color(0xff000000)),
        )
        // Text-301:353-Максим
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 76.dp, y = 174.dp)
                .width(136.dp),
            text = "Максим",
            color = Color(0xaf000000),
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-301:354-user-profile-circle
        Image(
            painter = painterResource(id = R.drawable.image6_301354),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 28.dp, y = 175.dp)
                .size(32.dp, 32.dp),
        )
        // Text-301:355-Водитель
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 29.dp, y = 135.dp)
                .size(245.dp, 32.dp),
            text = "Водитель",
            color = Color(0xff000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-301:356-wallet-02
        Image(
            painter = painterResource(id = R.drawable.image7_301356),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 131.dp, y = 774.dp)
                .size(35.dp, 29.dp),
        )
        // Image-301:357-Icon
        Image(
            painter = painterResource(id = R.drawable.image8_301357),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 222.dp, y = 777.dp)
                .size(35.dp, 29.dp)
                .border(2.dp, Color(0xff009b3a)),
        )
        // Image-301:358-user-profile-circle
        Image(
            painter = painterResource(id = R.drawable.image9_301358),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 40.dp, y = 772.dp)
                .size(35.dp, 35.dp),
        )
        // Image-301:359-message-alert-circle
        Image(
            painter = painterResource(id = R.drawable.image10_301359),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 313.dp, y = 773.dp)
                .size(35.dp, 33.939.dp),
        )
        // Text-301:360-Главная
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 34.dp, y = 807.dp),
            text = "Главная",
            color = Color(0xbc000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-301:361-Платежи
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 123.dp, y = 807.dp),
            text = "Платежи",
            color = Color(0xbc000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-301:362-Акции
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 222.dp, y = 807.dp),
            text = "Акции",
            color = Color(0xbc000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-301:363-Новости
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 306.dp, y = 807.dp),
            text = "Новости",
            color = Color(0xbc000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-301:364-Rectangle 39
        Image(
            painter = painterResource(id = R.drawable.image11_301364),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 85.dp, y = 259.dp)
                .size(214.dp, 20.dp),
        )
        // Empty-301:365-Rectangle 40
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 74.dp, y = 52.dp)
                .background(Color(0x00ffffff))
                .size(115.dp, 36.dp),
        )
        // Text-301:366-Заявка выполнена Водитель Вас довёз
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 73.dp, y = 266.dp),
            text = "Заявка выполнена Водитель Вас довёз",
            color = Color(0xff000000),
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Box-301:367-8 thanks with green text
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 95.dp, y = 347.dp)
                .size(200.dp, 29.dp),
        ) {
            // Empty-301:368-Rectangle 43
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .background(Color(0xffffffff), RoundedCornerShape(5.dp))
                    .size(200.dp, 29.dp)
                    .border(1.dp, Color(0xff000000), RoundedCornerShape(5.dp)),
            )
            // Text-301:369-Спасибо
            Text(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .wrapContentSize()
                    .offset(x = 59.dp, y = 4.dp),
                text = "Спасибо",
                color = Color(0xff009b3a),
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
        }
        // Empty-301:370-Line 16
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 3.dp, y = 764.dp)
                .size(390.dp, 1.dp)
                .border(1.dp, Color(0x42000000)),
        )
        // Empty-301:371-8 delimiter
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 0.dp, y = 248.dp)
                .size(390.dp, 1.dp)
                .border(1.dp, Color(0x42000000)),
        )
        // Text-301:372-Пожаловаться
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 138.dp, y = 714.dp),
            text = "Пожаловаться",
            color = Color(0x63000000),
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Empty-303:400-Rectangle 46
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 18.dp, y = 266.dp)
                .size(359.dp, 226.dp)
                .border(1.dp, Color(0x3f000000), RoundedCornerShape(10.dp)),
        ) {
            // Image-303:406-directions_bus
            Image(
                painter = painterResource(id = R.drawable.image12_303406),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 156.dp, y = 281.dp)
                    .size(72.dp, 72.dp),
            )
            // Text-301:398-Желаете достроить маршрут? Интеграция с маршрутами города
            Text(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 6.dp, y = 366.dp)
                    .size(378.dp, 70.dp),
                text = "Желаете достроить маршрут?",
                color = Color(0xff000000),
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
            Text(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 6.dp, y = 395.dp)
                    .size(378.dp, 70.dp),
                text = "Интеграция с маршрутами города",
                color = Color.Gray,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
            // Box-301:395-10 cancel
            Box(
                contentAlignment = Alignment.TopStart,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 198.dp, y = 425.dp)
                    .size(97.dp, 35.dp),
            ) {
                // Empty-301:396-Rectangle 47
                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .background(Color(0xffd9d9d9), RoundedCornerShape(5.dp))
                        .size(97.dp, 35.dp),
                )
                // Text-301:397-Отклонить
                Text(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(x = 6.dp, y = 0.dp)
                        .size(85.dp, 35.dp),
                    text = "Отклонить",
                    color = Color(0xff000000),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            // Box-301:392-10 accept
            Box(
                contentAlignment = Alignment.TopStart,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 88.dp, y = 425.dp)
                    .size(97.dp, 36.dp),
            ) {
                // Empty-301:393-Rectangle 46
                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .background(Color(0xff34a853), RoundedCornerShape(5.dp))
                        .size(97.dp, 35.dp),
                )
                // Text-301:394-Помочь
                Text(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(x = 6.dp, y = 1.dp)
                        .size(85.dp, 35.dp),
                    text = "Принять",
                    color = Color(0xff000000),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun IntegrationTSViewPreview() {
    CodiaDemoComposeUITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                IntegrationTSView()
            }
        }
    }
}