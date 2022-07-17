enum class TaxType(
    val percent: Double
) {
    STANDARD(10.0),
    EXEMPT(0.0),
    IMPORT(5.0);
}
