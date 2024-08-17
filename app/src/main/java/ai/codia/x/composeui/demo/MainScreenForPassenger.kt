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

/**
 * Created by codia-figma
 */
@Composable
fun MainScreenForPassenger() {
    // Box-192:195-1 Главный экран для пассажира
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffffffff), RoundedCornerShape(40.dp))
            .size(390.dp, 844.dp)
            .clip(RoundedCornerShape(40.dp)),
    ) {
        // Empty-192:221-Rectangle 1
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = -18.dp, y = 764.dp)
                .background(Color(0x00d9d9d9))
                .size(422.dp, 80.dp)
        )
        // Image-192:222-search-01
        Image(
            painter = painterResource(id = R.drawable.image1_192222),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 22.dp, y = 24.dp)
                .size(30.dp, 30.dp),
        )
        // Image-192:223-marker-02
        Image(
            painter = painterResource(id = R.drawable.image2_192223),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 351.dp, y = 24.dp)
                .size(30.dp, 30.dp),
        )
        // Text-192:224-Пассажир
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 106.dp, y = 685.dp)
                .size(96.dp, 24.dp),
            text = "Пассажир",
            color = Color(0x87000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-192:225-Водитель
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 223.dp, y = 686.dp),
            text = "Водитель",
            color = Color(0x87000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Empty-192:226-Rectangle 49
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 177.dp)
                .background(Color(0x60d9d9d9), RoundedCornerShape(17.dp))
                .size(330.dp, 338.dp),
        )
        // Empty-192:227-Line 19
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 382.dp)
                .size(325.dp, 1.dp)
                .border(1.dp, Color(0xff000000)),
        )
        // Empty-192:228-Line 22
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 307.dp)
                .size(330.dp, 1.dp)
                .border(1.dp, Color(0xff000000)),
        )
        // Empty-192:229-Line 21
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 235.dp)
                .size(325.dp, 1.dp)
                .border(1.dp, Color(0xff000000)),
        )
        // Image-192:230-Ellipse 10
        Image(
            painter = painterResource(id = R.drawable.image3_192230),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 57.dp, y = 194.dp)
                .size(25.dp, 25.dp)
                .border(1.dp, Color(0xffa1a1a1), RoundedCornerShape(12.5.dp)),
        )
        // Empty-192:231-Rectangle 50
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 457.dp)
                .background(Color(0xff009b3a), RoundedCornerShape(23.dp))
                .size(328.dp, 61.dp),
        )
        // Image-192:232-Ellipse 11
        Image(
            painter = painterResource(id = R.drawable.image4_192232),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 63.dp, y = 200.dp)
                .size(13.dp, 13.dp),
        )
        // Image-192:233-Ellipse 12
        Image(
            painter = painterResource(id = R.drawable.image5_192233),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 57.dp, y = 258.dp)
                .size(25.dp, 25.dp)
                .border(1.dp, Color(0xffa1a1a1), RoundedCornerShape(12.5.dp)),
        )
        // Image-192:234-Ellipse 13
        Image(
            painter = painterResource(id = R.drawable.image6_192234),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 63.dp, y = 264.dp)
                .size(13.dp, 13.dp),
        )
        // Empty-192:235-Rectangle 51
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 446.dp)
                .background(Color(0xff009b3a))
                .size(328.dp, 46.dp),
        )
        // Text-192:236-Найти пассажиров
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 132.dp, y = 473.dp)
                .size(149.dp, 27.dp),
            text = "Найти пассажиров",
            color = Color(0xffffffff),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-192:237-Откуда
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 99.dp, y = 191.dp)
                .size(82.dp, 38.dp),
            text = "Откуда",
            color = Color(0xa3000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-192:238-К
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 99.dp, y = 255.dp)
                .size(55.dp, 37.dp),
            text = "Куда",
            color = Color(0xa3000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-192:239-К
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 99.dp, y = 327.dp)
                .size(95.dp, 38.dp),
            text = "Сегодня",
            color = Color(0xa3000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-192:240-К
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 99.dp, y = 399.dp)
                .size(9.dp, 38.dp),
            text = "1",
            color = Color(0xa3000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-192:241-Planner
        Image(
            painter = painterResource(id = R.drawable.image7_192241),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 57.dp, y = 328.dp)
                .size(25.dp, 25.dp),
        )
        // Image-192:242-Man
        Image(
            painter = painterResource(id = R.drawable.image8_192242),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 51.dp, y = 396.dp)
                .size(36.dp, 36.dp),
        )
        // Image-192:243-top search
        Image(
            painter = painterResource(id = R.drawable.image9_192243),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 22.dp, y = 24.dp)
                .size(30.dp, 30.dp),
        )
        // Image-192:244-top geoposition
        Image(
            painter = painterResource(id = R.drawable.image10_192244),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 351.dp, y = 24.dp)
                .size(30.dp, 30.dp),
        )
        // Image-192:245-1 left choose
        Image(
            painter = painterResource(id = R.drawable.image11_192245),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 93.dp, y = 680.dp)
                .size(233.dp, 34.dp),
        )
        // Text-192:250-Пассажир
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 106.dp, y = 685.dp)
                .size(96.dp, 24.dp),
            text = "Пассажир",
            color = Color(0xff000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Box-192:251-bottom
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 47.dp, y = 736.dp)
                .size(321.dp, 57.dp),
        ) {
            // Image-192:252-wallet-02
            Image(
                painter = painterResource(id = R.drawable.image1_192252),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 97.dp, y = 2.dp)
                    .size(35.dp, 29.dp),
            )
            // Image-192:253-Icon
            Image(
                painter = painterResource(id = R.drawable.image2_192253),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 188.dp, y = 5.dp)
                    .size(35.dp, 29.dp)
            )
            // Image-192:254-user-profile-circle
            Image(
                painter = painterResource(id = R.drawable.image3_192254),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 6.dp, y = 0.dp)
                    .size(35.dp, 35.dp),
            )
            // Image-192:255-message-alert-circle
            Image(
                painter = painterResource(id = R.drawable.image4_192255),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 279.dp, y = 1.dp)
                    .size(35.dp, 33.939.dp),
            )
            // Text-192:256-Главная
            Text(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .wrapContentSize()
                    .offset(x = 0.dp, y = 35.dp),
                text = "Главная",
                color = Color(0xbc000000),
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
            // Text-192:257-Платежи
            Text(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .wrapContentSize()
                    .offset(x = 89.dp, y = 35.dp),
                text = "Платежи",
                color = Color(0xbc000000),
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
            // Text-192:258-Акции
            Text(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .wrapContentSize()
                    .offset(x = 188.dp, y = 35.dp),
                text = "Акции",
                color = Color(0xbc000000),
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
            // Text-192:259-Новости
            Text(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .wrapContentSize()
                    .offset(x = 272.dp, y = 35.dp),
                text = "Новости",
                color = Color(0xbc000000),
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
            // Image-192:260-wallet-02
            Image(
                painter = painterResource(id = R.drawable.image5_192260),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 97.dp, y = 2.dp)
                    .size(35.dp, 29.dp),
            )
            // Image-192:261-Icon
            Image(
                painter = painterResource(id = R.drawable.image6_192261),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 188.dp, y = 5.dp)
                    .size(35.dp, 29.dp)
            )
            // Image-192:262-user-profile-circle
            Image(
                painter = painterResource(id = R.drawable.image7_192262),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 6.dp, y = 0.dp)
                    .size(35.dp, 35.dp),
            )
            // Image-192:263-message-alert-circle
            Image(
                painter = painterResource(id = R.drawable.image8_192263),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 279.dp, y = 1.dp)
                    .size(35.dp, 33.939.dp),
            )
            // Text-192:264-Главная
            Text(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .wrapContentSize()
                    .offset(x = 0.dp, y = 35.dp),
                text = "Главная",
                color = Color(0xbc000000),
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
            // Text-192:265-Платежи
            Text(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .wrapContentSize()
                    .offset(x = 89.dp, y = 35.dp),
                text = "Платежи",
                color = Color(0xbc000000),
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
            // Text-192:266-Акции
            Text(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .wrapContentSize()
                    .offset(x = 188.dp, y = 35.dp),
                text = "Акции",
                color = Color(0xbc000000),
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
            // Text-192:267-Новости
            Text(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .wrapContentSize()
                    .offset(x = 272.dp, y = 35.dp),
                text = "Новости",
                color = Color(0xbc000000),
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
        }
        // Text-192:268-Водитель
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 223.dp, y = 686.dp),
            text = "Водитель",
            color = Color(0x87000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Empty-192:269-Rectangle 54
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 177.dp)
                .background(Color(0xffe8e8e8), RoundedCornerShape(17.dp))
                .size(330.dp, 338.dp),
        )
        // Empty-192:270-Line 24
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 382.dp)
                .size(330.dp, 1.dp)
                .border(1.dp, Color(0xff000000)),
        )
        // Empty-192:271-Line 25
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 45.dp, y = 307.dp)
                .size(329.dp, 1.dp)
                .border(1.dp, Color(0xff000000)),
        )
        // Empty-192:272-Line 26
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 47.dp, y = 235.dp)
                .size(327.dp, 1.dp)
                .border(1.dp, Color(0xff000000)),
        )
        // Empty-192:273-Rectangle 55
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 457.dp)
                .background(Color(0xff009b3a), RoundedCornerShape(23.dp))
                .size(330.dp, 61.dp),
        )
        // Image-192:274-1 radio active
        Image(
            painter = painterResource(id = R.drawable.image12_192274),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 57.dp, y = 194.dp)
                .size(25.dp, 25.dp),
        )
        // Image-192:277-1 radio inactive
        Image(
            painter = painterResource(id = R.drawable.image13_192277),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 57.dp, y = 258.dp)
                .size(25.dp, 25.dp),
        )
        // Empty-192:280-Rectangle 56
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 446.dp)
                .background(Color(0xff009b3a))
                .size(330.dp, 46.dp),
        )
        // Text-192:281-Найти водителя
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 121.dp, y = 469.dp)
                .size(172.dp, 27.dp),
            text = "Найти водителя",
            color = Color(0xffffffff),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-192:282-Откуда
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 99.dp, y = 191.dp)
                .size(82.dp, 38.dp),
            text = "Откуда",
            color = Color(0xa3000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-192:283-К
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 99.dp, y = 255.dp)
                .size(55.dp, 37.dp),
            text = "Куда",
            color = Color(0xa3000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-192:284-К
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 99.dp, y = 327.dp)
                .size(95.dp, 38.dp),
            text = "Сегодня",
            color = Color(0xa3000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-192:285-К
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 99.dp, y = 399.dp)
                .size(9.dp, 38.dp),
            text = "1",
            color = Color(0xa3000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-192:286-1 calendar
        Image(
            painter = painterResource(id = R.drawable.image14_192286),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 57.dp, y = 328.dp)
                .size(25.dp, 25.dp),
        )
        // Image-192:287-1 person
        Image(
            painter = painterResource(id = R.drawable.image15_192287),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 51.dp, y = 396.dp)
                .size(36.dp, 36.dp),
        )
        // Image-192:298-1 photo
        Image(
            painter = painterResource(id = R.drawable.image16_192298),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 58.dp, y = 52.dp)
                .size(295.dp, 123.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenForPassengerPreview() {
    CodiaDemoComposeUITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                MainScreenForPassenger()
            }
        }
    }
}
