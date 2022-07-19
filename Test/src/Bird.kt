class Bird(weight: Double, color: String, age: Int) {
    val weight: Double
    val color: String
    val age: Int
    val sex: String by lazy {
        if(color == "yellow") "male" else "felame"
    }

    init{
        this.weight = weight
        this.color = color
        this.age = age
        //this.sex = if (this.color == "yellow") "male" else "female"
        println("123")
    }

    open fun fly() {}

}

open class Bird1 (age: Int) {
    val age: Int

    init {
        this.age = age
    }
//    constructor(birth: DateTime): this(getAgeByBirth(birth)) {
//
//    }
}

interface Flyer{
    val speed: Int
    fun kind()
    fun fly() {
        println("I can fly")
    }
}
