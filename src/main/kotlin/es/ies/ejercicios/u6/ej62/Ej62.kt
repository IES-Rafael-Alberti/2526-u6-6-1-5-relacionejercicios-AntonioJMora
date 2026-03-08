package es.ies.ejercicios.u6.ej62

/**
 * Ejercicio 6.2 — Forzado y bloqueo de herencia (RA7.b).
 *
 * Punto de partida: `es.ies.ejercicios.u6.ej62.v0` (sin clase abstracta).
 *
 * TODO: Implementa la versión final refactorizada en `es.ies.ejercicios.u6.ej62` usando:
 * - Clase abstracta para forzar la herencia/implementación.
 * - Mecanismos para bloquear herencia/sobrescritura cuando proceda.
 *
 * Documenta la resolución en `docs/ejercicios/6.2.md` con permalinks a fragmentos de código.
 */
object Ej62

fun main() {
    val lineas = listOf("Elemento A", "Elemento B", "Elemento C")

    val reports : List<ReportTemplate> = listOf(
        MarkdownReport(),
        CsvReport()
    )

    reports.forEach { report ->
        println(report.generate("Prueba",lineas))
    }

    val loggers : List<Logger> = listOf(
        BaseLogger(),
        StdoutLogger()
    )

    loggers.forEach { logger ->
        logger.log("Mensaje de prueba")
    }
}
