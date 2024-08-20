package ai.codia.x.composeui.demo

import ai.codia.x.composeui.demo.ui.theme.CodiaDemoComposeUITheme
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoDatabase
import org.bson.Document

/**
 * Created by codia-figma
 */
class MainActivity1 : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CodiaDemoComposeUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                        MainScreenForDriverView()
                    }
                }
            }
        }
    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CodiaDemoComposeUITheme {
        MainScreenForPassengerView()
    }
}

fun main() {
    val connectionString = "mongodb+srv://Tmin:u2x7kuMvZcAvX1cA@cluster0.vpkk5.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"
    val client: MongoClient = MongoClients.create(connectionString)

    val database: MongoDatabase = client.getDatabase("ttraveldb")
    val collection = database.getCollection("test")

    val document = Document("name", "John Doe").append("age", 29)
    collection.insertOne(document)

    println("Document inserted successfully!")

    client.close()
}