package com.example.kotlintest

import kotlin.math.roundToLong

data class Ingredient(val name: String, val origin: String, val price: Double)
class Dish {
    private var name: String
    private val listOfIngredient: MutableMap<Ingredient, Double>
    private var cost: Double
    private var price: Long
    init {
        name = ""
        listOfIngredient = mutableMapOf()
        cost = 0.0
        price = 0L
    }
    fun setName(name: String) { this.name = name }
    fun getName(): String { return this.name }
    fun addIngredient(ingredient: Ingredient, amount: Double) {
        this.listOfIngredient[ingredient] = amount
        this.cost += (ingredient.price * amount)
    }
    fun calculatePrice() {
        this.price = (this.cost * 2.5 / 1000).roundToLong() * 1000
    }
    fun getPrice(): Long { return this.price }
    fun getCost(): Double { return this.cost }
    fun showDish() {
        println("Name: " + this.name)
        println("Ingredients:")
        for (ingredient in listOfIngredient) {
            println(ingredient.key.name + " from " + ingredient.key.origin)
        }
        println("Price: " + this.price)
    }
}