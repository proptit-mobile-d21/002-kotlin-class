class View () {
    private val controller = Controller()

    fun showMenu() {
            println("--------Menu--------")
            println("|1.Add new number---|")
            println("|2.Find number------|")
            println("|3.Print list-------|")
            println("|4.Exit-------------|")
            println("Select your choice:")
    }
    fun run(){
        while (true){
            showMenu()
            when(readln().toInt()){
                1-> {
                    print("Name: ")
                    val name = readln()
                    print("Number:")
                    val number = readln()
                    val newContact =  Contact(name, number)
                    controller.addList(newContact)
                }
                2->{
                    print("Name: ")
                    val name = readln()
                    controller.findNumberByName(name)
                }
                3-> controller.showList()
                4->break
            }
        }
    }
}
