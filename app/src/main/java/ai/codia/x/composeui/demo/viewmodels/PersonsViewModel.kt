package ai.codia.x.composeui.demo.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class Person(
    val id_person: Int,
    val name: String,
    val id_card: Int,
    val birth_date: String,
    val rating: Double
)

class PersonViewModel : ViewModel() {

    private val _items = MutableLiveData<Person>()
    val items: LiveData<Person> = _items

    /*ToDo*/
}