fun main(args: Array<String>) {
    Day4.part1()
    Day4.part2()
}

object Day4 {

    fun parse(): List<Pair<IntRange, IntRange>> {
        val regex = Regex("(\\d+)-(\\d+),(\\d+)-(\\d+)")
        return Util
            .getResourceFileLines("day4.txt")
            .map {
                val (start1, end1, start2, end2) = regex.find(it)!!.destructured
                Pair(start1.toInt()..end1.toInt(), start2.toInt()..end2.toInt())
            }
    }

    fun part1() {
        val fullyContainsCount = parse().count {
            val r1 = it.first
            val r2 = it.second
            r1.contains(r2.first) && r1.contains(r2.last) || r2.contains(r1.first) && r2.contains(r1.last)
        }
        println("fully contains: $fullyContainsCount")
    }

    fun part2() {
        val overlapCount = parse().count {
            val r1 = it.first
            val r2 = it.second
            r1.contains(r2.first) || r1.contains(r2.last) || r2.contains(r1.first) || r2.contains(r1.last)
        }

        println("overlap count: $overlapCount")
    }
}