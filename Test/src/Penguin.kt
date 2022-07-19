open class Bird2 {
    open fun fly() {
        println("fly")
    }
}

class Penguin : Bird2() {
    override fun fly() {
        println("fly")
    }
}