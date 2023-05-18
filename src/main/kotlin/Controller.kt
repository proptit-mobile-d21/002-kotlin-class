class Controller(private val utility: Utility) {
    val regex: Regex = "\\+?(0|84)\\d{9}".toRegex()

    fun addContact(name: String, phoneNum: String){
        if(!regex.matches(phoneNum)) println("Invalid phone number!")
        else{
            val contact = Contact(name, phoneNum)
            utility.addContact(contact)
        }
    }

    fun findByName(name: String) {
        val contact = utility.findByName(name)
        if(contact != null){
            println("Name: ${contact.name} ----- Phone number: ${contact.phonNum}")
        }else println("Not found 404.")
    }

    fun showAllContacts(){
        val list = utility.showAll()
        if(list.size == 0) println("There are no contact.")
        for(it in list){
            println("Name: ${it.name} ----- Phone number: ${it.phonNum}")
        }
    }
}