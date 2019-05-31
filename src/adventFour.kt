import java.io.File
import java.io.InputStream

fun main(args: Array<String>) {
    val inputStream: InputStream = File("passphrase.txt").inputStream()
    var passphrase: List<String>


    inputStream.bufferedReader().useLines { lines ->
        lines.forEach { line ->

            //for each string, split by space - should hopefully produce another list
            var delimiter = " "
            passphrase = line.split(delimiter)

//            val newPassphrase = passphrase.map { it.toString() }

            val length = passphrase.size
            var sum: Int = 0

            for (i in 0 until length) {

                for (j in 0 until length) {

                    if (i == j) continue

                    if (passphrase[i] == passphrase[j]) {

                        println(passphrase)

                    }





                }


            }



        }
    }

}


