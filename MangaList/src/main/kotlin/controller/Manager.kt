package controller

import model.Manga

class Manager {
    private val library: MutableList<Manga> = mutableListOf()

    fun addManga(manga: Manga) {
        library.add(manga)
    }

    fun getList() : List<Manga> {
        return library.toList()
    }
}