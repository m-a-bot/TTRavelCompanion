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
fun AccrualOfPointsView() {
    // Box-196:405-11 Начисление баллов
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffffffff), RoundedCornerShape(40.dp))
            .size(390.dp, 844.dp)
            .clip(RoundedCornerShape(40.dp)),
    ) {
        // Empty-196:406-Rectangle 1
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = -18.dp, y = 764.dp)
                .background(Color(0x00d9d9d9))
                .size(422.dp, 80.dp)
        )
        // Image-196:407-wallet-02
        Image(
            painter = painterResource(id = R.drawable.image1_196407),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 134.dp, y = 772.dp)
                .size(35.dp, 29.dp),
        )
        // Image-196:408-user-profile-circle
        Image(
            painter = painterResource(id = R.drawable.image2_196408),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 43.dp, y = 770.dp)
                .size(35.dp, 35.dp),
        )
        // Image-196:409-message-alert-circle
        Image(
            painter = painterResource(id = R.drawable.image3_196409),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 316.dp, y = 771.dp)
                .size(35.dp, 33.939.dp),
        )
        // Text-196:410-Главная
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
        // Text-196:411-Платежи
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
        // Text-196:412-Акции
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
        // Text-196:413-Новости
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
        // Image-196:415-Icon
        Image(
            painter = painterResource(id = R.drawable.image4_196415),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 225.dp, y = 775.dp)
                .size(35.dp, 29.dp)
        )
        // Image-196:416-11 success
        Image(
            painter = painterResource(id = R.drawable.image5_196416),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 0.dp, y = -50.dp)
                .size(390.dp, 814.dp),
        )
        // Text-196:421-Максим, спасибо за поездку! Бонусные баллы начислены на баланс
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 24.dp, y = 390.dp)
                .size(346.dp, 141.dp),
            text = "Максим, спасибо за поездку!\nБонусные баллы начислены на баланс\n",
            color = Color(0xffffffff),
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AccrualOfPointsViewPreview() {
    CodiaDemoComposeUITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                AccrualOfPointsView()
            }
        }
    }
}
