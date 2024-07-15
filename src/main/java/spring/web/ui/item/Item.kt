package spring.web.ui.item

import spring.utils.ConsoleUI
import spring.web.ui.item.typeItem.ScreenItem

class Item {
    companion object {
        fun screen(){
            while(true){
                showGUIItem()
                when(ConsoleUI.getInputInteger()){
                    1-> ScreenItem.createItem()
                    2-> ScreenItem.viewItem()
                    3-> ScreenItem.updateItem()
                    4-> ScreenItem.deleteItem()
                    5-> break
                    else -> break
                }
            }

        }
        private fun showGUIItem() {
            ConsoleUI.clear()
            println("||============================||")
            println("||            Item            ||")
            println("||                            ||")
            println("|| 1 - Criar                  ||")
            println("|| 2 - Vizualizar             ||")
            println("|| 3 - Editar                 ||")
            println("|| 4 - Apagar                 ||")
            println("||                            ||")
            println("|| 5 - Voltar                 ||")
            println("||============================||")
            print(">> ")
        }
    }
}