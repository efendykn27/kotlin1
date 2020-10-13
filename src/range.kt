fun main(){
    val range = 0..1000
    val range1 = 0..200 step 5
    val range2 = 1000 downTo 0 step 5

    println(range2.count())
    println(range1.contains(77))
    println(range.first)
    println(range.last)
}