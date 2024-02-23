// Exercício sobre o uso do WHEN
fun main() {
    val media = readlnOrNull()?.toDouble();

    when (media!!) {
        in 0.0..4.9 -> println("REP");
        in 5.0..6.9 -> println("REC");
        else -> println("APR")
    }
}
