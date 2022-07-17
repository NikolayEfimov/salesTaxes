import java.math.BigDecimal
import java.math.RoundingMode.HALF_UP
import java.math.RoundingMode.UP

//0.05 and scale might be extracted to params if required later
fun BigDecimal.roundUp(): BigDecimal =
    this.divide(BigDecimal(0.05), 0, UP).multiply(BigDecimal(0.05)).setScale(2, HALF_UP)