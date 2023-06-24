package com.example.kotlintest
import java.util.Scanner

class Controller {
    private val menu: MutableList<Dish> = mutableListOf()
    private val listOfBill: MutableList<Bill> = mutableListOf()
    private val scanner = Scanner(System.`in`)

    fun run() {
        var choice: Int
        do {
            Display.display()
            choice = Integer.parseInt(scanner.nextLine())
            when (choice) {
                1 -> {
                    menu.add(Display.addDishDisplay())
                }
                2 -> {
                    val bill = Bill()
                    println("Your bill ID is " + bill.id)
                    print("Enter customer's name: ")
                    bill.customer = scanner.nextLine()
                    while (true) {
                        print("Enter dish's name: ")
                        val name = scanner.nextLine()
                        if (name == "End") break
                        var checkDish = false
                        for (dish in menu) {
                            if (dish.name == name) {
                                bill.addDish(dish)
                                checkDish = true
                                break
                            }
                        }
                        if (!checkDish) {
                            println("Can't find the dish")
                        } else {
                            println("Add successfully!")
                        }
                    }
                    println("Your bill is " + bill.getTotalPrice())
                    listOfBill.add(bill)
                }
                3 -> {
                    for (dish in menu) {
                        dish.showDish()
                    }
                }
                4 -> {
                    print("Enter bill's ID: ")
                    val id = scanner.nextLine().toInt()
                    for (bill in listOfBill) {
                        if (bill.id == id) {
                            bill.showBill()
                        }
                    }
                }
                else -> Display.exit()
            }
        } while (choice != 0)
    }
}
