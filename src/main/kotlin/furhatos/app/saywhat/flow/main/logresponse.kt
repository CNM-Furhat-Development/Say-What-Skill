package furhatos.app.saywhat.flow.main
import java.io.File
import java.io.FileWriter
import java.time.Instant
import java.time.format.DateTimeFormatter

fun logResponse(str: String){

    val content = "${DateTimeFormatter.ISO_INSTANT.format(Instant.now())},$str"
    val file = File("./saywhat.csv")
    val writer = FileWriter(file, true)
    writer.append(content,"\n")
    println(content)
    writer.close()
}