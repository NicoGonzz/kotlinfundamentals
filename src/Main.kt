import kotlin.random.Random

fun main() {
    paperRock()
/*
    var name = "Nicolas";
    var edad = 18;
    val x = 2

    val result = when (x) {
        1 -> "x es uno"
        2 -> "x es dos"
        3, 4 -> "x es tres o cuatro"
        in 5..10 -> "x está entre cinco y diez"
        else -> "x no está en el rango esperado"
    }
    println(result)

    //var n: integer
    if(edad >= 18){
        println("Mayor de edad con ${edad}");
        
    } else {
        println("Menor de edad con ${edad}")
    }

    for(i in 1..20){
        println(i)
    }

    for (j in 10 downTo 1){
        println(j)
    }*/

    /*
    for (j in 1 until  101){
        if(j%3 == 0 && j%5 == 0){
            println("Fizz buzz")
        }
          else if(j%3 == 0){
            println("Fizz")
        } else if(j%5 == 0){
            println("Buzz")
        } else{
            println(j)
        }

    }
*/
    var nombre:String = "Nicolas";
    var nit:Int = 123456789;
    var fecha:String = "12/02/2024"

    var mouse:Int = 25000;
    var teclado:Int = 76000;
    var monitor:Int =780000;
    var usb:Int = 52000;
    var discoDuro:Int = 230000;

    var iva:Double = 0.16;

    var numero:Int
    println("Digite el producto 1. Mouse 2. Teclado 3. Monitor 4. USB 5. Disco duro")
    numero = readln().toInt()

    var cantidad:Int
    println("Digite la cantidad")
    cantidad = readln().toInt()

    var op1 = 0.0

    val result = when (numero) {
        1 -> {
            op1=mouse * iva * cantidad
        }
        2 -> {
            op1=teclado * iva * cantidad
        }
        3 -> {
            op1= monitor * iva * cantidad
        }
        4 -> {
            op1= usb * iva * cantidad
        }
        5 -> {
            op1 = discoDuro * iva * cantidad
        }
        else -> "No se seleccionaron productos"
    }
    var total = op1;

    println("El total de tu transaccion hasta el momento es de : ${op1.toString()}")

    println("Desea comprar mas cosas 1.Si 2.No")
    var opcion = readln().toInt()
    if(opcion == 1){

    }else {
        println("Señor $nombre con cedula $nit ")
        println("El total de tu transaccion realizada el $fecha es de : ${op1.toString()}")
        println("Tu IVA es de $iva")

    }

}
/*
fun randomNumber(){
    var numero: Int
    numero = Random.nextInt(101)
    var attemps = 3

    while(attemps > 3){
        if(attemps >= 1){
            println("Por favor ingrese un numero, tienes $attemps")
            numeroIngresado = readln().toInt()

            when(
                numeroIngresado > numero -> "El numero es menor",
                numeroIngresado < numero -> "El numero es mayor",
                numeroIngresado  == numero -> "Felicidades el numero fue exitoso "
            )

        }
        if(attemps >= 2){

        }
    }
}
*/
fun paperRock(){
    val opciones = listOf("Piedra", "Papel", "Tijera")

    var jugador1 = "Nicolas"
    var jugador2 = "Juan"
    var puntos1 = 0
    var puntos2 = 0
    var rondas = 0

    while (puntos1 < 2 && puntos2 < 2) {
        val opcionJugador1 = Random.nextInt(3)
        val opcionJugador2 = Random.nextInt(3)

        val eleccion1 = opciones[opcionJugador1]
        val eleccion2 = opciones[opcionJugador2]

        println("$jugador1 eligió $eleccion1")
        println("$jugador2 eligió $eleccion2")

        if (opcionJugador1 == opcionJugador2) {
            println("Empate ninguno suma puntos")
            println("---------------------------")
            println("$jugador1 tiene $puntos1")
            println("---------------------------")
            println("$jugador2 tiene $puntos2")
        }
        else if ((opcionJugador1 == 0 && opcionJugador2 == 2) ||
            (opcionJugador1 == 1 && opcionJugador2 == 0) ||
            (opcionJugador1 == 2 && opcionJugador2 == 1)) {
            println("$jugador1 gano")
            puntos1++
            println("$jugador1 tiene $puntos1")
            println("---------------------------")
            println("$jugador2 tiene $puntos2")
            println("---------------------------")
        }
        else {
            println("$jugador2 gano")
            puntos2++
            println("$jugador1 tiene $puntos1")
            println("---------------------------")
            println("$jugador2 tiene $puntos2")
            println("---------------------------")
        }

        when {
            puntos1 > puntos2 -> println("$jugador1 lleva la delantera")
            puntos2 > puntos1 -> println("$jugador2 lleva la delanteraa ")
            else -> println("Es un empate con $jugador1 $puntos1 y $jugador2 $puntos2")
        }

    }

}



