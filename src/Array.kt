fun main(){

    val member: Array<String> = arrayOf("Boruto","Sarada","Mitsuki")
    val nomor : Array<Int> = arrayOf(3,42,22222)

    //menggambil data didalam array
    println("### menggambil data didalam array ###")
    val boruto:String=member[0]
    val sarada:String= member.get(1)
    println(boruto)
    println(sarada)
    println(nomor[2])
    println(member.size)

    //mengganti data didalam array
    println("### mengganti data didalam array ###")
    member.set(0,"naruto")
    println(member[0])

    //Array null
    println("#### Array Null ####")
    val hewan: Array<String?> = arrayOfNulls(6)
    hewan.set(0,"Ular")
    hewan.set(1,null)
    hewan.set(2,"kodok")
    hewan.set(3,null)
    println(hewan[2])

    //arrray implisit
    println("### Array implisit ###")
    val buah = arrayOf(3,4,3,"ww")
    println(buah[3])
    println(buah[0])
}