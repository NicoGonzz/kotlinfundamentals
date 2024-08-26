import kotlin.random.Random

fun main() {
   // paperRock()
   // tienda()
   // println(operation())
   // operation1(12.00)
   // multipleOperations()
   // llamadasTelefonicas()
    sistemaGestionFacultad()
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

fun funcionesTest(){
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
}

fun tienda(){
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

fun paperRock(){
    val opciones = listOf("Piedra", "Papel", "Tijera")

    var jugador1 = "Nicolas"
    var jugador2 = "Juan"
    var puntos1 = 0
    var puntos2 = 0

    while ((puntos1 < 2 && puntos2 < 2) || (puntos1-puntos2 < 2 && puntos2-puntos1 <2 ) ) {
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
            puntos2 > puntos1 -> println("$jugador2 lleva la delanteraaa")
            else -> println("Es un empate con $jugador1 $puntos1 y $jugador2 $puntos2")
        }

    }

}

fun operation():Int{ //sin parametros
    var n1 = 5
    var n2 = 6
    return n1/n2
}

fun operation1(x:Double){ //con parametros y sin retorno
    var r = Math.sqrt(x)
    println(r)
}

fun multipleOperations() {
    val resultados = mutableListOf<Double>()

    val op= Operaciones(5.0,7.0)
    resultados.add(op.operation())
    resultados.add(op.operation1())
    resultados.add(op.operation2(166.00))
    resultados.add(op.operation3(2.00))

    for(resultado in resultados.withIndex()){
        println("El resultado es de: $resultados" )
    }
}

fun llamadasTelefonicas() {
    val cabinas = List(5) { Cabina() }

    val empresa = EmpresaTelefonica(cabinas)

    cabinas[0].registrarLlamada(Cabina.TipoLlamada.LOCAL, 10)
    cabinas[0].registrarLlamada(Cabina.TipoLlamada.LARGA_DISTANCIA, 5)
    cabinas[0].registrarLlamada(Cabina.TipoLlamada.CELULAR, 8)
    cabinas[1].registrarLlamada(Cabina.TipoLlamada.LOCAL, 7)
    cabinas[1].registrarLlamada(Cabina.TipoLlamada.LOCAL, 2)
    cabinas[1].registrarLlamada(Cabina.TipoLlamada.LARGA_DISTANCIA, 10)
    cabinas[1].registrarLlamada(Cabina.TipoLlamada.CELULAR, 15)
    cabinas[2].registrarLlamada(Cabina.TipoLlamada.LOCAL, 20)
    cabinas[2].registrarLlamada(Cabina.TipoLlamada.LARGA_DISTANCIA, 3)
    cabinas[2].registrarLlamada(Cabina.TipoLlamada.CELULAR, 10)
    cabinas[3].registrarLlamada(Cabina.TipoLlamada.LOCAL, 12)
    cabinas[3].registrarLlamada(Cabina.TipoLlamada.LARGA_DISTANCIA, 8)
    cabinas[3].registrarLlamada(Cabina.TipoLlamada.CELULAR, 7)
    cabinas[4].registrarLlamada(Cabina.TipoLlamada.LOCAL, 18)
    cabinas[4].registrarLlamada(Cabina.TipoLlamada.LARGA_DISTANCIA, 28)
    cabinas[4].registrarLlamada(Cabina.TipoLlamada.CELULAR, 37)
    cabinas[4].registrarLlamada(Cabina.TipoLlamada.CELULAR, 2)


    println("First Cabin:")
    println(cabinas[0].mostrarInformacion())
    println(" ")

    println("Second Cabin:")
    println(cabinas[1].mostrarInformacion())
    println(" ")

    println("Third Cabin:")
    println(cabinas[2].mostrarInformacion())
    println(" ")

    println("Fourth Cabin:")
    println(cabinas[3].mostrarInformacion())
    println(" ")

    println("Fifth Cabin:")
    println(cabinas[4].mostrarInformacion())
    println(" ")

    println("\nTotal of cabins:")
    println(empresa.mostrarConsolidadoTotal())


    cabinas[0].reiniciar()

    println("\nInformación de las cabinas después de reiniciar:")
    println(cabinas[0].mostrarInformacion())
}

fun sistemaGestionFacultad(){
    val empleados = mutableListOf<Empleados.Persona>()

    val estudiante1 = Empleados.Estudiante(
        curso = "Matemáticas",
        nombre = "Carlos",
        apellido = "Ramírez",
        id = Random.nextInt(1000, 9999),
        estado = Empleados.EstadoCivil.SOLTERO
    )
    val estudiante2 = Empleados.Estudiante(
        curso = "Física",
        nombre = "Ana",
        apellido = "López",
        id = Random.nextInt(1000, 9999),
        estado = Empleados.EstadoCivil.CASADO
    )

    // Crear datos aleatorios para profesores
    val profesor1 = Empleados.PROFESORES(
        anioIngreso = "2015",
        despacho = 101,
        departamento = "Matemáticas",
        nombre = "Jorge",
        apellido = "Martínez",
        id = Random.nextInt(1000, 9999),
        estado = Empleados.EstadoCivil.CASADO
    )
    val profesor2 = Empleados.PROFESORES(
        anioIngreso = "2012",
        despacho = 202,
        departamento = "Física",
        nombre = "Lucía",
        apellido = "Gómez",
        id = Random.nextInt(1000, 9999),
        estado = Empleados.EstadoCivil.DIVORCIADO
    )

    // Crear datos aleatorios para personal de servicio
    val personal1 = Empleados.PERSONALSERVICIO(
        anioIngreso = "2018",
        despacho = 301,
        seccion = "Limpieza",
        nombre = "Pedro",
        apellido = "Sánchez",
        id = Random.nextInt(1000, 9999),
        estado = Empleados.EstadoCivil.VIUDO
    )
    val personal2 = Empleados.PERSONALSERVICIO(
        anioIngreso = "2020",
        despacho = 302,
        seccion = "Mantenimiento",
        nombre = "Laura",
        apellido = "Fernández",
        id = Random.nextInt(1000, 9999),
        estado = Empleados.EstadoCivil.SEPARADO
    )

    empleados.add(estudiante1)
    empleados.add(estudiante2)
    empleados.add(profesor1)
    empleados.add(profesor2)
    empleados.add(personal1)
    empleados.add(personal2)

    empleados.forEach { empleado ->
        when (empleado) {
            is Empleados.Estudiante -> {
                println("Estudiante: ${empleado.nombre} ${empleado.apellido}, ID: ${empleado.id}, Estado Civil: ${empleado.estado}, Curso: ${empleado.curso}")
            }
            is Empleados.PROFESORES -> {
                println("Profesor: ${empleado.nombre} ${empleado.apellido}, ID: ${empleado.id}, Estado Civil: ${empleado.estado}, Departamento: ${empleado.departamento}, Despacho: ${empleado.despacho}, Año de Ingreso: ${empleado.anioIngreso}")
            }
            is Empleados.PERSONALSERVICIO -> {
                println("Personal de Servicio: ${empleado.nombre} ${empleado.apellido}, ID: ${empleado.id}, Estado Civil: ${empleado.estado}, Sección: ${empleado.seccion}, Despacho: ${empleado.despacho}, Año de Ingreso: ${empleado.anioIngreso}")
            }
        }
    }

    estudiante1.cambiarEstadoCivil(Empleados.EstadoCivil.CASADO)
    profesor1.cambiarDespacho(12)
    estudiante1.actualizarCurso("Soy el nuevo curso")
    profesor2.cambiarDepartamento("Departamento de ciencias")
    personal1.cambiarSeccion("Nueva seccion 2")

    empleados.forEach { empleado ->
        when (empleado) {
            is Empleados.Estudiante -> {
                println("\nEstudiante Actualizado: ${empleado.nombre} ${empleado.apellido}, ID: ${empleado.id}, Estado Civil: ${empleado.estado}, Curso: ${empleado.curso}")
            }
            is Empleados.PROFESORES -> {
                println("Profesor Actualizado: ${empleado.nombre} ${empleado.apellido}, ID: ${empleado.id}, Estado Civil: ${empleado.estado}, Departamento: ${empleado.departamento}, Despacho: ${empleado.despacho}, Año de Ingreso: ${empleado.anioIngreso}")
            }
            is Empleados.PERSONALSERVICIO -> {
                println("Personal de Servicio Actualizado: ${empleado.nombre} ${empleado.apellido}, ID: ${empleado.id}, Estado Civil: ${empleado.estado}, Sección: ${empleado.seccion}, Despacho: ${empleado.despacho}, Año de Ingreso: ${empleado.anioIngreso}")
            }
        }
    }
}

/*
// Class for create a Cabin
*/
class EmpresaTelefonica(val cabinas: List<Cabina>) {

    fun mostrarConsolidadoTotal(): String {
        val costoTotal = cabinas.sumBy { it.calcularCostoTotal() }
        val duracionTotal = cabinas.sumBy { it.calcularDuracionTotal() }
        val numeroTotalLlamadas = cabinas.sumBy { it.obtenerNumeroLlamadas() }
        val costoPromedioPorMinuto = if (duracionTotal > 0) costoTotal / duracionTotal else 0

        return """
            Costo total: $costoTotal pesos
            Duración total de llamadas: $duracionTotal minutos
            Número total de llamadas: $numeroTotalLlamadas
            Costo promedio por minuto: $costoPromedioPorMinuto pesos/minuto
        """.trimIndent()
    }
}




