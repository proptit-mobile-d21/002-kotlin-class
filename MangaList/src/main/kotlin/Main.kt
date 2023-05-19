import model.Manga

internal val library: MutableList<Manga> = mutableListOf()

fun displayMenu() {
    val content = """
        -----Manga Library-----
        1. Add new manga
        2. Show all manga
        0. Exit
        -----------------------
    """.trimIndent()
    println(content)
}

fun addManga() {
    println("Enter Name: ")
    val name = readln().trim()
    println("Enter Url: ")
    val url = readln().trim()
    val manga = Manga(name, url)
    println("These are available tags: ")
    Manga.Tag.values().forEach { print("$it ") }
    print("\n")
    while(true) {
        println("Enter tag: ")
        val tagName = readln().trim()
        var tag: Manga.Tag? = null
        Manga.Tag.values().forEach { if (it.toString() == tagName.toUpperCase()) tag = it }
        manga.tags.add(tag ?: break)
        println("$tag tag added")
    }
    library.add(manga)
}

fun showAll() {
    library.forEach { manga ->
        println("-----------------------")
        println("Manga: ${manga.name}")
        println("URL: ${manga.url}")
        println("Chapters: ${manga.chapters} \t Rating: ${manga.rating}")
        print("Tags: ")
        if (manga.tags.isEmpty()) print("None")
        else manga.tags.forEach { print("$it ") }
    }
}

fun main(args: Array<String>) {
    while(true) {
        displayMenu()
        print("Selection: ")
        when(readln().toInt()) {
            1 -> addManga()
            2 -> showAll()
            0 -> return
            else -> println("Invalid Input")
        }
    }
}