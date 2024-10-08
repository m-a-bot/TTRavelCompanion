package ai.codia.x.composeui.demo.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yandex.mapkit.geometry.Point

data class Route (
    /*
    point1
    point2
    * */
    val point1: Point,
    val point2: Point,
    val description1: String,
    val description2: String
)

class RouteViewModel : ViewModel() {

    private val _items = MutableLiveData<Route>()
    val items: LiveData<Route> = _items

    init {

    }

    private fun loadItems() {
        _items.value = Route(Point(54.974509, 48.290636), Point(54.974509, 48.290636),
            "123", "123")
    }
}