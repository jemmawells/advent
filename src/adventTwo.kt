import java.io.File
import java.io.InputStream

fun main(args: Array<String>) {
    val inputStream: InputStream = File("C:\\Users\\vi0452\\Documents\\checksum.txt").inputStream()
    var digits: List<String>
    var newDigits: List<Int>
    var total = 0

    inputStream.bufferedReader().useLines { lines ->
        lines.forEach { line ->

            //for each string, split by space - should hopefully produce another list
            var delimiter = " "
            digits = line.split(delimiter)

            //turn them into ints
            newDigits = digits.map { it.toInt() }

            //for the new int list, find the max and the min
            val maximum = newDigits.max() ?: 0
            val minimum = newDigits.min() ?: 0

            //find difference between max and min
            val diff = minus(maximum, minimum)

            //add all the differences together to find total
            total += diff

            println(total)
        }
    }
}

fun minus(maximum: Int, minimum: Int): Int {
    return maximum - minimum

}





