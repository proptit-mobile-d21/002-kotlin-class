
class  Controller {
    private val list = mutableListOf<Contact>()

     fun addList(contact:Contact){
        list.add(contact)
    }
     fun findNumberByName(name:String){
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