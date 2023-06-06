import model.Manga
import controller.Manager

private val manager = Manager()

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

fun addTag(manga: Manga) {
    println("These are available tags: ")
    Manga.Tag.values().forEach { print("$it ") }
    print("\n")
    while(true) {
        println("Enter tag: (Leave empty to finish)")
        val tagName = readln().trim()
        var tag: Manga.Tag? = null
        Manga.Tag.values().forEach { if (it.toString() == tagName.uppercase()) tag = it }
        manga.tags.add(tag ?: break)
        println("$tag tag added")
    }
}

fun addManga() {
    println("Enter Name: ")
    val name = readln().trim()
    println("Enter Url: ")
    val url = readln().trim()
    val manga = Manga(name=name, url=url)
    addTag(manga)
    manager.addManga(manga)
}

fun showAll() {
    manager.getList().forEach { manga ->
        println("-----------------------")
        println("Manga: ${manga.name}")
        println("URL: ${manga.url}")
        println("Chapters: ${manga.chapters} \t Rating: ${manga.rating}")
        print("Tags: ")
        if (manga.tags.isEmpty()) print("None")
        else manga.tags.forEach { print("$it ") }
        print("\n")
    }
}

fun main() {
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