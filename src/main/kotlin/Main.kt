fun main(args: Array<String>) {
    //Day1.part1()
    Day1.part2()
}

object Day1 {
    fun part1() {
        val input = Util.getResourceFileLines("day1.txt")
        val elves = ArrayList<Int>(0)

        var accumulator = 0
        input.forEach {
            if (it == "") {
                elves.add(accumulator)
                accumulator = 0
            }
            else {
                accumulator += it.toInt()
            }
        }

        println("elf carrying the most is carrying: ${elves.max()}")
    }

    fun part2() {
        val input = Util.getResourceFileLines("day1.txt")
        val elves = ArrayList<Int>(0)

        var accumulator = 0
        input.forEach {
            if (it == "") {
                elves.add(accumulator)
                accumulator = 0
            }
            else {
                accumulator += it.toInt()
            }
        }
        elves.sortDescending()
        println("top 3 elves are carrying: ${elves.take(3).sum()}")
    }
}