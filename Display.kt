package com.example.kotlintest

import java.util.*

class Display {
    companion object {
        fun display(){
            println("1.Add a dish to the menu")
            println("2.Create a new bill")
            println("3.Show the menu")
            println("4.Show the bill")
            println("0.Exit")
            print("Enter your choice: ")
        }
        fun exit(){
            println("Thanks for using !")
        }
        fun addDishDisplay():Dish{
            val scanner = Scanner(System.`in`)
            val dish = Dish()
            print("Enter dish name: ")
            dish.setName(scanner.nextLine())
            println("Type \"End\" to end the ingredients list")
            while(true) {
                print("Enter ingredient's name: ")
                val tmpName = scanner.nextLine()
                if (tmpName == "End") break
                print("Enter ingredient's origin: ")
                val tmpOrigin = scanner.nextLine()
                print("Enter ingredient's price (per kilogram): ")
                val tmpPrice = scanner.nextLine().toDouble()
                print("Enter ingredient's amount (kilograms): ")
                val tmpAmount = scanner.nextLine().toDouble()
                val ingredient = Ingredient(tmpName, tmpOrigin, tmpPrice)
                dish.addIngredient(ingredient, tmpAmount)
                dish.calculatePrice()
            }
            return dish
        }
    }
}