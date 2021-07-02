import decagon.sqoo8.andriod.Aquarium
import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")

    println(buildAquarium("totoise"))
//    val tortoise = Aquarium()
//    tortoise.height = Integer.valueOf(readLine())
//    print(tortoise.height)
}
fun buildAquarium(name:String):String{
    var name = Aquarium()
    println("enter length")
    name.length = Integer.valueOf(readLine())
    println("enter height")
    name.height = Integer.valueOf(readLine())
    var arr = arrayOf(name.length,name.height)
    return Arrays.toString(arr)
}