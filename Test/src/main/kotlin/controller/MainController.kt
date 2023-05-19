package controller

import model.Student
import view.MainView

class MainController(private val view: MainView) {
    private var choice: Int = 0
    private val studentList = mutableListOf<Student>()

    init {
        while (true) {
            choice = view.mainMenu()
            when (choice) {
                1 -> addStudent()
                2 -> displayAllStudents()
                3 -> filterStudents(view.filterStudentsByName()).forEach { view.sendMessage(it.toString()) }
                4 -> break
            }
        }
    }

    private fun addStudent() {
        studentList.add(view.addStudentMenu())
    }

    private fun displayAllStudents() {
        view.sendMessage("---DISPLAY ALL STUDENTS---")
        studentList.forEach { view.sendMessage(it.toString()) }
    }

    private fun filterStudents(name: String): List<Student> {
        return studentList.filter { it._name == name }
    }
}