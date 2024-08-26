class Cabina {

    private val llamadas: MutableList<Llamada> = mutableListOf()

    /*
    // Function for registering a new call
    */
    fun registrarLlamada(tipo: TipoLlamada, duracionMinutos: Int) {
        val llamada = Llamada(tipo, duracionMinutos)
        llamadas.add(llamada)
    }

    /*
    // Calculate the total cost of the calls
    */
    fun calcularCostoTotal(): Int {
        return llamadas.sumBy { it.calcularCosto() }
    }

    /*
    // Calculate the total duration of the calls
    */
    fun calcularDuracionTotal(): Int {
        return llamadas.sumBy { it.duracionMinutos }
    }

    /*
    // Calculate the total number of phone calls in one cabin
    */
    fun obtenerNumeroLlamadas(): Int {
        return llamadas.size
    }

    /*
    // Show the detailed information of the cabin
    */
    fun mostrarInformacion(): String {
        val numeroLlamadas = obtenerNumeroLlamadas()
        val duracionTotal = calcularDuracionTotal()
        val costoTotal = calcularCostoTotal()

        return """
            Number of calls: $numeroLlamadas
            Total duration of calls: $duracionTotal minutes
            Total cost of calls: $costoTotal pesos
        """.trimIndent()
    }

    /*
    // Reset the values of the cabin to zero
    */
    fun reiniciar() {
        llamadas.clear()
    }

    /*
    // Class representing a phone call
    */
    private class Llamada(val tipo: TipoLlamada, val duracionMinutos: Int) {
        /*
        // Calculate the cost of the call based on its type and duration
        */
        fun calcularCosto(): Int {
            return when (tipo) {
                TipoLlamada.LOCAL -> duracionMinutos * 50
                TipoLlamada.LARGA_DISTANCIA -> duracionMinutos * 350
                TipoLlamada.CELULAR -> duracionMinutos * 150
            }
        }
    }

    /*
    // Enum representing the different types of calls
    */
    enum class TipoLlamada {
        LOCAL, LARGA_DISTANCIA, CELULAR
    }

}
