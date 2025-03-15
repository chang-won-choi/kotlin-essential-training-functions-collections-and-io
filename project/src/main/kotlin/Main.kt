
fun main() {
    val aChar: Char = 'a'
    val aNumericChar = '1'
    val newLineChar = '\n'

//    val concatOption1 = 'a' + 'b'
//
//    val concatOption2 = 'ab'

    val aString: String = "Hello Kotlin!"
    val escaped = "Hello \n World"

    println(escaped)

    val raw = """
        |Some
        >>>multiline
    text
            |is going on
        here
    """
    println(raw)
    println(raw.trimIndent())
    println(raw.trimMargin())
    println(raw.trimMargin(">>>"))

    val concatString = "Hello" + " Kotlin!"
    val concatNumber = "The number " + 10

    println(concatNumber)

    val aNumber = 10
    val concatTemplate = "The number $aNumber"

    println(concatTemplate)

    val concatTemplate2 = "The number ${aNumber + 1}"

    println(concatTemplate2)

    val someString = "Hello there!"
    println(someString.isEmpty())
    println(someString.isNotEmpty())

    val someString2 = "   "
    println(someString2.isEmpty())
    println(someString2.isBlank())

    val anotherString = "Hello Kotlin World!"
    print(anotherString.contains("Kotlin"))
}