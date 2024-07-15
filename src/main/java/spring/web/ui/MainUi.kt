package spring.web.ui

import spring.utils.ConsoleUI
import spring.web.ui.choice.registerEntities

class MainUi {
    companion object {
        @JvmStatic
        fun main(){
            while (true){
                showGUI()
                when(ConsoleUI.getInputInteger()){
                    1-> registerEntities.run()
                    2-> print("Donation Lot Selected")
                    else-> ConsoleUI.invalidChoice()
                }
            }
        }

         private fun showGUI() {
            ConsoleUI.clear()
            println("||============================||")
            println("||                            ||")
            println("|| 1 - Criar/Editar Entidades ||")
            println("|| 2 -                        ||")
            println("|| 3 - EXIT                   ||")
            println("||                            ||")
            println("||============================||")
            print(">> ")
        }

    }
}