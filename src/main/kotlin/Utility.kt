class Utility {
    private val contacts = mutableListOf<Contact>()

    fun addContact(contact: Contact){
        contacts.add(contact)
    }

    fun findByName(name: String): Contact?{
        return contacts.find{it.name == name}
    }

    fun showAll(): List<Contact> {
        return contacts.toList()
    }

    fun toOption(): Int {
        var input = readln()
        return input.toInt()
    }
}