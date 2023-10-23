typealias DoubleConversion = (Double) -> Double

fun convert(x: Double, converter: DoubleConversion): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun getConversionLambda(str: String): DoubleConversion {
    when (str) {
        "CentigradeToFahrenheit" -> return { it * 1.8 + 32 }
        "KgsToPounds" -> return { it * 2.204623 }
        "PoundsToUSTons" -> return { it / 2000.0 }
        else -> return { it }
    }
}

fun combine(
    lambda1: DoubleConversion,
    lambda2: DoubleConversion
): DoubleConversion {
    return { x: Double -> lambda2(lambda1(x)) }
}

fun main() {
    val initialWeightInKG = 22.5;
    println("Convert ${initialWeightInKG}kg to Pounds: ${getConversionLambda("KgsToPounds")(initialWeightInKG)}")

    val kgsToPoundsLambda = getConversionLambda("KgsToPounds")
    val poundsToUSTonsLambda = getConversionLambda("PoundsToUSTons")

    val kgsToUSTonsLambda = combine(kgsToPoundsLambda, poundsToUSTonsLambda)

    val value = 172.4
    println("$value kgs is ${convert(value, kgsToUSTonsLambda)} US tons")
}