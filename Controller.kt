val list = mutableListOf<Model>()
class Controller(var model: Model) {
    fun AddList(){
        list.add(model)
    }
    fun FindNumber(name:String){
        var x = 0
        for(i in list){
            if(i.name == name){
                x = 1
                println("Name: ${i.name}, Number: ${i.number}")
            }
        }
        if(x == 0) println("cannot find number")
    }
}