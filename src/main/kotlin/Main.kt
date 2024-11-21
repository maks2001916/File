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

    writingPositiveEvenNumbers(fileTwo, number)
    println(readFile(name, filePath))
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