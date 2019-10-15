import kotlin.reflect.KProperty


class DelegateName {
    private var value: String = "Default"

    //kedua
    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    //pertama
    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal {
    var name: String by DelegateName()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

fun main() {
    val animal = Animal()
    animal.name = "Dicoding Miaw"

    //ketiga
    println("Nama Hewan: ${animal.name}")


}