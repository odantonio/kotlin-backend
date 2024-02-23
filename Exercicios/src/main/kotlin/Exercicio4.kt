// Exercícío Palava-Chave Object e OOP
object ReceitaFederal {
    fun calcularImposto(salario: Double): Double {
        val aliquota = when {
            (salario in 0.00..1100.00) -> 0.05
            (salario in 1100.01..2500.00) -> 0.10
            else -> 0.15
        }
        return aliquota * salario
    }
}

fun main() {
    val valorSalario = readlnOrNull()?.toDouble();
    val valorBeneficios = readlnOrNull()?.toDouble();

    val valorImposto = valorSalario?.let { ReceitaFederal.calcularImposto(it) };
    val saida = valorSalario!! - valorImposto!! + valorBeneficios!!;

    println(String.format("%.2f", saida));
}