/*
 *   As Extension Functions, ou Funções de Extensão, são recursos poderosos disponíveis em
 * linguagens de programação que permitem adicionar métodos a classes existentes sem a
 * necessidade de modificar o código-fonte original dessas classes. Isso facilita a criação
 * de novas funcionalidades ou comportamentos para tipos de dados já existentes, mesmo quando
 * você não tem acesso ao código fonte original desses tipos.
 *
 *   O uso de extension functions tem seus pontos positivos, como a extensibilidade e
 * organização do código, mas também apresenta desafios, como a possível confusão e a
 * separação da lógica. A solução eficiente depende da linguagem de programação escolhida e
 * das práticas de programação adotadas.
 *
 * Saiba mais sobre Extension Functions em Kotlin:
 * https://kotlinlang.org/docs/extensions.html#extension-functions
 */

fun main() {
    val titulo = readlnOrNull() ?: ""
    val autor = readlnOrNull() ?: ""

    val slugTitulo = titulo.generateSlug()
    val slugAutor = autor.generateSlug()

    println("Slug gerado para o livro:")

    // TODO("Formatar/Imprimir as slugs considerando o padrão de saída deste desafio.")
    println("${slugTitulo}_${slugAutor}")
}

fun String.generateSlug(): String {
    // TODO("Lógica para que qualquer String tenha a capacidade de gerar uma slug (seguindo-este-padrao).")
    return this.replace(" ","-").replace(".","").replace(",","").lowercase()
}