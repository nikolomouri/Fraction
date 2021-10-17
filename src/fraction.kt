class Fraction(val numerator: Double, val denumerator: Double) {
     override fun toString(): String {
         return "$numerator / $denumerator"
     }
    //tolobis fun
     override fun equals(other: Any?): Boolean {
         if (other is Fraction) {
             if (numerator * other.denumerator / denumerator == other.numerator) {
                 return true
             }
         }
         return false

     }
    //shekrebis fun
    fun getAssembly (other: Any?) {
         if (other is Fraction) {

             if (denumerator == other.denumerator) {
                 val assemblyNumerator  = numerator + other.numerator
                 val assemblydenumerator  = denumerator
                 print("$assemblyNumerator / $assemblydenumerator")
             } else {
                 val assemblyNumerator = numerator * other.denumerator + other.numerator * denumerator
                 val assemblydenumerator = denumerator * other.denumerator
                 println("$assemblyNumerator / $assemblydenumerator")
             }
         }
     }
    //gamravlebis fun
     fun getMultiplication(other: Any?) {
         if (other is Fraction) {
             if ((numerator != 0.0) && (denumerator != 0.0) && (other.numerator != 0.0) && (other.denumerator != 0.0)) {
                 val multiNumerator = numerator * other.numerator
                 val multiDenumertor = denumerator * other.denumerator
                 println("$multiNumerator / $multiDenumertor")
             }
         }
     }
    // shekveci fun
    fun getShortening (other: Any?) {
        if (numerator % other as Double == 0.0 && denumerator % other == 0.0 ) {
            val shortNumerator:Double = numerator / other
            val shortDenumerator:Double = denumerator / other
            println("$shortNumerator / $shortDenumerator")
        }else {
            println("ar ikveceba")
        }

    }


 }

fun main() {
    val fraction = Fraction( 3.0, 10.0)
    val fraction1 = Fraction(1.0, 3.0)
    println(fraction)
    println(fraction1)
    println(fraction.equals(fraction1)) // vutolebt wiladebs
    println(fraction.getAssembly(fraction1)) // xdeba wiladebis shekveca matematikistvis damaxasiatebeli principit(titqmis)
    println(fraction.getMultiplication(fraction1)) // gamravleba fraction mravldeba frction 1ze .getMultiplicationis(aq iwereba wiladis val(var) ) sashualebit
    println(fraction.getShortening(2.0)) // .getShortening(vwert ricxvs romelzec gvinda shekveca) tu ar ikvceba pasuxs gvigdebs shesaferiss
}