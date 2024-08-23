package ai.codia.x.composeui.demo

import ai.codia.x.composeui.demo.ui.theme.CodiaDemoComposeUITheme
import android.widget.GridLayout
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
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
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
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController

/**
 * Created by codia-figma
 */
@Composable
fun ListOfPeopleView(navController: NavHostController?, navBackStack: NavBackStackEntry?) {

    val viewModel: NearPersonsViewModel = viewModel()

    val items: List<NearPersons> by viewModel.items.observeAsState(emptyList())

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
                .offset(x = 25.dp, y = 190.dp)
                .size(360.dp, 565.dp),
        ) {

            LazyColumn {
                items(items) { item ->
                    Row (
                        modifier = Modifier
                            .offset(y = (-5).dp)
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.image1_196673),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(10.dp, 5.dp)
                                .size(35.dp, 29.dp),

                            )
                        Text(modifier = Modifier
                            .padding(0.dp)
                            .align(Alignment.CenterVertically)
                            .size(85.dp, 23.dp),
                            text = item.name)
                        Text(modifier = Modifier
                            .padding(0.dp)
                            .align(Alignment.CenterVertically)
                            .size(105.dp, 23.dp),

                            text = item.distance)
                        Text(modifier = Modifier
                            .padding(0.dp)
                            .align(Alignment.CenterVertically)
                            .size(45.dp, 23.dp),
                            text = item.date_time)

                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .size(80.dp, 50.dp),

                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent
                            ),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.image10_196701),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .size(30.dp, 30.dp),
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .offset(10.dp, (-10).dp)
                            .size(339.001.dp, 1.dp)
                            .border(1.dp, Color(0xffa1a1a1)),
                    )
                }
            }
        }

        // Text-196:661-Время
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 250.dp, y = 164.dp)
                .advancedShadow(
                    color = Color(0x3f000000),
                    alpha = 0.25f,
                    cornersRadius = 0.dp,
                    shadowBlurRadius = 0.dp,
                    offsetX = 0.dp,
                    offsetY = 0.dp
                )
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
                .offset(x = 145.dp, y = 164.dp)
                .advancedShadow(
                    color = Color(0x3f000000),
                    alpha = 0.25f,
                    cornersRadius = 0.dp,
                    shadowBlurRadius = 0.dp,
                    offsetX = 0.dp,
                    offsetY = 0.dp
                )
                .size(118.249.dp, 31.206.dp)
                .border(1.dp, Color(0x02ffffff)),
            text = "Расстояние",
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
                .offset(x = 60.dp, y = 164.dp)
                .advancedShadow(
                    color = Color(0x3f000000),
                    alpha = 0.25f,
                    cornersRadius = 0.dp,
                    shadowBlurRadius = 0.dp,
                    offsetX = 0.dp,
                    offsetY = 0.dp
                )
                .size(45.365.dp, 31.206.dp)
                .border(1.dp, Color(0x02ffffff)),
            text = "Имя",
            color = Color(0xaa000000),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Left,
            overflow = TextOverflow.Ellipsis,
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
                .size(80.dp, 23.dp),
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
                .offset(x = 224.dp, y = 34.dp)
                .size(80.dp, 23.dp),
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
                ListOfPeopleView(null, null)
            }
        }
    }
}
