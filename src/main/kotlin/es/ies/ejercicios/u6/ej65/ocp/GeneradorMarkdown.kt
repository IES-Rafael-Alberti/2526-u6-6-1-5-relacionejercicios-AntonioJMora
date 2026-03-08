package es.ies.ejercicios.u6.ej65.ocp

import es.ies.ejercicios.u6.ej64.Resumible

class GeneradorMarkdown : GeneradorInforme {
    override fun generar(titulo: String, items: List<Resumible>): String {
        return buildString {
            appendLine("# $titulo")
            for (item in items) {
                appendLine("- ${item.resumen()}")
            }
        }
    }
}