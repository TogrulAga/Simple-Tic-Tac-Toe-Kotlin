package tictactoe

import kotlin.math.abs

fun main() {
    val grid = Grid("_________")
    grid.play()
}

class Grid(cells: String) {
    private var grid = cells
    private var xWon = false
    private var oWon = false
    private var move = listOf(-1, -1)
    private var matrix = mutableListOf(
        mutableListOf(' ', ' ', ' '),
        mutableListOf(' ', ' ', ' '),
        mutableListOf(' ', ' ', ' ')
    )

    init {
        for (i in 0..2) {
            for (j in 0..2) {
                matrix[i][j] = cells[3 * i + j]
            }
        }
    }

    private fun mat2grid() {
        grid = matrix.joinToString("") { it.joinToString("") }
    }

    private fun printGrid() {
        println("""
        ---------
        | ${matrix[0].joinToString(separator = " ")} |
        | ${matrix[1].joinToString(separator = " ")} |
        | ${matrix[2].joinToString(separator = " ")} |
        ---------
    """.trimIndent())
    }

    private fun checkState() : Boolean {
        if (abs(grid.count { char: Char -> char == 'X' } - grid.count { char: Char -> char == 'O' } ) > 1) {
            println("Impossible")
            return false
        }

        // Check rows for winner
        for (row in matrix) {
            if (row.all { c: Char -> c == 'X' } || row.all { c: Char -> c == 'O' }) {
                if (row.first() == 'X'){
                    xWon = true
                } else if (row.first() == 'O') {
                    oWon = true
                }
            }
        }

        // Check columns for winner
        for (col in 0..2) {
            if (matrix[0][col] == matrix[1][col] && matrix[1][col] == matrix[2][col]) {
                if (matrix[0][col] == 'X') {
                    xWon = true
                } else if (matrix[0][col] == 'O') {
                    oWon = true
                }
            }
        }

        // Check diagonals for winner
        if (matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]) {
            if (matrix[1][1] == 'X'){
                xWon = true
            } else if (matrix[1][1] == 'O') {
                oWon = true
            }
        }

        if (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]) {
            if (matrix[1][1] == 'X'){
                xWon = true
            } else if (matrix[1][1] == 'O') {
                oWon = true
            }
        }

        if (xWon && oWon){
            println("Impossible")
            return false
        } else if (xWon) {
            println("X wins")
            return false
        } else if (oWon) {
            println("O wins")
            return false
        }

        // Check if game not finished or draw
        return if (grid.count { char -> char == '_' } != 0) {
            println("Game not finished")
            true
        } else {
            println("Draw")
            false
        }
    }

    private fun move(player: Char) {
        while (true) {
            print("Enter the coordinates: ")
            val string = readln().split(" ")
            if (string.any {it.any { ch -> ch in 'A'..'z' }}) {
                println("You should enter numbers!")
                continue
            } else {
                move = string.map { it.toInt() - 1 }
            }

            if (move.any { it !in 0..2 }) {
                println("Coordinates should be from 1 to 3!")
                continue
            } else if (matrix[move[0]][move[1]] != '_') {
                println("This cell is occupied! Choose another one!")
                continue
            }

            break
        }

        matrix[move[0]][move[1]] = player
        mat2grid()
    }

    fun play() {
        printGrid()
        while (checkState()) {
            move('X')
            printGrid()

            if (!checkState()) {
                break
            }

            move('O')
            printGrid()
        }
    }

}
