val list = mutableListOf<Contact>()
class Controller(){
    fun addPhoneNumber(model: Contact){
        list.add(model)
    }
    fun findByName(name: String){
        for(it in list){
            if(it.name.equals(name)){
                println("Name: ${it.name} | Phone Number: ${it.phoneNumber}")
            }
        }
    }
    fun findByPhoneNumber(phoneNumber: String){
        for(it in list){
            if(it.phoneNumber.equals(phoneNumber)){
                println("Name: ${it.name} | Phone Number: ${it.phoneNumber}")
            }
        }
    }
    fun showPhoneNumber(){
        for(it in list){
            println("Name: ${it.name} | Phone Number: ${it.phoneNumber}")
        }
    }
}