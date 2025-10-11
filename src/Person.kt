fun main(){
    val naruto: Hero= Hero()
    println("Имя${naruto.name}\nПол: ${naruto.gender}\nКласс:${naruto.role}\n ${naruto.hp}\nМана: ${naruto.mp}")

    val sasuke= Hero()
    sasuke.name =" Саске Учиха"
    sasuke.gender = "Мужской"
    sasuke.role ="Шиноби-отступник"
    sasuke.hp= 120
    sasuke.mp =180
    println("Имя${sasuke.name}\nПол: ${sasuke.gender}\nКласс:${sasuke.role}\n ${sasuke.hp}\nМана: ${sasuke.mp}")

}