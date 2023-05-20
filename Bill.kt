package com.example.kotlintest

class Bill {
    companion object {
        private var currentID = 0

        fun generateID(): Int {
            return currentID++
        }
    }
    private val ID: Int
    private var customer: String
    private val listOfDish: MutableList<Dish>
    private var totalPrice: Long
    init{
        ID = generateID()
        customer = ""
        listOfDish = mutableListOf()
        totalPrice = 0L
    }
    fun getID(): Int { return this.ID }
    fun setCustomer(name: String) { this.customer = name }
    fun getCustomer():String { return this.customer }
    fun addDish(dish: Dish){
        this.totalPrice += dish.getPrice()
    }
    fun getTotalPrice(): Long{ return this.totalPrice }
    fun showBill(){
        println("Customer : " + this.customer)
        for(dish in listOfDish){
            dish.showDish()
        }
        println("Total price : " + this.totalPrice)
    }
}