
class View {
    private val utility = Utility()
    val controller = Controller(utility)
    lateinit var name: String
    lateinit var phoneNum: String

    fun init(){
        while(true){
            println("---------MENU---------")
            println("---Choose an option---")
            println("1.Add new contact.")
            println("2.Find contact by name.")
            println("3.Show all contacts.")
            println("4.Exit.")
            var input = utility.toOption()
            if(input == 4) break
            when (input) {
                1 -> {
                    println("Input name: ")
                    name = readln()
                    println("Input phone number: ")
                    phoneNum = readln()
                    controller.addContact(name, phoneNum)
                }

                2 -> {
                    println("Input name that you want to find: ")
                    name = readln()
                    val contact = controller.findByName(name)
                    if(contact != null){
                        println("")
                    }
                }

                3 -> {
                    println("All contacts: ")
                    controller.showAllContacts()
                }
                else -> {
                    println("It's not an availaible option. Please choose again.")
                }
            }
        }
    }
}