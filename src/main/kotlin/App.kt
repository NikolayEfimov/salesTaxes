fun main() {
    val baskets = BasketBuilder().populate()
    val calculator = TaxCalculator()
    val consolePrinter = ConsolePrinter()

    baskets.forEach { basket ->
        calculator.calculate(basket)

        consolePrinter.print(basket)
    }
}