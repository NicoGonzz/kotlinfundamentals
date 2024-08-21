class Operaciones(var n1:Double, var n2:Double) {

    fun operation():Double {
        var suma = this.n1 + this.n2
        println("La primera suma es de: ${suma}")
        return suma
    }

    fun operation1():Double{
        var firstNumber = this.n1
        var secondNumber = this.n2
        return firstNumber/secondNumber
    }

    fun operation2(x:Double):Double{
        var r = Math.sqrt(x)
        println("La division es de: " +r)
        return r
    }

    fun operation3(c: Double):Double{
        return Math.pow(c,this.n2)
    }





}