import java.io.File
import java.io.InputStream


fun main(args: Array<String>) {
        val inputStream: InputStream = File("checksum.txt").inputStream()
        var digits: List<String>
        var newDigits: List<Int>
        var total: Int = 0



        inputStream.bufferedReader().useLines { lines ->
            lines.forEach { line ->

                //for each string, split by space - should hopefully produce another list
                var delimiter = " "
                digits = line.split(delimiter)

                //turn them into ints
                newDigits = digits.map { it.toInt() }


                val length = newDigits.size

                for(i in 0 until length){

                    for(j in 0 until length){

                        if (i == j) continue


                        if(newDigits[i]% newDigits[j] == 0){
                            total += (newDigits[i] / newDigits[j])

                            println(total)
                        }
                        //println(newDigits[i].toString() + newDigits[j].toString())

                        }

                    }
                }

                }


            }







