package com.example.demo

class Controller {

    private val list = mutableListOf<Contact>()

    fun addContact(contact: Contact) {
        list.add(contact)
    }

    fun findByName(name: String): String {
        var exist = 0
        for (it in list) {
            if (it.name == name) {
                exist = 1
               return "${it.name}: ${it.phoneNumber}"
            }
        }
        if (exist == 0) {
            return "Cannot find contact"
        }
    }

    fun finByPhone(phone: String): String {
        var exist = 0
        for (it in list) {
            if (it.phoneNumber == phone) {
                exist = 1
                return "${it.name}: ${it.phoneNumber}"
            }
        }
        if (exist == 0) {
            return "Cannot find contact"
        }
    }

    fun showContact() {
        if (list.isEmpty())
            println("Empty contacts")
        else {
            println("Phonebook:")
            var d = 1
            for (it in list) {
                println("${d++}. ${it.name}: ${it.phoneNumber}")
            }
        }
    }
}
