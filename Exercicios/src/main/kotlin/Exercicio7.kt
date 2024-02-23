// Exercício Padrão Builder

/*
 *   O Design Pattern "Builder" é uma técnica utilizada para criar objetos complexos
 *   passo a passo, separando o processo de construção da representação final do objeto.
 *   Isso ajuda a melhorar a legibilidade e a flexibilidade do código, especialmente quando
 *   você precisa criar objetos com muitos parâmetros ou configurações diferentes.
 */

class Product(val name: String, val price: Double, val quantity: Int)

class CustomOrder private constructor(
    private val customerName: String,
    private val deliveryAddress: String,
    private val products: List<Product>,
    private val total: Double,
) {
    /** Classe interna para "linkar" o Builder com a classe CustomOrder **/
    class Builder {
        private var customerName: String = ""
        private var products: MutableList<Product> = mutableListOf()
        private var deliveryAddress: String = ""

        fun setCustomerName(name: String) = apply { customerName = name }
        fun addProduct(product: Product) = apply { products.add(product) }
        fun setDeliveryAddress(address: String) = apply { deliveryAddress = address }

        fun build(): CustomOrder {
            // TODO("Implemente a lógica para calcular o Total do Pedido (a partir dos dados de Produtos).")
            val orderTotal = products.sumOf { it.price * it.quantity }
            // TODO("Instancie corretamente um CustomOrder, consolidando o Builder!")
            return CustomOrder(customerName,deliveryAddress,products.toList(),orderTotal)
        }
    }

    fun printReceipt() {
        println(this.customerName)
        this.products.forEachIndexed { index, product ->
            println("${index + 1}. ${product.name} | ${product.price} | ${product.quantity}")
        }
        println("Total: ${this.total}")
        println("End: ${this.deliveryAddress}")
    }
}

fun main() {
    val customerName = readlnOrNull() ?: ""

    val orderBuilder = CustomOrder.Builder().setCustomerName(customerName)

    val numProducts = readlnOrNull()?.toIntOrNull() ?: 0
    for (i in 1..numProducts) {
        val productName = readlnOrNull() ?: ""
        val productPrice = readlnOrNull()?.toDoubleOrNull() ?: 0.0
        val productQuantity = readlnOrNull()?.toIntOrNull() ?: 0

        orderBuilder.addProduct(Product(productName, productPrice, productQuantity))
    }

    val deliveryAddress = readlnOrNull() ?: ""

    val customOrder = orderBuilder.setDeliveryAddress(deliveryAddress).build()

    customOrder.printReceipt()
}