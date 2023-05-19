package model

class Student(private var name: String, private var age: Int) {
    internal var _name: String
        get() {
            return this.name
        }
        set(value) {
            this.name = value
        }

    override fun toString(): String {
        return "Student(name='$name', age=$age)"
    }
}