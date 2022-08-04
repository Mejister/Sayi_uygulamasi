import kotlin.contracts.contract

fun main(){
    var sayi: Int= (1..100).random()
    var can: Int ; can=6

    while(true) {
        val entry = java.util.Scanner(System.`in`)
        println("sayi giriniz;")
        var girilen_deger = entry.nextInt()

        if (can==1){
            println("zaa bilemedi noob")
            println(sayi)
            break
        }
        else if(sayi==girilen_deger){
            println("Ohaa nasi bildin XD")
        }
else
    if(girilen_deger<sayi) {
        can -= 1
        println("az daha büyük")
        continue
    }
else if (girilen_deger>sayi){
         can -=1
            println("az daha küçük")
             continue
        }
    }
    }



