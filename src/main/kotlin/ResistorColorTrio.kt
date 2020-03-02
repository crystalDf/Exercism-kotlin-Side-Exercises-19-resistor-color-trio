import kotlin.math.pow

object ResistorColorTrio {

    fun text(vararg input: Color): String {

        val value = input.take(2).joinToString("") { "${it.ordinal}" }.toInt() *
                10.pow(input.last().ordinal)

        Unit.values().first { value in (10.pow(it.ordinal * 3) until 10.pow((it.ordinal + 1) * 3)) }
                .let { return "${value / 10.pow(it.ordinal * 3)} ${it.toString().toLowerCase()}" }
    }

    private fun Int.pow(x: Int): Int {

        return this.toDouble().pow(x.toDouble()).toInt()
    }
}
