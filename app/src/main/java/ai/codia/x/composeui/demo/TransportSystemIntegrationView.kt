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
import androidx.compose.foundation.layout.Spacer
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
fun TransportSystemIntegrationView() {
    // Box-303:408-8 Достроение маршрута
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xffffffff), RoundedCornerShape(40.dp))
            .height(844.dp)
            .clip(RoundedCornerShape(40.dp)),
    ) {
        // Empty-308:546-Rectangle 65
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 51.dp, y = 574.dp)
                .background(Color(0x5918cf5c))
                .size(286.dp, 19.dp),
        )
        // Image-306:524-Ellipse 26
        Image(
            painter = painterResource(id = R.drawable.image1_306524),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 185.dp, y = 138.dp)
                .size(21.dp, 21.dp),
        )

        // Image-303:410-search-01
        Image(
            painter = painterResource(id = R.drawable.image2_303410),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 12.dp, y = 58.dp)
                .size(30.dp, 30.dp),
        )
        // Image-303:412-marker-02
        Image(
            painter = painterResource(id = R.drawable.image3_303412),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 341.dp, y = 58.dp)
                .size(30.dp, 30.dp),
        )
        // Box-303:415-Status Bar
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .fillMaxSize()
                .padding(start = 0.dp, end = 0.dp, top = 2.dp, bottom = 788.dp),
        ) {
            // Box-I303:415;523:41289-Time
            Box(
                contentAlignment = Alignment.TopStart,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .size(140.5.dp, 54.dp),
            ) {
                // Text-I303:415;523:41290-Time
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
            // Image-I303:415;523:41291-Levels
            Image(
                painter = painterResource(id = R.drawable.image_i30341552341291),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .offset(x = 252.5.dp, y = 0.dp)
                    .size(140.5.dp, 54.dp),
            )
        }


        // Box-306:484-10 back
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 17.dp, y = 174.dp)
                .size(362.dp, 573.dp),
        ) {
            // Empty-306:485-Rectangle 44
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .size(362.dp, 573.dp),
            )
            // Empty-306:486-Rectangle 45
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 18.dp, y = 185.dp)
                    .size(326.dp, 364.dp),
            )
        }
        // Box-306:487-10 back
        Box(
            contentAlignment = Alignment.TopStart,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 18.dp, y = 107.dp)
                .size(362.dp, 640.dp),
        ) {
            // Empty-306:488-Rectangle 44
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .size(362.dp, 640.dp),
            )
            // Empty-306:489-Rectangle 45
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 18.dp, y = 22.dp)
                    .size(326.dp, 591.dp),
            )
            // Image-306:514-image 18
            Image(
                painter = painterResource(id = R.drawable.image_306514),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 30.dp, y = 59.dp)
                    .size(303.dp, 375.dp),
            )
        }

        Row(
            modifier = Modifier
                .offset(0.dp, 650.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
//                                navController?.navigate(ScreenPassengerView(
//                                34
//                            ))
                },
                modifier = Modifier
                    .size(120.dp, 35.dp),
                contentPadding = PaddingValues(0.dp),
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(52, 168, 83),
                )
            )
            {
                Text("Подтвердить")
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = {
//                                navController?.navigate(ScreenPassengerView(
//                                34
//                            ))
                },
                modifier = Modifier
                    .size(120.dp, 35.dp),
                contentPadding = PaddingValues(0.dp),
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.LightGray,
                )
            )
            {
                Text("Отменить")
            }

        }

        // Empty-306:515-Rectangle 63
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 50.dp, y = 138.dp)
                .background(Color(0xffffffff), RoundedCornerShape(7.dp))
                .size(297.dp, 23.dp),
        )
        // Empty-306:525-Rectangle 64
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 48.dp, y = 548.dp)
                .background(Color(0xffffffff), RoundedCornerShape(7.dp))
                .size(297.dp, 100.dp),
        )
        // Text-306:526-Автобусные маршруты
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 57.dp, y = 552.dp),
            text = "Автобусные маршруты",
            color = Color(0xff000000),
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-306:517-Trolleybus
        Image(
            painter = painterResource(id = R.drawable.image9_306517),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 139.dp, y = 141.dp)
                .size(17.dp, 17.dp),
        )
        // Image-306:519-Walking
        Image(
            painter = painterResource(id = R.drawable.image10_306519),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 287.dp, y = 141.dp)
                .size(17.dp, 17.dp),
        )
        // Image-306:520-Walking
        Image(
            painter = painterResource(id = R.drawable.image11_306520),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 373.dp, y = 382.dp)
                .size(90.dp, 90.dp),
        )
        // Image-306:521-Kick Scooter
        Image(
            painter = painterResource(id = R.drawable.image12_306521),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 239.dp, y = 141.dp)
                .size(17.dp, 17.dp),
        )
        // Image-306:522-directions_bus
        Image(
            painter = painterResource(id = R.drawable.image13_306522),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 190.dp, y = 141.dp)
                .size(17.dp, 17.dp),
        )
        // Image-308:539-directions_bus
        Image(
            painter = painterResource(id = R.drawable.image14_308539),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 57.dp, y = 600.dp)
                .size(17.dp, 17.dp),
        )
        // Text-308:540-Маршрут №7
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 94.dp, y = 598.dp)
                .width(97.dp),
            text = "Маршрут №7",
            color = Color(0xff000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-308:541-15:05
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 207.dp, y = 599.dp)
                .width(78.dp),
            text = "15:05",
            color = Color(0xaf000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-308:542-15:07
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 282.dp, y = 598.dp)
                .width(78.dp),
            text = "15:07",
            color = Color(0xaf000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-306:531-Маршрут №6
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 94.dp, y = 574.dp)
                .width(97.dp),
            text = "Маршрут №6",
            color = Color(0xff000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-306:532-15:00
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 207.dp, y = 575.dp)
                .width(78.dp),
            text = "15:00",
            color = Color(0xaf000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Text-308:538-15:10
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 282.dp, y = 574.dp)
                .width(78.dp),
            text = "15:10",
            color = Color(0xaf000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-306:536-directions_bus
        Image(
            painter = painterResource(id = R.drawable.image15_306536),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 57.dp, y = 576.dp)
                .size(17.dp, 17.dp),
        )
        // Image-308:544-Line 33
        Image(
            painter = painterResource(id = R.drawable.image16_308544),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 55.dp, y = 596.dp)
                .size(282.dp, 1.dp)
                .border(1.dp, Color(0x44000000)),
        )
        // Image-308:547-Line 34
        Image(
            painter = painterResource(id = R.drawable.image17_308547),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 55.dp, y = 622.dp)
                .size(282.dp, 1.dp)
                .border(1.dp, Color(0x44000000)),
        )

        Box(
        )
        {
            BottomBar(null)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TransportSystemIntegrationViewPreview() {
    CodiaDemoComposeUITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                TransportSystemIntegrationView()
            }
        }
    }
}
