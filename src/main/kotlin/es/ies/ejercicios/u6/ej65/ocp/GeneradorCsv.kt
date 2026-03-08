package es.ies.ejercicios.u6.ej65.ocp

import es.ies.ejercicios.u6.ej64.Resumible

class GeneradorCsv: GeneradorInforme {
    override fun generar(titulo: String, items: List<Resumible>): String {
        return buildString {
            appendLine("titulo: $titulo")
            appendLine("item")
            for (item in items) {
                appendLine(item.resumen())
            }
        }
    }
}