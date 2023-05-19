package com.example.demo

val list = mutableListOf<Model>()

class Controller {
    fun addContact(model: Model) {
        list.add(model)
    }

    fun findByName(name: String) {
        var exist = 0
        for (it in list) {
            if (it.name == name) {
                exist = 1
                println("${it.name}: ${it.phoneNumber}")
            }
        }
        if (exist == 0) {
            println("Cannot find contact")
        }
    }

    fun finByPhone(phone: String) {
        var exist = 0
        for (it in list) {
            if (it.phoneNumber == phone) {
                exist = 1
                println("${it.name}: ${it.phoneNumber}")
            }
        }
        if (exist == 0) {
            println("Cannot find contact")
        }
    }

    fun showContact() {
        println("Phonebook:")
        var d = 1
        for (it in list) {
            println("${d++}. ${it.name}: ${it.phoneNumber}")
        }
    }
}