
class  Controller(val view: View) {
    val list = mutableListOf<Model>()

    init {
        while(true){
            var choice = view.show()
            when(choice){
                1-> addList()
                2->findNumber(view.findNum())
                3->showList()
                4->break
            }
        }
    }
    fun addList(){
        list.add(view.addNew())
    }
    fun findNumber(name:String){
        var x = 0
        for(i in list){
            if(i.name == name){
                x = 1
                println("Name: ${i.name}, Number: ${i.number}")
            }
        }
        if(x == 0) println("cannot find number")
    }
    fun showList(){
        for(i in list) println("Name: ${i.name}, Number: ${i.number}")
    }
}