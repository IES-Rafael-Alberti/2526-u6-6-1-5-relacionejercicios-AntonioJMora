package es.ies.ejercicios.u6.ej64

// Este fichero contiene ejemplos de:
// - herencia (6.1)
// - clase abstracta e interfaces (6.2)
// - constructores e init en herencia (6.3)
//
// Tu tarea (6.4) es:
// - Entender el código y su relación entre clases e interfaces.
// - Mejorar la documentación KDoc donde sea necesario.
// - Añadir comentarios solo cuando aporten valor.
// - Eliminar comentarios innecesarios o redundantes.

/**
 * Representa un elemento que puede generar un resumen en texto.
 *
 * Cualquier clase que la implemente debe proporcionar una representacion
 * mediante resumen()
 */
interface Resumible {
    /**
     * Devuelve una cadena con la información esencial del elemento
     * */
    fun resumen(): String
}

/**
 * Plantilla abstracta para generar un informe de cualquier lista de elementos que sea Resumible.
 *
 * Las subclases deben personalizar cómo se formatea cada elemento
 *
 * Nota: el metodo [generar] no se puede sobreescribir para que no se pueda cambar el orden.
 */
abstract class PlantillaInforme : Resumible {
    /**
     *Genera el informe completo en texto, usando la cabecera, items y pie
     */
    fun generar(titulo: String, items: List<Resumible>): String {
        val sb = StringBuilder()

        sb.appendLine(cabecera(titulo))

        for (item in items) {
            sb.appendLine(formatearItem(item))
        }

        sb.appendLine(pie())
        return sb.toString()
    }

    /**
     *Cabecera del informe, las subclases pueden personalizar su formato.
     */
    protected open fun cabecera(titulo: String): String = titulo

    /**
     * Formatea un elemento para incluirlo en el informe. Debe ser implementado por las subclases, ya que es abstract.
     */
    protected abstract fun formatearItem(item: Resumible): String

    /**
     * Pie del informe. Las subclass pueden personalizar su formato.
     */
    protected open fun pie(): String = "-- fin --"

    override fun resumen(): String = "PlantillaInforme"
}

/**
 * Genera un informe en formato Markdown
 *
 * Cada elemento se lista con un guion (-)
 */
class InformeMarkdown : PlantillaInforme() {
    override fun cabecera(titulo: String): String = "# $titulo"

    override fun formatearItem(item: Resumible): String = "- ${item.resumen()}"
}


/**
 * Genera un informe en formato CSV
 *
 * Se normalizan comas en los elementos para evitar conflictos con el CSV
 */
class InformeCsv : PlantillaInforme() {
    override fun cabecera(titulo: String): String = "titulo,$titulo\nitem"

    override fun formatearItem(item: Resumible): String = item.resumen().replace(",", ";")
}


/**
 * Representa a una persona con nombre y edad
 */
open class Persona(
    val nombre: String,
    val edad: Int,
) : Resumible {
    init {
        // Log de iniciacion
        println("[Persona:init] nombre=$nombre edad=$edad")
    }


    /**
     * Constructor secundario que asigna una edad por defecto a 0.
     */
    constructor(nombre: String) : this(nombre, edad = 0) {
        println("[Persona:secondary] constructor(nombre)")
    }

    override fun resumen(): String = "$nombre ($edad)"
}


/**
 * Alumno que hereda de Persona e incluye información del curso.
 */
class Alumno : Persona {
    val curso: String

    constructor(nombre: String, edad: Int, curso: String) : super(nombre, edad) {
        this.curso = curso
        println("[Alumno:secondary] nombre=$nombre edad=$edad curso=$curso")
    }

    constructor(nombre: String, curso: String) : this(nombre, edad = 0, curso = curso) {
        println("[Alumno:secondary] constructor(nombre, curso)")
    }

    override fun resumen(): String = "Alumno: ${super.resumen()} curso=$curso"
}

/**
 * Registro de personas que normaliza nombres para evitar duplicaciones
  */
class RegistroPersonas {
    private val personasPorNombre = mutableMapOf<String, Persona>()

    /**
     * Registra una persona usando la clave normalizada
      */
    fun registrar(persona: Persona) {
        val clave = normalizarNombre(persona.nombre)
        personasPorNombre[clave] = persona
    }

    /**
     * Busca a una persona por el nombre
     */
    fun buscar(nombre: String): Persona? = personasPorNombre[normalizarNombre(nombre)]

    /**
     * Normaliza el nombre, elimina espacios iniciales o finales y pasa a minúsculas
     */
    private fun normalizarNombre(nombre: String): String {
        return nombre.trim().lowercase()
    }
}
