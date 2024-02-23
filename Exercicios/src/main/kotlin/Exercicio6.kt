// Exercício sobre Padrão Singleton

/*
 * O Singleton é uma abordagem de design de software que visa assegurar
 * a existência de apenas uma instância de uma classe e fornecer um ponto centralizado
 * para acessá-la. Isso é especialmente benéfico em contextos nos quais é desejável manter
 * uma única ocorrência de uma classe responsável pelo controle de um recurso compartilhado,
 * como configurações, conexões de banco de dados ou caches.
 *
 * Neste desafio, você deve criar um sistema de gerenciamento de usuários que permita adicionar
 * e listar usuários. Você tem a opção de implementar o padrão Singleton para garantir que haja
 * apenas uma instância do gerenciador de usuários em toda a aplicação. No entanto, a
 * implementação do padrão Singleton é opcional e você pode optar por seguir uma abordagem
 * diferente para resolver o desafio, se preferir.
 */
class User(val id: Int, val name: String)

/*
 * No Kotlin, a declaração de um objeto (por meio da palavra-chave object)
 * é uma maneira concisa e eficaz de implementar o padrão Singleton.
 */
object UserManager {

    private val users = mutableListOf<User>()
    private var nextId = 1

    fun addUser(name: String) {
        // TODO("Implementar a lógica de adicionar um novo usuário na lista mutável $users.")
        val newUser = User(nextId,name)
        users.add(newUser)
        nextId++
    }

    fun listUsers(): List<User> {
        // TODO("Implementar a impressão dos $users, seguindo o padrão definido no enunciado.")
        return users.toList()
    }
}

fun main() {
    val quantity = readlnOrNull()?.toIntOrNull() ?: 0

    for (i in 1..quantity) {
        val name = readlnOrNull() ?: ""
        UserManager.addUser(name)
    }

    val lista = UserManager.listUsers()

    for (i in lista) {
        println("${i.id} - ${i.name}")
    }
}