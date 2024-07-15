package spring.utils

import java.util.*

class ConsoleUI {
    companion object {

        private var scanner: Scanner = Scanner(System.`in`)

        fun clear() {
            print("\u001b[H\u001b[2J")
            System.out.flush()
        }
        fun getInputInteger ():Int{
            val value = scanner.nextInt()
            scanner.nextLine()
            return value
        }
        fun getInputIntegerLong() : Long{
            val value = scanner.nextLong()
            scanner.nextLine()
            return value
        }
        fun getInputString():String{
            val value = scanner.nextLine()
            return value

        }
        fun invalidChoice() {
            try {
                clear()
                println("Escolha invalida. Por favor selecione um opcao valida.")
                Thread.sleep(2000)
            } catch (e: Exception) {
                clear()
            }
        }
    }
}