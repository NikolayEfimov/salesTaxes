import java.math.BigDecimal

class TaxCalculator {

    fun calculate(basket: Basket) {
        basket.purchases.forEach {
            with(it.product) {
                val tax = price.multiply(BigDecimal(totalTax() * 0.01)).roundUp()

                priceWithTax = price + tax
                basket.total += priceWithTax
                basket.taxes += tax
            }
        }
    }
}
