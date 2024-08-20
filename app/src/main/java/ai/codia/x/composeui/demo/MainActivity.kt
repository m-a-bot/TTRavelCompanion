//package ai.codia.x.composeui.demo//package ai.codia.x.composeui.demo
////
////import ai.codia.x.composeui.demo.ui.theme.CodiaDemoComposeUITheme
////import android.os.Bundle
////import androidx.activity.ComponentActivity
////import androidx.activity.compose.setContent
////import androidx.compose.foundation.layout.Column
////import androidx.compose.foundation.layout.fillMaxSize
////import androidx.compose.foundation.rememberScrollState
////import androidx.compose.foundation.verticalScroll
////import androidx.compose.material3.MaterialTheme
////import androidx.compose.material3.Surface
////import androidx.compose.runtime.Composable
////import androidx.compose.ui.Modifier
////import androidx.compose.ui.tooling.preview.Preview
////import com.yandex.mapkit.MapKitFactory
////
/////**
//// * Created by codia-figma
//// */
////class ai.codia.x.composeui.demo.MainActivity : ComponentActivity() {
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        MapKitFactory.setApiKey("79ec8cd6-1510-43cd-991e-502eea9e6583")
////        MapKitFactory.initialize(this)
////
////        setContent {
////            CodiaDemoComposeUITheme {
////                // A surface container using the 'background' color from the theme
////                Surface(
////                    modifier = Modifier.fillMaxSize(),
////                    color = MaterialTheme.colorScheme.background
////                ) {
////                    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
////                        MainScreenForPassengerView()
////                    }
////                }
////            }
////        }
////    }
////}
////
////
////
////@Preview(showBackground = true)
////@Composable
////fun GreetingPreview() {
////    CodiaDemoComposeUITheme {
////        HumanCardView()
////    }
////}
//
//import ai.codia.x.composeui.demo.ui.theme.CodiaDemoComposeUITheme
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.viewinterop.AndroidView
//import com.yandex.mapkit.MapKitFactory
//import com.yandex.mapkit.map.CameraPosition
//import com.yandex.mapkit.mapview.MapView
//
//import com.yandex.mapkit.geometry.Point
//
//import com.yandex.runtime.image.ImageProvider
//
////class ai.codia.x.composeui.demo.MainActivity : ComponentActivity() {
////
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////
////        // Initialize Yandex MapKit
////        MapKitFactory.setApiKey("79ec8cd6-1510-43cd-991e-502eea9e6583")
////        MapKitFactory.initialize(this)
////
////        setContent {
////            CodiaDemoComposeUITheme {
////                ai.codia.x.composeui.demo.YandexMapWithUI()
////            }
////        }
////    }
////
////    override fun onStart() {
////        super.onStart()
////        MapKitFactory.getInstance().onStart()
////    }
////
////    override fun onStop() {
////        MapKitFactory.getInstance().onStop()
////        super.onStop()
////    }
////}
//
//class MainActivity : ComponentActivity() {
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
//                    YandexMapWithUI()
//                }
//            }
//        }
//    }
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
//
//@Composable
//fun YandexMapWithUI() {
//    val context = LocalContext.current
//
//    // Control the camera position with state
//    var cameraPosition by remember {
//        mutableStateOf(
//            CameraPosition(Point(55.751244, 37.618423), 11.0f, 0.0f, 0.0f)
//        )
//    }
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceBetween
//    ) {
//        // Header Text
//        Text(
//            text = "Yandex Map Integration",
//            modifier = Modifier.padding(16.dp),
//            style = MaterialTheme.typography.headlineMedium
//        )
//
//        // MapView as part of the Compose UI
//        AndroidView(
//            modifier = Modifier
//                .weight(1f)
//                .fillMaxWidth(),
//            factory = {
//                MapView(context).apply {
//                    map.move(cameraPosition)
//
//                    // Example placemark
//                    map.mapObjects.addPlacemark(
//                        Point(55.751244, 37.618423),
//                        ImageProvider.fromResource(context, R.drawable.image10_192244)
//                    )
//                }
//            },
//            update = { mapView ->
//                mapView.map.move(cameraPosition)
//            }
//        )
//
//        // Buttons to control the map
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
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    CodiaDemoComposeUITheme {
//        MainScreenForPassengerView()
//    }
//}
