import java.math.BigDecimal

class Product(
    val price: BigDecimal,
    private val taxTypes: List<TaxType>,
    val name: String,
) {
    lateinit var priceWithTax: BigDecimal

    fun totalTax() = taxTypes.sumOf { it.percent }
}