package spring.web.ui.item.typeItem.crud.read

import spring.utils.ConsoleUI
import spring.web.controller.ItemController
import spring.web.dto.ItemDTO

class ReadItem {
    companion object{
        fun run (){
            val allItems = ItemController.findAll()
            showData(allItems)
            while (true){
                when(ConsoleUI.getInputInteger()){
                    1 -> break
                    else -> ConsoleUI.invalidChoice()
                }
            }
        }

        private fun showData(items: MutableList<ItemDTO>) {
            ConsoleUI.clear()
            println("||============================")
            println("||                            ")
            items.forEach {
                print("|| ")
                println(it)
            }
            println("||                              ")
            println("|| 1 - EXIT                     ")
            println("||                              ")
            println("||==============================")
            print(">> ")
        }
    }
}