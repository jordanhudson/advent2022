fun main(args: Array<String>) {
    Day1.part1()
    Day1.part2()
}

object Day1 {

    fun parse(input: List<String>): ArrayList<Int> {
        val elfCalorieCounts = ArrayList<Int>(0)
        var accumulator = 0
        input.forEach {
            if (it == "") {
                elfCalorieCounts.add(accumulator)
                accumulator = 0
            }
            else {
                accumulator += it.toInt()
            }
        }
        return elfCalorieCounts
    }

    fun part1() {
        val elfCalorieCounts = parse(Util.getResourceFileLines("day1.txt"))
        println("elf carrying the most is carrying: ${elfCalorieCounts.max()}")
    }

    fun part2() {
        val elfCalorieCounts = parse(Util.getResourceFileLines("day1.txt"))
        elfCalorieCounts.sortDescending()
        println("top 3 elves are carrying: ${elfCalorieCounts.take(3).sum()}")
    }
}