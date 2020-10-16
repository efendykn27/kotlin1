fun main(){
    val nilai =1000
    if(nilai==100) println("selamat anda mendapatkan A karena bernilai 100")
    else if (nilai <= 70 ) println("nilai anda lebih daei 100 hebat tapi mendapat A")
    else if (nilai >= 100) println("nilai anda lebih dari 100")


    var nama ="kodok"
    if (nama == "kodok") println("ya anda kodok")
    else println("anda ular")

    var angka = 'G'
    when(angka){
        'A' -> println("Amazing")
        'B' -> println("Biasa")
        'C' -> println("Curang")
        else -> println("salah semua")
    }

}