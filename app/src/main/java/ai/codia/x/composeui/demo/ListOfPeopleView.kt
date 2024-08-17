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
fun ListOfPeopleView() {
    // Box-196:654-3 Список людей
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffffffff), RoundedCornerShape(40.dp))
            .size(390.dp, 844.dp)
            .clip(RoundedCornerShape(40.dp)),
    ) {
        // Empty-196:655-3 table back
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 26.dp, y = 153.dp)
                .size(362.dp, 599.dp),
        )
        // Text-196:656-09:00
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 273.dp, y = 235.dp)
                .width(78.dp),
            text = "09:00",
            color = Color(0xaf000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:657-10:00
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 273.dp, y = 278.dp)
                .width(78.dp),
            text = "10:00",
            color = Color(0xaf000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:658-07:00
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 273.dp, y = 322.dp)
                .width(78.dp),
            text = "07:00",
            color = Color(0xaf000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:659-12:30
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 273.dp, y = 363.dp)
                .width(78.dp),
            text = "12:30",
            color = Color(0xaf000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:660-17:00
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 273.dp, y = 404.dp)
                .width(78.dp),
            text = "17:00",
            color = Color(0xaf000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:661-Время
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 273.dp, y = 164.dp)
                .advancedShadow(color = Color(0x3f000000), alpha = 0.25f, cornersRadius = 0.dp, shadowBlurRadius = 0.dp, offsetX = 0.dp, offsetY = 0.dp)
                .size(118.249.dp, 31.206.dp)
                .border(1.dp, Color(0x02ffffff)),
            text = "Время",
            color = Color(0xaa000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:662-Расстояние
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 166.dp, y = 164.dp)
                .advancedShadow(color = Color(0x3f000000), alpha = 0.25f, cornersRadius = 0.dp, shadowBlurRadius = 0.dp, offsetX = 0.dp, offsetY = 0.dp)
                .size(118.249.dp, 31.206.dp)
                .border(1.dp, Color(0x02ffffff)),
            text = "Расстояние",
            color = Color(0xaa000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:663-Айгуль
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 80.dp, y = 274.dp)
                .size(73.dp, 32.dp),
            text = "Айгуль",
            color = Color(0xff000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:664-976 м
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 166.dp, y = 275.dp)
                .size(61.dp, 32.dp),
            text = "976 м",
            color = Color(0xff000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:665-473 м
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 166.dp, y = 323.dp)
                .size(61.dp, 32.dp),
            text = "473 м",
            color = Color(0xaa000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:666-2 км
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 166.dp, y = 362.dp)
                .size(61.dp, 32.dp),
            text = "2 км",
            color = Color(0xaa000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:667-935 м
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 166.dp, y = 406.dp)
                .size(61.dp, 32.dp),
            text = "935 м",
            color = Color(0xaa000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:668-Имя
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 80.dp, y = 164.dp)
                .advancedShadow(color = Color(0x3f000000), alpha = 0.25f, cornersRadius = 0.dp, shadowBlurRadius = 0.dp, offsetX = 0.dp, offsetY = 0.dp)
                .size(45.365.dp, 31.206.dp)
                .border(1.dp, Color(0x02ffffff)),
            text = "Имя",
            color = Color(0xaa000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:669-Анар
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 80.dp, y = 233.dp)
                .width(62.dp),
            text = "Анар",
            color = Color(0xff000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:670-Данис
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 80.dp, y = 363.dp)
                .size(73.dp, 32.dp),
            text = "Данис",
            color = Color(0xff000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:671-Катя
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 80.dp, y = 322.dp)
                .width(46.dp),
            text = "Катя",
            color = Color(0xff000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:672-Анар
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 80.dp, y = 406.dp)
                .width(62.dp),
            text = "Анар",
            color = Color(0xff000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-196:673-user-profile-circle
        Image(
            painter = painterResource(id = R.drawable.image1_196673),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 234.dp)
                .size(24.dp, 24.dp),
        )
        // Empty-196:674-Rectangle 1
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = -18.dp, y = 764.dp)
                .background(Color(0x00d9d9d9))
                .size(422.dp, 80.dp)
        )
        // Empty-196:677-Rectangle 6
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 76.dp, y = 27.dp)
                .background(Color(0xd3d9d9d9), RoundedCornerShape(5.dp))
                .size(233.dp, 34.dp),
        )
        // Empty-196:678-Rectangle 7
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 78.dp, y = 29.dp)
                .background(Color(0xffffffff), RoundedCornerShape(5.dp))
                .size(117.dp, 30.dp),
        )
        // Text-196:679-Список
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 103.dp, y = 34.dp)
                .size(62.dp, 23.dp),
            text = "Список",
            color = Color(0x87000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:680-Карта
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 224.dp, y = 34.dp),
            text = "Карта",
            color = Color(0x87000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:681-Все водители рядом
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 33.dp, y = 108.dp)
                .size(261.dp, 32.dp),
            text = "Все водители рядом",
            color = Color(0xff000000),
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Empty-196:682-Line 1
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 34.dp, y = 146.dp)
                .size(228.dp, 1.dp)
                .border(3.dp, Color(0xff000000)),
        )
        // Text-196:683-Максим
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 80.dp, y = 194.dp)
                .width(78.dp),
            text = "Максим",
            color = Color(0xff000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:684-15:00
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 273.dp, y = 197.dp)
                .width(78.dp),
            text = "15:00",
            color = Color(0xaf000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:685-543 м
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 168.dp, y = 195.dp)
                .width(59.dp),
            text = "543 м",
            color = Color(0xaa000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:686-1 км
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 168.dp, y = 234.dp)
                .width(38.dp),
            text = "1 км",
            color = Color(0xaa000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Empty-196:687-Line 2
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 35.dp, y = 220.dp)
                .size(335.dp, 1.dp)
                .border(1.dp, Color(0xffa1a1a1)),
        )
        // Empty-196:688-3 delimiter
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 34.dp, y = 184.dp)
                .size(325.dp, 1.dp)
                .border(1.dp, Color(0xffa1a1a1)),
        )
        // Image-196:689-Line 3
        Image(
            painter = painterResource(id = R.drawable.image2_196689),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 33.dp, y = 260.dp)
                .size(337.dp, 2.dp)
                .border(1.dp, Color(0xffa1a1a1)),
        )
        // Empty-196:690-Line 4
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 33.dp, y = 303.dp)
                .size(337.dp, 1.dp)
                .border(1.dp, Color(0xffa1a1a1)),
        )
        // Empty-196:691-Line 5
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 30.999.dp, y = 344.5.dp)
                .size(339.001.dp, 1.dp)
                .border(1.dp, Color(0xffa1a1a1)),
        )
        // Empty-196:692-Line 6
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 34.dp, y = 390.dp)
                .size(338.dp, 1.dp)
                .border(1.dp, Color(0xffa1a1a1)),
        )
        // Empty-196:693-Line 7
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 32.dp, y = 432.dp)
                .size(340.dp, 1.dp)
                .border(1.dp, Color(0xffa1a1a1)),
        )
        // Image-196:694-user-profile-circle
        Image(
            painter = painterResource(id = R.drawable.image3_196694),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 193.dp)
                .size(24.dp, 24.dp),
        )
        // Image-196:695-user logo
        Image(
            painter = painterResource(id = R.drawable.image4_196695),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 193.dp)
                .size(24.dp, 24.dp),
        )
        // Image-196:696-user-profile-circle
        Image(
            painter = painterResource(id = R.drawable.image5_196696),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 274.dp)
                .size(24.dp, 24.dp),
        )
        // Image-196:697-user-profile-circle
        Image(
            painter = painterResource(id = R.drawable.image6_196697),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 318.dp)
                .size(24.dp, 24.dp),
        )
        // Image-196:698-user-profile-circle
        Image(
            painter = painterResource(id = R.drawable.image7_196698),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 362.dp)
                .size(24.dp, 24.dp),
        )
        // Image-196:699-user-profile-circle
        Image(
            painter = painterResource(id = R.drawable.image8_196699),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 44.dp, y = 406.dp)
                .size(24.dp, 24.dp),
        )
        // Image-196:700-3 send logo
        Image(
            painter = painterResource(id = R.drawable.image9_196700),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 348.dp, y = 191.dp)
                .size(24.dp, 24.dp),
        )
        // Image-196:701-send-01
        Image(
            painter = painterResource(id = R.drawable.image10_196701),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 348.dp, y = 231.dp)
                .size(24.dp, 24.dp),
        )
        // Image-196:702-send-01
        Image(
            painter = painterResource(id = R.drawable.image11_196702),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 348.dp, y = 272.dp)
                .size(24.dp, 24.dp),
        )
        // Image-196:703-send-01
        Image(
            painter = painterResource(id = R.drawable.image12_196703),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 348.dp, y = 316.dp)
                .size(24.dp, 24.dp),
        )
        // Image-196:704-send-01
        Image(
            painter = painterResource(id = R.drawable.image13_196704),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 348.dp, y = 360.dp)
                .size(24.dp, 24.dp),
        )
        // Image-196:705-send-01
        Image(
            painter = painterResource(id = R.drawable.image14_196705),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 348.dp, y = 404.dp)
                .size(24.dp, 24.dp),
        )
        // Image-196:706-wallet-02
        Image(
            painter = painterResource(id = R.drawable.image15_196706),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 131.dp, y = 772.dp)
                .size(35.dp, 29.dp),
        )
        // Image-196:707-Icon
        Image(
            painter = painterResource(id = R.drawable.image16_196707),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 222.dp, y = 775.dp)
                .size(35.dp, 29.dp)
        )
        // Image-196:708-user-profile-circle
        Image(
            painter = painterResource(id = R.drawable.image17_196708),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 40.dp, y = 770.dp)
                .size(35.dp, 35.dp),
        )
        // Image-196:709-message-alert-circle
        Image(
            painter = painterResource(id = R.drawable.image18_196709),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 313.dp, y = 771.dp)
                .size(35.dp, 33.939.dp),
        )
        // Text-196:710-Главная
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 34.dp, y = 805.dp),
            text = "Главная",
            color = Color(0xbc000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:711-Платежи
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 123.dp, y = 805.dp),
            text = "Платежи",
            color = Color(0xbc000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:712-Акции
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 222.dp, y = 805.dp),
            text = "Акции",
            color = Color(0xbc000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-196:713-Новости
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 306.dp, y = 805.dp),
            text = "Новости",
            color = Color(0xbc000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Empty-196:715-Rectangle 42
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 195.dp, y = 62.dp)
                .background(Color(0x00ffffff))
                .size(114.dp, 33.dp),
        )
        // Image-196:716-marker-02
        Image(
            painter = painterResource(id = R.drawable.image19_196716),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 335.dp, y = 31.dp)
                .size(30.dp, 30.dp),
        )
        // Image-196:717-Icon
        Image(
            painter = painterResource(id = R.drawable.image20_196717),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 22.dp, y = 36.dp)
                .size(27.dp, 27.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ListOfPeopleViewPreview() {
    CodiaDemoComposeUITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                ListOfPeopleView()
            }
        }
    }
}
