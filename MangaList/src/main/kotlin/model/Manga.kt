package model

internal data class Manga(val name: String) {
    internal enum class Tag {
        ROMANCE, COMEDY, FANTASY, DRAMA, ACTION
    }

    internal var url: String
    internal var chapters: Int
    internal var rating: Float

    init {
        url = ""
        chapters = 1
        rating = 1.0f
    }

    internal constructor(name: String, url: String): this(name) {
        this.url = url
    }

    internal val tags: MutableSet<Tag> = mutableSetOf()
}