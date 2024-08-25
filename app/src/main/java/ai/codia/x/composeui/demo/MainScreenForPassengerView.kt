package ai.codia.x.composeui.demo

import ai.codia.x.composeui.demo.ui.theme.CodiaDemoComposeUITheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.rememberDatePickerState

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Popup
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.toRoute
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * Created by codia-figma
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreenForPassengerView(navController: NavHostController?, navBackStack: NavBackStackEntry?) {

    val id_user: Int = 1
    val id_route: Int = 1

    var place_departure by rememberSaveable { mutableStateOf("") }
    var place_arrival by rememberSaveable { mutableStateOf("") }
    var time by rememberSaveable { mutableStateOf("") }
    var number_passengers by rememberSaveable { mutableStateOf("") }

    val myIcon: Painter = painterResource(id = R.drawable.image12_192274)
    val myIcon1: Painter = painterResource(id = R.drawable.image3_196527)
    val myIcon2: Painter = painterResource(id = R.drawable.image14_192286)
    val myIcon3: Painter = painterResource(id = R.drawable.image15_192287)

    val textFieldColors = TextFieldDefaults.textFieldColors(
        containerColor = Color(0xffe8e8e8),  // Цвет фона TextField
        focusedIndicatorColor = Color.Green,  // Цвет индикатора при фокусе
        unfocusedIndicatorColor = Color.Black,  // Цвет индикатора без фокуса
    )
    val buttonColors = ButtonDefaults.buttonColors(
        containerColor = Color(0xff009b3a),  // Цвет фона
        contentColor = Color.White
    )

    // Box-192:195-1 Главный экран для пассажира
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffffffff), RoundedCornerShape(0.dp))
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
                .background(Color(0xffe8e8e8), RoundedCornerShape(17.dp))
                .size(330.dp, 338.dp),
        )
        // Empty-192:227-Line 19

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


        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 89.dp, y = 682.dp)
                .size(120.dp, 35.dp),
            shape = RoundedCornerShape(5.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
            )
        ) {
            Text("Пассажир")
        }

        Button(
            onClick = {  navController?.navigate(ScreenDriverView(
                34
            )) },
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 213.dp, y = 682.dp)
                .size(120.dp, 35.dp),
            shape = RoundedCornerShape(5.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.LightGray,
            )
        ) {
            Text("Водитель")
        }

        Box(
        )
        {
            BottomBar(navController)
        }


        // Text-192:281-Найти водителя
        Button(
            onClick = {
                navController?.navigate(ScreenListOfPeople(
                    id_user, id_route
                ))
            },
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 45.dp, y = 449.dp)
                .size(330.dp, 70.dp),
            shape = RoundedCornerShape(0.dp, 0.dp, 16.dp, 16.dp),
            colors = buttonColors
        )
        {
            Text(
                text = "Найти водителя",
            )
        }

        // Text-192:282-Откуда
        TextField(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 45.dp, y = 175.dp)
                .size(330.dp, 70.dp),
            value = place_departure,
            leadingIcon = {
                Image(
                    painter = myIcon,
                    contentDescription = null,
                )
            },
            onValueChange = { place_departure = it },
            placeholder = { Text("Откуда") },
            singleLine = true,
            textStyle = TextStyle(
                fontSize = 24.sp,
                color = Color.DarkGray
            ),
            colors = textFieldColors,
            shape = RoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp),
        )
        // Text-192:283-К
//        Text(
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .offset(x = 99.dp, y = 255.dp)
//                .size(55.dp, 37.dp),
//            text = "Куда",
//            color = Color(0xa3000000),
//            fontSize = 20.sp,
//            fontWeight = FontWeight.Normal,
//            textAlign = TextAlign.Left,
//            overflow = TextOverflow.Ellipsis,
//        )
        TextField(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 45.dp, y = 255.dp)
                .size(330.dp, 54.dp),
            value = place_arrival,
            leadingIcon = {
                Image(
                    painter = myIcon1,
                    contentDescription = null,
                )
            },
            onValueChange = { place_arrival = it },
            placeholder = { Text("Куда") },
            singleLine = true,
            textStyle = TextStyle(
                fontSize = 24.sp,
                color = Color.DarkGray
            ),
            colors = textFieldColors,
        )
        // Text-192:284-К
//        Text(
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .offset(x = 99.dp, y = 327.dp)
//                .size(95.dp, 38.dp),
//            text = "Сегодня",
//            color = Color(0xa3000000),
//            fontSize = 20.sp,
//            fontWeight = FontWeight.Normal,
//            textAlign = TextAlign.Left,
//            overflow = TextOverflow.Ellipsis,
//        )

        TextField(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 45.dp, y = 315.dp)
                .size(330.dp, 60.dp),
            value = time,
            leadingIcon = {
                Icon(Icons.Filled.DateRange, contentDescription = "Calendar") },
            onValueChange = { time = it },
            placeholder = { Text("Сегодня") },
            singleLine = true,
            textStyle = TextStyle(
                fontSize = 24.sp,
                color = Color.DarkGray
            ),
            colors = textFieldColors,
        )
//        Box()
//        {
//            DatePickerDocked()
//        }
        // Text-192:285-К
//        Text(
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .offset(x = 99.dp, y = 399.dp)
//                .size(9.dp, 38.dp),
//            text = "1",
//            color = Color(0xa3000000),
//            fontSize = 20.sp,
//            fontWeight = FontWeight.Normal,
//            textAlign = TextAlign.Left,
//            overflow = TextOverflow.Ellipsis,
//        )
        TextField(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 45.dp, y = 385.dp)
                .size(330.dp, 54.dp),
            value = number_passengers,
            leadingIcon = {
                Image(
                    painter = myIcon3,
                    contentDescription = null,
                )},
//                Icon(Icons.Filled.Person, contentDescription = "Localized description") },
            onValueChange = {
                val filteredText = it.filter{it.isDigit() and (it.toInt() > 0)}
                number_passengers = filteredText
            },
            placeholder = { Text("1") },
            textStyle = TextStyle(
                fontSize = 24.sp,
                color = Color.DarkGray
            ),
            colors = textFieldColors,
            singleLine = true,
        )
        // Image-192:286-1 calendar
//        Image(
//            painter = painterResource(id = R.drawable.image14_192286),
//            contentDescription = null,
//            contentScale = ContentScale.FillBounds,
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .offset(x = 57.dp, y = 328.dp)
//                .size(25.dp, 25.dp),
//        )
        // Image-192:287-1 person
//        Image(
//            painter = painterResource(id = R.drawable.image15_192287),
//            contentDescription = null,
//            contentScale = ContentScale.Fit,
//            modifier = Modifier
//                .align(Alignment.TopStart)
//                .offset(x = 51.dp, y = 396.dp)
//                .size(36.dp, 36.dp),
//        )
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

//        val args = navBackStack?.toRoute<ScreenB>()
//        Column(
//            modifier = Modifier.fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(text = "${args.id}, user id")
//            Button(onClick = {
//                /*ToDo*/
//                navController?.navigate(ScreenA)
//            }) {
//                Text(text = "Go to screen A")
//            }
//        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerDocked() {
    var showDatePicker by remember { mutableStateOf(false) }
    val datePickerState = rememberDatePickerState()
    val selectedDate = datePickerState.selectedDateMillis?.let {
        convertMillisToDate(it)
    } ?: ""

    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        OutlinedTextField(
            value = selectedDate,
            onValueChange = { },
            label = { Text("DOB") },
            readOnly = true,
            trailingIcon = {
                IconButton(onClick = { showDatePicker = !showDatePicker }) {
                    Icon(
                        imageVector = Icons.Default.DateRange,
                        contentDescription = "Select date"
                    )
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp)
        )

        if (showDatePicker) {
            Popup(
                onDismissRequest = { showDatePicker = false },
                alignment = Alignment.TopStart
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = 64.dp)
                        .shadow(elevation = 4.dp)
                        .background(MaterialTheme.colorScheme.surface)
                        .padding(16.dp)
                ) {
                    DatePicker(
                        state = datePickerState,
                        showModeToggle = false
                    )
                }
            }
        }
    }
}

fun convertMillisToDate(millis: Long): String {
    val formatter = SimpleDateFormat("MM/dd/yyyy", Locale.getDefault())
    return formatter.format(Date(millis))
}

@Preview(showBackground = true)
@Composable
fun MainScreenForPassengerViewPreview() {
    CodiaDemoComposeUITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                MainScreenForPassengerView(null, null)
            }
        }
    }
}
