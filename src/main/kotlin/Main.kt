import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Введите, сколько секунд назад человек был в сети, а мы определим, как давно он был в сети")
    val a = scanner.nextInt()
    println(time(a))
}
fun time(Sec: Int):String{
    return when {
        Sec in 0..60 -> "Только что"
        Sec in 61..60*60 -> "Был(а) в сети " + "${(vremya(Sec/60))}  назад"
        Sec in 60*60 + 1 .. 24*60*60 -> "Был(а) в сети " + "${(vremya2(Sec/(60*60)))} назад"
        Sec in 60*60*24+1..60*60*48 -> "Был(а) в сети вчера"
        Sec in 60*60*48+1..60*60*72 -> "Был(а) в сети позавчера"
        else -> "Был(а) в сети давно"
    }
}
fun vremya(Min: Int):String{
    return when {
        Min == 1  -> "${Min} минуту"
        Min in 2..4 -> "${Min} минуты"
        Min in 5..20 -> "${Min} минут"
        Min in 21..23 -> "${Min} минуту"
        else -> "${Min} минут"
    }
}
fun vremya2(Hours:Int):String {
    return when {
        Hours == 1  -> "${Hours} час"
        Hours in 2..4 -> "${Hours} часа"
        Hours in 5..20 -> "${Hours} часов"
        Hours in 21..23 -> "${Hours} час"
        else -> "${Hours} часов"
    }
}




