package spring.web.ui.item.typeItem

import spring.domain.enums.*
import spring.utils.ConsoleUI
import spring.web.ui.item.typeItem.crud.create.CreateClothing
import spring.web.ui.item.typeItem.crud.create.CreateFood
import spring.web.ui.item.typeItem.crud.create.CreateHygieneProduct
import spring.web.ui.item.typeItem.crud.delete.DeleteItem
import spring.web.ui.item.typeItem.crud.read.ReadItem
import spring.web.ui.item.typeItem.crud.update.UpdateItemClothing
import spring.web.ui.item.typeItem.crud.update.UpdateItemFood
import spring.web.ui.item.typeItem.crud.update.UpdateItemHygiene
import java.lang.Thread.sleep

class ScreenItem {
    companion object {

        fun createItem() {
            var type: ItemType
            while (true) {
                print("Digite o tipo do item (ROUPA, PRODUTO_DE_HIGIENE, ALIMENTO): ")
                val typeInput = ConsoleUI.getInputString()
                type = try {
                    ItemType.valueOf(typeInput.uppercase())
                } catch (e: IllegalArgumentException) {
                    println("Tipo de item invalido. Use ROUPA, PRODUTO_DE_HIGIENE ou ALIMENTO. Tente novamente.")
                    continue
                }
                break
            }

            val item = when (type) {
                ItemType.ROUPA -> CreateClothing.run(type)
                ItemType.PRODUTO_DE_HIGIENE -> CreateHygieneProduct.run(type)
                ItemType.ALIMENTO -> CreateFood.run(type)
            }

            println("Item criado: $item")
            sleep(5000)
        }
 //--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
        fun viewItem(){
            ReadItem.run()
        }
//--------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------------------------------
        fun updateItem() {
            var type: ItemType
            while (true) {
                print("Digite o tipo do item para atualizar (ROUPA, PRODUTO_DE_HIGIENE, ALIMENTO): ")
                val typeInput = ConsoleUI.getInputString()
                type = try {
                    ItemType.valueOf(typeInput.uppercase())
                } catch (e: IllegalArgumentException) {
                    println("Tipo de item invalido. Use ROUPA, PRODUTO_DE_HIGIENE ou ALIMENTO. Tente novamente.")
                    continue
                }
                break
            }
            when (type) {
                ItemType.ROUPA -> UpdateItemClothing.run()
                ItemType.PRODUTO_DE_HIGIENE -> UpdateItemHygiene.run()
                ItemType.ALIMENTO -> UpdateItemFood.run()
            }
        }

        fun deleteItem(){
            DeleteItem.run()
        }
    }
}