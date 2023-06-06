package model

data class Manga(val name: String, val url: String = "", val chapters: Int = 1, val rating: Float = 1.0f) {
    enum class Tag {
        ROMANCE, COMEDY, FANTASY, DRAMA, ACTION
    }
    val tags: MutableSet<Tag> = mutableSetOf()
}