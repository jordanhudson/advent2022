fun main(args: Array<String>) {
    Day2.part1()
    Day2.part2()
}

object Day2 {

    fun part1() {

        // forget parsing the input and playing the game, it's just 9 possible values
        val scoreMap = hashMapOf<String, Int>(
            "A X" to 4, // rock rock, 1 for rock, 3 for draw
            "A Y" to 8, // rock paper, 2 for paper, 6 for win
            "A Z" to 3, // rock sciss, 3 for sciss, 0 for loss
            "B X" to 1, // paper rock, 1 for rock, 0 for loss
            "B Y" to 5, // paper paper, 2 for paper, 3 for draw
            "B Z" to 9, // paper sciss, 3 for sciss, 6 for win
            "C X" to 7, // sciss rock, 1 for rock, 6 for win
            "C Y" to 2, // sciss paper, 2 for paper, 0 for loss
            "C Z" to 6, // sciss sciss, 3 for sciss, 3 for draw
        )

        val totalScore = Util
            .getResourceFileLines("day2.txt")
            .map { scoreMap[it]!! }
            .sum()

        println("total score: $totalScore")

    }

    fun part2() {

        // again, forget parsing the input and playing the game, it's just 9 possible values
        val scoreMap = hashMapOf<String, Int>(
            "A X" to 3, // lose, rock sciss, 3 for sciss, 0 for loss
            "A Y" to 4, // draw, rock rock, 1 for rock, 3 for draw
            "A Z" to 8, // win, rock paper, 2 for paper, 6 for win
            "B X" to 1, // lose, paper rock, 1 for rock, 0 for loss
            "B Y" to 5, // draw, paper paper, 2 for paper, 3 for draw
            "B Z" to 9, // win, paper sciss, 3 for sciss, 6 for win
            "C X" to 2, // lose, sciss paper, 2 for paper, 0 for loss
            "C Y" to 6, // draw, sciss sciss, 3 for sciss, 3 for draw
            "C Z" to 7, // win, sciss rock, 1 for rock, 6 for win
        )

        val totalScore = Util
            .getResourceFileLines("day2.txt")
            .map { scoreMap[it]!! }
            .sum()

        println("total score: $totalScore")

    }
}