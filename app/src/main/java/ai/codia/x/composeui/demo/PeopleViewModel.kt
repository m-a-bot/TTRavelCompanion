package ai.codia.x.composeui.demo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.Date

enum class User {
    DRIVER,
    COMPANION
}

data class Persons (
    val id_person: Int,
    val id_card: Int,
    val name: String,
    val birth_data: String,
    val rating: Double
)

data class NearPersons (
    val id_person: Int,
    val name: String,
    val distance: String,
    val date_time: String,
    val is_driver: User
)


class NearPersonsViewModel : ViewModel() {

    private val _items = MutableLiveData<List<NearPersons>>()
    val items: LiveData<List<NearPersons>> = _items

    init {
        loadItems()
    }

    private fun loadItems() {
        _items.value = listOf(
            NearPersons(1, "Максим", "543 м", "15:00", User.DRIVER),
            NearPersons(2, "Анар", "1 км", "09:00", User.DRIVER),
            NearPersons(3, "Айгуль", "976 м", "10:00", User.DRIVER),
            NearPersons(4, "Катя", "473 м", "07:00", User.DRIVER),
            NearPersons(5, "Данис", "2 км", "12:30", User.DRIVER),
            NearPersons(6, "Анар", "935 м", "17:00", User.DRIVER),

            NearPersons(7, "Максим", "543 м", "15:00", User.DRIVER),
            NearPersons(8, "Анар", "1 км", "09:00", User.DRIVER),
            NearPersons(9, "Айгуль", "976 м", "10:00", User.DRIVER),
            NearPersons(10, "Катя", "473 м", "07:00", User.DRIVER),
            NearPersons(11, "Данис", "2 км", "12:30", User.DRIVER),
            NearPersons(12, "Анар", "935 м", "17:00", User.DRIVER),
        )
    }

    // Функции для обновления списка
    fun addItem() {
//        val currentList = _items.value.orEmpty().toMutableList()
//        currentList.add(item)
//        _items.value = currentList
    }

    fun removeItem() {

    }

    fun updateItem() {

    }
}