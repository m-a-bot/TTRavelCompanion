package ai.codia.x.composeui.demo

import ai.codia.x.composeui.demo.ui.theme.CodiaDemoComposeUITheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun HumanCardView(navController: NavHostController?) {
    // Box-14:294-5 Карточка человека
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xffffffff), RoundedCornerShape(40.dp))
            .height(844.dp)
            .clip(RoundedCornerShape(40.dp)),
    ) {
        // Image-119:196-map1 1
        Image(
            painter = painterResource(id = R.drawable.image1_119196),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 0.dp, y = 75.dp)
                .size(390.dp, 500.dp),
        )
        // Empty-14:295-Rectangle 1
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = -18.dp, y = 764.dp)
                .background(Color(0x00d9d9d9))
                .size(422.dp, 80.dp),
        )
        // Image-14:304-search-01
        Image(
            painter = painterResource(id = R.drawable.image2_14304),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 12.dp, y = 25.dp)
                .size(30.dp, 30.dp),
        )
        // Empty-14:305-Rectangle 2
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 75.dp, y = 25.dp)
                .background(Color(0xd3d9d9d9), RoundedCornerShape(5.dp))
                .size(233.dp, 34.dp),
        )
        // Image-14:306-marker-02
        Image(
            painter = painterResource(id = R.drawable.image3_14306),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 341.dp, y = 25.dp)
                .size(30.dp, 30.dp),
        )
        // Empty-14:307-Rectangle 3


        // Text-14:311-Карта
//        Text(
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .wrapContentSize()
//                .offset(x = 223.dp, y = 61.dp),
//            text = "Карта",
//            color = Color(0x87000000),
//            fontSize = 17.sp,
//            fontWeight = FontWeight.Normal,
//            textAlign = TextAlign.Center,
//            overflow = TextOverflow.Ellipsis,
//        )
        // Empty-14:312-Rectangle 4
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 75.dp, y = 25.dp)
                .background(Color(0xd3d9d9d9), RoundedCornerShape(5.dp))
                .size(233.dp, 34.dp),
        )
        // Empty-14:313-Rectangle 5
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 189.dp, y = 27.dp)
                .background(Color(0xffffffff), RoundedCornerShape(5.dp))
                .size(117.dp, 30.dp),
        )
        // Text-14:314-Список
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 102.dp, y = 31.dp)
                .size(70.dp, 23.dp),
            text = "Список",
            color = Color(0x87000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-14:315-Карта
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 223.dp, y = 31.dp),
            text = "Карта",
            color = Color(0x87000000),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Empty-14:346-Line 14
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 96.dp, y = 568.dp)
                .size(186.003.dp, 1.dp)
                .border(2.dp, Color(0xff000000)),
        )
        // Text-14:347-Максим
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 69.dp, y = 639.dp)
                .width(136.dp),
            text = "Максим",
            color = Color(0xaf000000),
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-14:350-send-01
        Image(
            painter = painterResource(id = R.drawable.image5_14350),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 326.dp, y = 641.dp)
                .size(32.dp, 32.dp),
        )
        // Image-14:352-user-profile-circle
        Image(
            painter = painterResource(id = R.drawable.image6_14352),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 16.dp, y = 641.dp)
                .size(32.dp, 32.dp),
        )
        // Text-14:354-Ближайший водитель
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 19.dp, y = 588.dp)
                .size(245.dp, 32.dp),
            text = "Ближайший водитель",
            color = Color(0xff000000),
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Empty-177:226-Rectangle 41
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 0.dp, y = 554.dp)
                .background(Color(0xffffffff), RoundedCornerShape(26.dp))
                .size(393.dp, 235.dp),
        )
        // Empty-30:149-Rectangle 39
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 85.dp, y = 622.dp)
                .background(Color(0x00b44242))
                .size(214.dp, 20.dp),
        )
        // Empty-30:151-Rectangle 40
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 74.dp, y = 20.dp)
                .background(Color(0x00ffffff))
                .size(115.dp, 36.dp),
        )
        // Box-177:235-5 rider status
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 0.dp, y = 554.dp)
                .size(393.dp, 235.dp),
        ) {
            // Empty-14:345-Rectangle 36
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .background(Color(0xffffffff), RoundedCornerShape(26.dp))
                    .size(393.dp, 235.dp),
            )
            // Empty-177:227-Line 15
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 96.dp, y = 14.dp)
                    .size(186.003.dp, 1.dp)
                    .border(2.dp, Color(0xff000000)),
            )

            Button(onClick = {
                navController?.navigate(
                    ScreenDriversRequest
                )
            },
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 326.dp, y = 77.dp)
                    .padding(0.dp)
                    .size(50.dp, 50.dp),
                contentPadding = PaddingValues(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                ),

                ) {
                Image(
                    painter = painterResource(id = R.drawable.image10_196701),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp, 30.dp),
                )
            }


            // Image-177:230-user-profile-circle
            Image(
                painter = painterResource(id = R.drawable.image2_177230),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 16.dp, y = 87.dp)
                    .size(32.dp, 32.dp),
            )
            // Text-177:231-Ближайший водитель
            Text(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 19.dp, y = 34.dp)
                    .size(245.dp, 32.dp),
                text = "Ближайший водитель",
                color = Color(0xff000000),
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left,
                overflow = TextOverflow.Ellipsis,
            )
            // ToDo
            // Empty-117:168-Arrow 1
            Image(
                painter = painterResource(id = R.drawable.image4_14310),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 0.dp, y = 157.dp)
                    .fillMaxWidth()
                    .height(21.dp),
            )
        }
        // Text-117:169-Буинск, ул. Ефремова 123
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 229.dp, y = 693.dp)
                .size(245.dp, 52.dp),
            text = "Буинск,\nул. Ефремова 123",
            color = Color(0x91000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-14:355-Казань,ул. Кремлевская 35
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 14.dp, y = 694.dp)
                .size(245.dp, 52.dp),
            text = "Казань,\nул. Кремлевская 35",
            color = Color(0x91000000),
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )

        Box(
        )
        {
            BottomBar(navController)
        }

        // Text-177:228-Максим
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 69.dp, y = 639.dp)
                .width(136.dp),
            text = "Максим",
            color = Color(0xaf000000),
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HumanCardViewPreview() {
    CodiaDemoComposeUITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                HumanCardView(null)
            }
        }
    }
}