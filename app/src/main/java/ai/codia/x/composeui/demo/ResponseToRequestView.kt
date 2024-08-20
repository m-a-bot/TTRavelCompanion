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
fun ResponseToRequestView() {
    // Box-196:367-10 Ответ
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffffffff), RoundedCornerShape(40.dp))
            .size(390.dp, 844.dp)
            .clip(RoundedCornerShape(40.dp)),
    ) {
        // Empty-196:368-Rectangle 1
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = -18.dp, y = 764.dp)
                .background(Color(0x00d9d9d9))
                .size(422.dp, 80.dp)
        )
        // Image-196:369-wallet-02
        Image(
            painter = painterResource(id = R.drawable.image1_196369),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 134.dp, y = 772.dp)
                .size(35.dp, 29.dp),
        )
        // Image-196:370-user-profile-circle
        Image(
            painter = painterResource(id = R.drawable.image2_196370),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 43.dp, y = 770.dp)
                .size(35.dp, 35.dp),
        )
        // Image-196:371-message-alert-circle
        Image(
            painter = painterResource(id = R.drawable.image3_196371),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 316.dp, y = 771.dp)
                .size(35.dp, 33.939.dp),
        )
        // Text-196:372-Главная
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 37.dp, y = 805.dp),
            text = "Главная",
            color = Color(0xbc000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:373-Платежи
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 126.dp, y = 805.dp),
            text = "Платежи",
            color = Color(0xbc000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:374-Акции
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 225.dp, y = 805.dp),
            text = "Акции",
            color = Color(0xbc000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:375-Новости
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 309.dp, y = 805.dp),
            text = "Новости",
            color = Color(0xbc000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
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
        // Image-196:379-Icon
        Image(
            painter = painterResource(id = R.drawable.image5_196379),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 225.dp, y = 775.dp)
                .size(35.dp, 29.dp)
        )
        // Box-196:380-Group 1
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 97.125.dp, y = 110.679.dp)
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
        // Box-196:383-10 back
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 26.dp, y = 170.dp)
                .size(362.dp, 573.dp),
        ) {
            // Empty-196:384-Rectangle 44
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .size(362.dp, 573.dp),
            )
            // Empty-196:385-Rectangle 45
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 18.dp, y = 185.dp)
                    .size(326.dp, 364.dp),
            )
        }
        // Box-196:386-10 map template
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 355.dp)
                .size(326.dp, 224.dp),
        ) {
            // Image-196:387-image 4
            Image(
                painter = painterResource(id = R.drawable.image_196387),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .size(326.dp, 224.dp),
            )
            // Text-196:388-Вы
            Text(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 169.dp, y = 89.dp)
                    .size(36.dp, 18.dp),
                text = "Вы",
                color = Color(0xff000000),
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left,
                overflow = TextOverflow.Ellipsis,
            )
            // Box-196:389-Group 5
            Box(
                contentAlignment = Alignment.TopStart,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 226.dp, y = 188.dp)
                    .size(42.dp, 17.dp),
            ) {
                // Image-196:390-User
                Image(
                    painter = painterResource(id = R.drawable.image_196390),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(x = 0.dp, y = 3.dp)
                        .size(12.dp, 12.dp),
                )
                // Text-196:391-Алия
                Text(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(x = 12.dp, y = 0.dp)
                        .size(55.dp, 17.dp),
                    text = "Алия",
                    color = Color(0xff000000),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        // Box-196:392-10 accept
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 100.dp, y = 662.dp)
                .size(97.dp, 36.dp),
        ) {
            // Empty-196:393-Rectangle 46
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .background(Color(0xff34a853), RoundedCornerShape(5.dp))
                    .size(97.dp, 35.dp),
            )
            // Text-196:394-Помочь
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
        // Box-196:395-10 cancel
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 210.dp, y = 663.dp)
                .size(97.dp, 35.dp),
        ) {
            // Empty-196:396-Rectangle 47
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .background(Color(0xffd9d9d9), RoundedCornerShape(5.dp))
                    .size(97.dp, 35.dp),
            )
            // Text-196:397-Отклонить
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
        // Text-196:398-Пользователь Алия ...
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 70.dp, y = 170.dp)
                .size(269.dp, 55.dp),
            text = "Пользователь Алия\n...",
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
                .offset(x = 72.dp, y = 595.dp)
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
                .offset(x = 44.dp, y = 226.dp)
                .size(327.dp, 71.dp),
            text = "Длинное описание (можно сделать  заготовки для пользователя, которому требуется помощь)",
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
                .offset(x = 100.dp, y = 626.dp)
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
                .offset(x = 44.dp, y = 301.dp)
                .size(45.dp, 45.dp),
        )
        // Text-196:403-Алия
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 90.dp, y = 310.dp)
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
                .offset(x = 26.dp, y = 107.dp)
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
                ResponseToRequestView()
            }
        }
    }
}
