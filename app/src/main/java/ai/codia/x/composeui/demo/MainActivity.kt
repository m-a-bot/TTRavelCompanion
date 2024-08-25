package ai.codia.x.composeui.demo//package ai.codia.x.composeui.demo
//
//import ai.codia.x.composeui.demo.ui.theme.CodiaDemoComposeUITheme
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.yandex.mapkit.MapKitFactory
//
///**
// * Created by codia-figma
// */
//class ai.codia.x.composeui.demo.MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        MapKitFactory.setApiKey("79ec8cd6-1510-43cd-991e-502eea9e6583")
//        MapKitFactory.initialize(this)
//
//        setContent {
//            CodiaDemoComposeUITheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//                        MainScreenForPassengerView()
//                    }
//                }
//            }
//        }
//    }
//}
//
//
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    CodiaDemoComposeUITheme {
//        HumanCardView()
//    }
//}

import ai.codia.x.composeui.demo.ui.theme.CodiaDemoComposeUITheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.mapview.MapView

import com.yandex.mapkit.geometry.Point

import com.yandex.runtime.image.ImageProvider


import android.util.Log
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.Serializable
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet

//class ai.codia.x.composeui.demo.MainActivity : ComponentActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Initialize Yandex MapKit
//        MapKitFactory.setApiKey("79ec8cd6-1510-43cd-991e-502eea9e6583")
//        MapKitFactory.initialize(this)
//
//        setContent {
//            CodiaDemoComposeUITheme {
//                ai.codia.x.composeui.demo.YandexMapWithUI()
//            }
//        }
//    }
//
//    override fun onStart() {
//        super.onStart()
//        MapKitFactory.getInstance().onStart()
//    }
//
//    override fun onStop() {
//        MapKitFactory.getInstance().onStop()
//        super.onStop()
//    }
//}


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.setApiKey("79ec8cd6-1510-43cd-991e-502eea9e6583")
        MapKitFactory.initialize(this)
        connectToPostgres()
        setContent {
            CodiaDemoComposeUITheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = ScreenA
                ){
                    composable<ScreenA> {
                        ToOurServiceView(navController)
                    }
                    composable<ScreenPassengerView>
                    {
                        MainScreenForPassengerView(navController, it)
                    }
                    composable<ScreenC>
                    {
                        YandexMapWithUI(navController)
                    }

                    composable<ScreenDriverView>
                    {
                        MainScreenForDriverView(navController, it)
                    }

                    composable<ScreenListOfPeople>
                    {
                        ListOfPeopleView(navController, it)
                    }

                    composable<ScreenDetailOfTrip>
                    {
                        HumanCardView(navController)
                    }

                    composable<ScreenDriversRequest>
                    {
                        DriverRequestView(navController)
                    }
                    composable<ScreenDriversResponse>
                    {
                        DriverResponseView(navController)
                    }

                    composable<ScreenResponseToRequest>
                    {
                        ResponseToRequestView(navController)
                    }
                    composable<ScreenEndOfTrip>
                    {
                        EndOfTripView(navController)
                    }
                    composable<ScreenIntegrationTS>
                    {
                        TransportSystemIntegrationView(navController)
                    }
                    composable<ScreenListUsers>
                    {
                        ListUsersView(navController, it)
                    }
                    composable<ScreenAccrual>
                    {
                        AccrualOfPointsView(navController)
                    }
                }
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    YandexMapWithUI()
//                }
            }
        }
    }
    override fun onStart() {
        super.onStart()
        MapKitFactory.getInstance().onStart()
    }

    override fun onStop() {
        MapKitFactory.getInstance().onStop()
        super.onStop()
    }

    @OptIn(DelicateCoroutinesApi::class)
    private fun connectToPostgres() {
        // Запускаем в корутинах, чтобы не блокировать основной поток
        kotlinx.coroutines.GlobalScope.launch {
            try {
                val url = "jdbc:postgresql://176.123.167.142:5432/ttraveldb"
                val props = java.util.Properties()
                props.setProperty("user", "postgres")
                props.setProperty("password", "20021081")

                // Создаем соединение
                val conn: Connection = withContext(Dispatchers.IO) {
                    DriverManager.getConnection(url, props)
                }

                // Выполняем запрос
                val stmt = conn.createStatement()
                val rs: ResultSet = stmt.executeQuery("SELECT * FROM cards")

                // Обрабатываем результат
                while (rs.next()) {
                    val columnData = rs.getString("balance")
                    Log.d("PostgreSQL", "Data: $columnData")
                }

                // Закрываем соединение
                rs.close()
                stmt.close()
                conn.close()

            } catch (e: Exception) {
                Log.e("PostgreSQL", "Connection failed", e)
            }
        }
    }
}

@Composable
fun YandexMapWithUI(navController: NavHostController?) {
    val context = LocalContext.current

    // Control the camera position with state
    var cameraPosition by remember {
        mutableStateOf(
            CameraPosition(Point(55.810835, 49.127887), 6.5f, 0.0f, 0.0f)
        )
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        // MapView as part of the Compose UI
        AndroidView(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            factory = {
                MapView(context).apply {
                    map.move(cameraPosition)

                    // Example placemark
                    map.mapObjects.addPlacemark(
                        Point(55.790775, 49.121856),
                        ImageProvider.fromResource(context, R.drawable.image12_192274)
                    )

                    map.mapObjects.addPlacemark(
                        Point(54.974509, 48.290636),
                        ImageProvider.fromResource(context, R.drawable.image3_196527)
                    )
                }
            },
            update = { mapView ->
                mapView.map.move(cameraPosition)
            }
        )

        // Buttons to control the map
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp),
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ) {
//            Button(onClick = {
//                // Move the camera to a different location
//                cameraPosition = CameraPosition(Point(59.9342802, 30.3350986), 11.0f, 0.0f, 0.0f)
//            }) {
//                Text(text = "Move to SPB")
//            }
//            Button(onClick = {
//                // Reset camera to the initial position
//                cameraPosition = CameraPosition(Point(55.751244, 37.618423), 11.0f, 0.0f, 0.0f)
//            }) {
//                Text(text = "Move to Moscow")
//            }
//        }
    }
}

@Serializable
object ScreenA


@Serializable
data class ScreenPassengerView(
    val id: Int
)


@Serializable
object ScreenC

@Serializable
data class ScreenDriverView(
    val id: Int
)

@Serializable
data class ScreenListOfPeople(
    val id: Int,
    val id_route: Int
)

@Serializable
object ScreenDetailOfTrip

@Serializable
object ScreenDriversRequest

@Serializable
object ScreenDriversResponse

@Serializable
object ScreenIntegrationTS

@Serializable
object ScreenResponseToRequest

@Serializable
object ScreenEndOfTrip

@Serializable
object ScreenListUsers

@Serializable
object ScreenAccrual