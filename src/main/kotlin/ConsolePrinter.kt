class ConsolePrinter {

    fun print(basket: Basket) {
        basket.purchases.forEach {
            println("${it.amount} ${it.product.name} ${it.product.priceWithTax}")
        }
        println("Sales taxes: ${basket.taxes}")
        println("Total: ${basket.total}")
        println("---------------")
    }
}