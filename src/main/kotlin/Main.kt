package org.example

import java.io.File
import java.io.FileWriter

fun main() {

    var filePath = "/home/deck/Documents/"
    var name = "arrayNumbers"
    var number = 17
    var file = File(filePath+"text")
    var fileTwo = File(filePath+name)
    recordFile(file, "запись и чтение прошли успешно")
    println(readFile("text", filePath))

    //writingPositiveEvenNumbers(fileTwo, number)
    //println(readFile(name, filePath))
    getTwoFirstAndTwoSecondNumbers(name, filePath)
}

fun writingPositiveEvenNumbers(file: File, num: Int) {
    for (i in 0..num) {
        if (i%2==0) {
            recordFile(file, i.toString()+",")
        }
    }
}

fun recordFile(file: File, string: String) {
    var fileWriter = FileWriter(file, true)
    fileWriter.write(string)
    fileWriter.close()
}

fun readFile(name: String, path: String): String {
    var file = File(path+name)
    return file.readText()
}

fun getTwoFirstAndTwoSecondNumbers(name: String, path: String) {
    val string = readFile(name, path).trim()
    val numbers = string.split(",").map { it.trim() }.filter { it.isNotEmpty() } // Разделяем строку и удаляем лишние пробелы

    if (numbers.size >= 2) {
        println("Первое число: ${numbers[0]}")
        println("Второе число: ${numbers[1]}")
    } else {
        println("Недостаточно чисел в списке.")
    }

    if (numbers.size >= 2) {
        println("Последнее число: ${numbers[numbers.size - 1]}")
        println("Предпоследнее число: ${numbers[numbers.size - 2]}")
    } else if (numbers.size == 1) {
        println("Последнее число: ${numbers[0]}")
    } else {
        println("Недостаточно чисел в списке.")
    }
}
