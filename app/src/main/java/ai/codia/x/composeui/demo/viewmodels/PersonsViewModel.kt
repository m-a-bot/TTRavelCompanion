package ai.codia.x.composeui.demo.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yandex.mapkit.geometry.Point

data class Person(
    val id_person: Int,
    val name: String,
    val id_card: Int,
    val birth_date: String,
    val rating: Double,
    val location: Point = Point(54.974509, 48.290636)
)

class PersonViewModel : ViewModel() {

    private val _items = MutableLiveData<Person>()
    val items: LiveData<Person> = _items

    /*ToDo*/
    init {
        loadItems()
    }

    private fun loadItems() {
        _items.value = Person(1, "Максим", 1, "13.07.2004", 4.5)
    }
}