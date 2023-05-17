class View () {
    fun Show() {
        while(true){
            println("--------Menu--------")
            println("|1.Add new number---|")
            println("|2.Find number------|")
            println("|3.Print list-------|")
            println("|4.Exit-------------|")
            println("Select your choice:")
            var x = readln().toInt()
            if(x > 3) break
            when(x){
                1 -> {
                    print("Name: ")
                    val name = readln()
                    print("Number:")
                    val number = readln()
                    val model = Model(name,number)
                    Controller(model).AddList()
                }
                2 -> {
                    print("Name: ")
                    val name = readln()
                    val model = Model(name," ")
                    Controller(model).FindNumber(name)
                }
                3->{
                    if(list.isEmpty()) println("Empty")
                    for(i in list){
                        print("name: ${i.name}, ")
                        println("number: ${i.number}")
                    }
                }
            }
        }
    }
}