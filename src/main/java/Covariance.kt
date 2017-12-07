class Covariance {

    fun main() {
        val dogList: List<Dog> = listOf(Dog(10), Dog(20))
        val animalList: List<Animal> = dogList
        animalList.forEach { animal -> println(animal) }
    }
}