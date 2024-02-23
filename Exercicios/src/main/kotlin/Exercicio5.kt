// Exercício OOP visando soluções mais idiomáticas
data class Pais(var habitantes: Double, val taxaCrescimento: Double) {
    fun crescerPopulacaoAnual(): Double {
        // TODO("Criar a lógica de crescimento populacional, usando as propriedades do [Pais]")
        val habitantesNovos = habitantes * (taxaCrescimento/100)
        return habitantesNovos
    }
}

fun main() {
    val habitantesPaisA = readlnOrNull()!!.toDouble();
    val habitantesPaisB = readlnOrNull()!!.toDouble();
    val paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
    val paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)

    var quantidadeAnos = 0
    while (paisA.habitantes < paisB.habitantes) {
        // TODO("Invocar a função que consolida o crescimento anual de cada [Pais]")
        paisA.habitantes += paisA.crescerPopulacaoAnual()
        paisB.habitantes += paisB.crescerPopulacaoAnual()
        // TODO("Garantir de a variável mutável $quantidadeAnos seja atualizada")
        quantidadeAnos += 1
    }

    println("$quantidadeAnos anos")
}