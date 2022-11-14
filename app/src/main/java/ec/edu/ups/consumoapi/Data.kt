package ec.edu.ups.consumoapi
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.encodeToString
@Serializable
data class Data(val a: String, val b: String)
fun main() {
    val data = Data("kotlinx.serialization", "Kotlin")
    val string = Json.encodeToString(data)
    println(string) // {"name":"kotlinx.serialization","language":"Kotlin"}
    // Deserializing back into objects
    val obj = Json.decodeFromString<Data>(string)
    println(obj) // Project(name=kotlinx.serialization, language=Kotlin)
}