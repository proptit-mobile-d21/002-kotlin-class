package com.example.kotlintest

import kotlin.math.roundToLong

data class Ingredient(val name: String, val origin: String, val price: Double)
data class Dish (
    var name: String = "",
) {
    private val _listOfIngredient: MutableMap<Ingredient, Double> = mutableMapOf()
    private val listOfIngredient:Map<Ingredient, Double>
    get() = _listOfIngredient.toMap()

    fun addIngredient(ingredient: Ingredient, amount: Double) {
        _listOfIngredient[ingredient] = amount
    }

    fun calculatePrice(): Long {
        return (listOfIngredient.values.sum() * 2.5/1000).roundToLong()*1000
    }
    fun calculateCost(): Double {
        return listOfIngredient.values.sum()
    }
    fun showDish() {
        println("Name: " + this.name)
        println("Ingredients:")
        for (ingredient in listOfIngredient) {
            println(ingredient.key.name + " from " + ingredient.key.origin)
        }
        println("Price: " + calculatePrice())
    }
}