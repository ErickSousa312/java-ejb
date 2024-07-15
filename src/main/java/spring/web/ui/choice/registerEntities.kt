package spring.web.ui.choice

import spring.utils.ConsoleUI
import spring.web.ui.item.Item
import spring.web.ui.shelter.Shelter

class registerEntities {
    companion object {
        fun run() {
            while (true){
                showGUI()
                when(ConsoleUI.getInputInteger()){
                    1-> Item.screen()
                    4-> Shelter.screen()
                    5-> break
                    else-> ConsoleUI.invalidChoice()
                }
            }
        }
        private fun showGUI() {
            ConsoleUI.clear()
            println("||============================||")
            println("||     Edicao de Entidades    ||")
            println("||                            ||")
            println("|| 1 - Item                   ||")
            println("|| 2 - Item Doado             ||")
            println("|| 3 - Abrigo                 ||")
            println("|| 4 - Centro de doacao       ||")
            println("||                            ||")
            println("|| 5 - EXIT                   ||")
            println("||============================||")
            print(">> ")
        }

    }
}