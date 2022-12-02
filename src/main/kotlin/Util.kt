import java.io.InputStream
import java.lang.Exception

object Util {
    fun getResourceFileLines(path: String): List<String> {
        val inputStream: InputStream? = this::class.java.getResourceAsStream(path)
        if (inputStream == null)
            throw Exception("java getResourceAsStream returned null for $path")
        else
            return inputStream.bufferedReader().readLines()
    }
}