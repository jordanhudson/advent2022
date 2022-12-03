fun main(args: Array<String>) {
    Day3.part1()
    Day3.part2()
}

object Day3 {

    fun part1() {
        val sumOfPriorities = Util
            .getResourceFileLines("day3.txt")
            .map { Pair(it.take(it.length / 2), it.takeLast(it.length / 2)) }
            .map { it.first.toSet().intersect(it.second.toSet()) }
            .sumOf { it.sumOf { if (it.isLowerCase()) it.code - 96 else it.code - 38 } }

        println("Sum of priorities: $sumOfPriorities")
    }

    fun part2() {
        val input = Util.getResourceFileLines("day3.txt")

        val sumOfBadgePriorities = input
            .indices
            .map { it / 3 * 3 } // 0, 0, 0, 3, 3, 3, 6, 6, 6, etc
            .distinct()
            .map { Triple(input[it], input[it + 1], input[it + 2]) }
            .map { it.first.toSet().intersect(it.second.toSet()).intersect(it.third.toSet()) }
            .sumOf { it.sumOf { if (it.isLowerCase()) it.code - 96 else it.code - 38 } }

        println("Sum of badge priorities: $sumOfBadgePriorities")
    }
}