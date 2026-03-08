package es.ies.ejercicios.u6.ej65.srp

import es.ies.ejercicios.u6.ej64.*


class ServicioInforme {
    private val informe = InformeMarkdown()

    fun generar(items: List<Resumible>): String {
        return informe.generar("Listado", items)
    }

}