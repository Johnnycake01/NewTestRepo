import decagon.sqoo8.andriod.Aquarium

fun main(args: Array<String>) {
    println("Hello World!")

  //  buildAquarium("totoise")
    var tortoise = Aquarium()
    tortoise.height = Integer.valueOf(readLine())
    print(tortoise.height)
}
//fun buildAquarium(name:String){
//    var name = Aquarium()
//}