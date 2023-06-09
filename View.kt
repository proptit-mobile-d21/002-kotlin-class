class View(){
    fun showMenu(){
        while(true){
            println("._________________________.")
            println("|           MENU          |")
            println("|1. Add new a phone number|")
            println("|2. Find a phone number   |")
            println("|3. Show phone number     |")
            println("|4. Exit                  |")
            println("._________________________.")
            print("Your choice: ")
            val choiceMenu = readln()!!.toInt()
            val controller = Controller()
            when(choiceMenu){
                1 -> {
                    print("Your name: ")
                    val name = readln()
                    print("Your phone number: ")
                    val phoneNumber = readln()

                    val model = Contact(name,phoneNumber)
                    controller.addPhoneNumber(model)
                }
                2 -> {
                    println("1. Find by name")
                    println("2. Find by phone number")
                    print("Your choice: ")
                    val choiceFind = readln()!!.toInt()
                    if(choiceFind == 1){
                        print("Your name: ")
                        val name = readln()
                        controller.findByName(name)
                    }else if(choiceFind == 2){
                        print("Your phone number: ")
                        val phoneNumber = readln()
                        controller.findByPhoneNumber(phoneNumber)
                    }else{
                        println("Wrong !!!")
                    }
                }
                3 -> {
                    controller.showPhoneNumber()
                }
                4 -> break
                else -> println("Wrong !!!")
            }
        }
    }
}