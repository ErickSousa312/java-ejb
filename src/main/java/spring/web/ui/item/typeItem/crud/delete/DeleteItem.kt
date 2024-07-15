package spring.web.ui.item.typeItem.crud.delete

import spring.utils.ConsoleUI
import spring.web.controller.ItemController

class DeleteItem {
    companion object{
        fun run (){
            while(true) {
                ConsoleUI.clear()
                println("||===========================================||")
                println("||                                           ||")
                println("||   digite o ID do item para ser apagado    ||")
                println("||                                           ||")
                println("|| 0 - EXIT                                  ||")
                println("||===========================================||")
                print(">> ")
                when (val choice = ConsoleUI.getInputIntegerLong()) {
                    0L -> break
                    else -> {
                        ItemController.delete(choice)
                        break
                    }
                }
            }
        }
    }
}