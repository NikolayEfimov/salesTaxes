import java.math.BigDecimal
import java.math.BigDecimal.ZERO

class Basket(
    val purchases: List<BasketItem>
) {
    var total: BigDecimal = ZERO
    var taxes: BigDecimal = ZERO

}
