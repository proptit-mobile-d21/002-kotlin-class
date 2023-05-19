package view

import model.Student
import java.util.Scanner

class MainView {
    companion object {
        private val scanner = Scanner(System.`in`)
    }

    internal fun mainMenu(): Int {
        println("---MENU---")
        println("1. Add a new student")
        println("2. Display all students")
        println("3. Filter students by name")
        println("4. Exit")
        println("----------")
        print("Enter your choice: ")
        val a = scanner.nextInt()
        scanner.nextLine()
        return a
    }

    internal fun addStudentMenu(): Student {
        println("---ADD STUDENT---")
        print("Name: ")
        val name = scanner.nextLine()
        print("Age: ")
        val age = scanner.nextInt()
        scanner.nextLine()
        return Student(name, age)
    }

    internal fun filterStudentsByName(): String {
        println("---FILTER STUDENT BY NAME---")
        print("Name: ")
        return scanner.nextLine()
    }

    internal fun sendMessage(mess: String) {
        println(mess)
    }
}