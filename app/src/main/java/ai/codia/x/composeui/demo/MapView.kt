package ai.codia.x.composeui.demo

import ai.codia.x.composeui.demo.ui.theme.CodiaDemoComposeUITheme
import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.mapview.MapView

import com.yandex.mapkit.geometry.Point

import com.yandex.runtime.image.ImageProvider


import android.util.Log
import android.widget.Toast
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.yandex.mapkit.RequestPoint
import com.yandex.mapkit.RequestPointType
import com.yandex.mapkit.directions.DirectionsFactory
import com.yandex.mapkit.directions.driving.DrivingOptions
import com.yandex.mapkit.directions.driving.DrivingRoute
import com.yandex.mapkit.directions.driving.DrivingRouterType
import com.yandex.mapkit.directions.driving.DrivingSession
import com.yandex.mapkit.directions.driving.VehicleOptions
import com.yandex.mapkit.map.TextStyle
import com.yandex.runtime.Error
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.Serializable
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet

@SuppressLint("RememberReturnType")
@Composable
fun YandexMapWithRoute() {
    val context = LocalContext.current

    // Инициализация MapKit
    LaunchedEffect(Unit) {
        MapKitFactory.initialize(context)
    }

    // Хранение MapView и маршрутизатора с использованием remember
    val mapView = remember {
        MapView(context).apply {
            map.move(CameraPosition(Point(55.408180, 48.701441), 7.88f, 0.0f, 0.0f))
        }
    }

    val drivingRouter = DirectionsFactory.getInstance().createDrivingRouter(DrivingRouterType.COMBINED)

    val drivingOptions = DrivingOptions().apply {
        routesCount = 3
    }

    val vehicleOptions = VehicleOptions()

    val startPoint = Point(55.790775, 49.121856)
    val endPoint = Point(54.974509, 48.290636)

    val points = buildList {
        add(RequestPoint(startPoint, RequestPointType.WAYPOINT, null, null))
        add(RequestPoint(endPoint, RequestPointType.WAYPOINT, null, null))
    }

    val drivingRouteListener = object : DrivingSession.DrivingRouteListener {
        override fun onDrivingRoutes(routes: MutableList<DrivingRoute>) {
            // Handle request routes success ...
            if (routes.isNotEmpty()) {
                val route: DrivingRoute = routes[0]
                val mapObjects = mapView.map.mapObjects
                mapObjects.addPolyline(route.geometry)
            }
        }

        override fun onDrivingRoutesError(p0: Error) {
            // Handle request routes error ...
            Toast.makeText(context, "Ошибка при построении маршрута: $p0", Toast.LENGTH_LONG).show()
        }
    }

    val drivingSession = drivingRouter.requestRoutes(
        points,
        drivingOptions,
        vehicleOptions,
        drivingRouteListener
    )

    val map = mapView.mapWindow.map

    val placemark1 = map.mapObjects.addPlacemark(
        Point(55.790775, 49.121856),
        ImageProvider.fromResource(context, R.drawable.image12_192274)
    )
    placemark1.setText(
        "Вы",
        TextStyle().apply {
            color = Color.BLACK // Цвет текста
            size = 12.0f         // Размер текста
            // Другие настройки стиля
            offset = 350.0F
            offsetFromIcon = true
        }
    )

    val placemark2 = map.mapObjects.addPlacemark(
        Point(54.974509, 48.290636),
        ImageProvider.fromResource(context, R.drawable.image3_196527)
    )
    placemark2.setText(
        "Максим",
        TextStyle().apply {
            color = Color.BLACK // Цвет текста
            size = 12.0f         // Размер текста
            // Другие настройки стиля
            offset = 35.0F
            offsetFromIcon = true
        }
    )




//    // Отображение карты с помощью AndroidView
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { mapView },
        update = { /* Вы можете обновлять состояние карты, если нужно */ }
    )
//
//    // Управление жизненным циклом MapView
    DisposableEffect(Unit) {
        onDispose {
            mapView.onStop()
        }
    }
}