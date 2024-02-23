// Exercicio8

/*
 * O padrão de projeto Adapter é um padrão de projeto estrutural que permite que objetos
 * com interfaces incompatíveis trabalhem juntos. Ele atua como um intermediário, adaptando
 * a interface de uma classe para outra interface esperada pelo cliente.
 *
 * O padrão Adapter é uma ferramenta valiosa para lidar com incompatibilidades de interface
 * e integrar componentes heterogêneos. No entanto, é importante avaliar cuidadosamente sua
 * utilização para garantir que os benefícios superem os possíveis custos em termos de
 * complexidade e desempenho.
 */

// Antiga classe de conversão que só suporta a conversão de USD para GBP
class OldCurrencyConverter {
    fun convertUSDtoGBP(amount: Double): Double {
        return amount * 0.80 // 80% do valor em USD
    }
}

// Novo adaptador que usa a antiga conversão e aplica a taxa adicional de GBP para EUR
class CurrencyAdapter(private val oldConverter: OldCurrencyConverter) {
    fun convertUSDtoEUR(amount: Double): Double {
        // TODO("Implementar a lógica de adaptação usando o $oldConverter e taxa definida no enunciado.")
        val inGBP = oldConverter.convertUSDtoGBP(amount)
        val inEUR = inGBP * 1.0625
        return inEUR
    }
}

fun main() {
    val input = readlnOrNull()?.toDoubleOrNull() ?: return
    val oldConverter = OldCurrencyConverter()
    val adapter = CurrencyAdapter(oldConverter)

    val amountInEUR = adapter.convertUSDtoEUR(input)

    println("USD: $input")
    println("EUR: $amountInEUR")
}