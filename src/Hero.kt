class Hero {
    var name: String = " Неизвестный"
    var gender: String = "Не указан"
    var role: String = "Бродяга"
    var hp: Int = 100
    var mp: Int = 50
}

fun main() {
    ///////
    val naruto : Hero = Hero()
    naruto.name =" Наруто Узумаки"
    naruto.gender = "Мужской"
    naruto.role = "Хокаге"
    naruto.hp = 200
    naruto.mp = 150
    ///
    val hero = Hero()
    print("Введите имя героя")
    hero.name= readln()
    print("Введите пол героя"
    )
    hero.gender= readln()
    print("Введите класс")
    hero.role= readln()
    print("Введите здоровье")
    hero.hp= readln().toInt()
    print(" Введите ману")
    hero.mp = readln().toInt()

    println("Имя:${hero.name}\nПол: ${hero.gender}\nКласс: ${hero.role}\nЗдоровье ${hero.hp}\nМана ${hero.mp}")


}
