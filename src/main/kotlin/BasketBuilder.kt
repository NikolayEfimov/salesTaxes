import TaxType.*
import java.math.BigDecimal

class BasketBuilder {

    private val item1 = BasketItem(
        Product(
            BigDecimal("12.49"),
            listOf(EXEMPT),
            "book"
        ),
        1
    )

    private val item2 = BasketItem(
        Product(
            BigDecimal("14.99"),
            listOf(STANDARD),
            "music CD"
        ),
        1
    )

    private val item3 = BasketItem(
        Product(
            BigDecimal("0.85"),
            listOf(EXEMPT),
            "chocolate bar"
        ),
        1
    )

    private val item4 = BasketItem(
        Product(
            BigDecimal("10.00"),
            listOf(EXEMPT, IMPORT),
            "imported boxes of chocolates"
        ),
        1
    )

    private val item5 = BasketItem(
        Product(
            BigDecimal("47.50"),
            listOf(STANDARD, IMPORT),
            "imported bottle of perfume"
        ),
        1
    )


    private val item6 = BasketItem(
        Product(
            BigDecimal("27.99"),
            listOf(STANDARD, IMPORT),
            "imported bottle of perfume"
        ),
        1
    )


    private val item7 = BasketItem(
        Product(
            BigDecimal("18.99"),
            listOf(STANDARD),
            "bottle of perfume"
        ),
        1
    )

    private val item8 = BasketItem(
        Product(
            BigDecimal("9.75"),
            listOf(EXEMPT),
            "packet of headache pills"
        ),
        1
    )

    private val item9 = BasketItem(
        Product(
            BigDecimal("11.25"),
            listOf(EXEMPT, IMPORT),
            "box of imported chocolates"
        ),
        1
    )

    private val firstList = listOf(item1, item2, item3)
    private val secondList = listOf(item4, item5)
    private val thirdList = listOf(item6, item7, item8, item9)

    fun populate(): List<Basket> = listOf(Basket(firstList), Basket(secondList), Basket(thirdList))

}