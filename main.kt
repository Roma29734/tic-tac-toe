package tictactoe

private fun enterCode(list2d: MutableList<MutableList<Char>>){
    print("Enter the coordinates: ")
    val (yInp, xInp) = readln().split(" ")
    var axelY: Int
    var axelX: Int
    try {
        val axelY = yInp.toInt()
        val axelX = xInp.toInt()
    } catch (e: NumberFormatException) {
        println("You should enter numbers!")
        enterCode(list2d)
        return
    }
    if (yInp.toInt() > 3 || xInp.toInt() > 3) {
        println("Coordinates should be from 1 to 3!")
        enterCode(list2d)
        return
    }
    axelY = yInp.toInt()
    axelX = xInp.toInt()

    if (list2d[axelY - 1][axelX - 1] != ' ') {
        println("This cell is occupied! Choose another one!")
        enterCode(list2d)
        return
    }
    var list2d = list2d
    list2d[axelY - 1].removeAt(axelX - 1)
    list2d[axelY - 1].add(axelX - 1, 'X')
    printTable(list2d)
}

private fun enterCodeO(list2d: MutableList<MutableList<Char>>){
    print("Enter the coordinates: ")
    val (yInp, xInp) = readln().split(" ")
    var axelY: Int
    var axelX: Int
    try {
        val axelY = yInp.toInt()
        val axelX = xInp.toInt()
    } catch (e: NumberFormatException) {
        println("You should enter numbers!")
        enterCodeO(list2d)
        return
    }
    if (yInp.toInt() > 3 || xInp.toInt() > 3) {
        println("Coordinates should be from 1 to 3!")
        enterCodeO(list2d)
        return
    }
    axelY = yInp.toInt()
    axelX = xInp.toInt()

    if (list2d[axelY - 1][axelX - 1] != ' ') {
        println("This cell is occupied! Choose another one!")
        enterCodeO(list2d)
        return
    }
    var list2d = list2d
    list2d[axelY - 1].removeAt(axelX - 1)
    list2d[axelY - 1].add(axelX - 1, 'O')
    printTable(list2d)
}

private fun printTable(list2d: MutableList<MutableList<Char>>) {
    println("---------")
    println("| ${list2d[0].joinToString(" ")} |")
    println("| ${list2d[1].joinToString(" ")} |")
    println("| ${list2d[2].joinToString(" ")} |")
    println("---------")
}

fun main(){
    val list2d = MutableList(3) { kotlin.collections.MutableList(3) { ' ' } }
    printTable(list2d)
    
    while(true){
        enterCode(list2d)
        if(list2d[0][0] == 'X' && list2d[0][1] == 'X' && list2d[0][2] == 'X'){
            println("X wins")
            break
        } else if(list2d[1][0] == 'X' && list2d[1][1] == 'X' && list2d[1][2] == 'X'){
            println("X wins")
            break
        }else if(list2d[2][0] == 'X' && list2d[2][1] == 'X' && list2d[2][2] == 'X'){
            println("X wins")
            break
        }else if(list2d[0][0] == 'X' && list2d[1][1] == 'X' && list2d[2][2] == 'X'){
            println("X wins")
            break
        }else if(list2d[0][2] == 'X' && list2d[1][1] == 'X' && list2d[2][0] == 'X'){
            println("X wins")
            break
        }else if(list2d[0][0] == 'X' && list2d[1][0] == 'X' && list2d[2][0] == 'X'){
            println("X wins")
            break
        }else if(list2d[0][1] == 'X' && list2d[1][1] == 'X' && list2d[2][1] == 'X'){
            println("X wins")
            break
        }else if(list2d[0][2] == 'X' && list2d[1][2] == 'X' && list2d[2][2] == 'X'){
            println("X wins")
            break
        }

        enterCodeO(list2d)
        if(list2d[0][0] == 'O' && list2d[0][1] == 'O' && list2d[0][2] == 'O'){
            println("O wins")
            break
        } else if(list2d[1][0] == 'O' && list2d[1][1] == 'O' && list2d[1][2] == 'O'){
            println("O wins")
            break
        }else if(list2d[2][0] == 'O' && list2d[2][1] == 'O' && list2d[2][2] == 'O'){
            println("O wins")
            break
        }else if(list2d[0][0] == 'O' && list2d[1][1] == 'O' && list2d[2][2] == 'O'){
            println("O wins")
            break
        }else if(list2d[0][2] == 'O' && list2d[1][1] == 'O' && list2d[2][0] == 'O'){
            println("O wins")
            break
        }else if(list2d[0][0] == 'O' && list2d[1][0] == 'O' && list2d[2][0] == 'O'){
            println("O wins")
            break
        }else if(list2d[0][1] == 'O' && list2d[1][1] == 'O' && list2d[2][1] == 'O'){
            println("O wins")
            break
        }else if(list2d[0][2] == 'O' && list2d[1][2] == 'O' && list2d[2][2] == 'O'){
            println("O wins")
            break
        }
    }
}
