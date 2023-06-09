package com.example.demo

class View {
    private val controller = Controller()
    
    private fun showMenu() {
        println("       MENU        ")
        println("1. Add new contact")
        println("2. Find contact")
        println("3. Show Phonebook")
        println("4. Exit")
        print("Enter your choice: ")
    }
    
    fun run() {
        while (true) {
            showMenu()
            when (readln().toInt()) {
                1 -> {
                    print("Name: ")
                    val name: String = readln()
                    print("Phone number: ")
                    val phone: String = readln()
                    val contact = Contact(name, phone)
                    controller.addContact(contact)
                }
                2 -> {
                    println("1. Find by name")
                    println("2. Find by phone number")
                    print("Enter your choice: ")
                    val find = readln().toInt()
                    if (find == 1) {
                        print("Enter name: ")
                        val name = readln()
                        println(controller.findByName(name))
                    } else if (find == 2) {
                        print("Enter phone number: ")
                        val phone = readln()
                        println(controller.finByPhone(phone))
                    }
                }
                3 -> {
                    controller.showContact()
                }
                4 -> break
                else -> println("Enter again!")
            }
        }
    }
}
