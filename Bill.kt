package com.example.kotlintest

data class Bill(
    val id: Int = autoGenId++,
    var customer: String = "",
) {
    private var _listOfDish: MutableList<Dish> = mutableListOf()
    private val listOfDish: List<Dish>
        get() = _listOfDish.toList()

    fun addDish(dish: Dish) {
        _listOfDish.add(dish)
    }

    fun getTotalPrice(): Long {
        return listOfDish.sumOf { it.calculatePrice() }
    }
    companion object {
        private var autoGenId = 0
    }
    fun showBill(){
        println("Customer : $customer")
        for(dish in listOfDish){
            dish.showDish()
        }
        println("Total price : " + getTotalPrice())
    }
}