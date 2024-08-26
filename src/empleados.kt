class Empleados {

    open class Persona(val tipo: TipoEmpleado, val nombre: String, val apellido:String, val id: Int, var estado: EstadoCivil) {

        fun cambiarEstadoCivil(nuevoEstadoCivil: EstadoCivil){
            estado = nuevoEstadoCivil
        }

        }

    class Estudiante(var curso: String, nombre: String, apellido: String, id: Int, estado: EstadoCivil):
        Persona(TipoEmpleado.ESTUDIANTES, nombre, apellido, id, estado){

            fun actualizarCurso(nuevoCurso: String) {
            curso = nuevoCurso

            }
        }

    class PROFESORES(val anioIngreso: String, var despacho: Int, var departamento: String ,nombre: String, apellido: String, id: Int, estado: EstadoCivil):
        Persona(TipoEmpleado.PROFESORES, nombre, apellido, id, estado){

            fun cambiarDespacho(nuevoDespacho: Int){
                despacho = nuevoDespacho
            }

            fun cambiarDepartamento(nuevoDepartamento: String){
                departamento = nuevoDepartamento
            }
        }

    class PERSONALSERVICIO(val anioIngreso: String, var despacho: Int, var seccion: String ,nombre: String, apellido: String, id: Int, estado: EstadoCivil):
        Persona(TipoEmpleado.PERSONALSERVICIO, nombre, apellido, id, estado){

            fun cambiarDespacho(nuevoDespacho: Int){
            despacho = nuevoDespacho
            }

            fun cambiarSeccion(nuevaSeccion: String){
            seccion = nuevaSeccion
            }

        }

    /*
    // Enum representing the different types of the employees
    */
    enum class TipoEmpleado {
        ESTUDIANTES, PROFESORES, PERSONALSERVICIO
    }

    /*
   // Enum representing the different types of the civil status
   */
    enum class EstadoCivil {
        SOLTERO, CASADO, VIUDO, DIVORCIADO, SEPARADO
    }


}