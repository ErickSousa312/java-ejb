package spring.web.ui.item.typeItem.crud.update

import spring.domain.enums.GenreType
import spring.domain.enums.HigieneType
import spring.domain.enums.RoupaSize
import spring.domain.enums.RoupaType
import spring.utils.ConsoleUI
import spring.web.controller.ItemController
import spring.web.dto.ItemDTO
import java.lang.Thread.sleep


class UpdateItemHygiene {
    companion object {
        fun run (){
            while (true) {
                ConsoleUI.clear()
                println("||===========================================||")
                println("||                                           ||")
                println("||   digite o ID do item para ser alterado   ||")
                println("||                                           ||")
                println("|| 0 - EXIT                                  ||")
                println("||===========================================||")
                print(">> ")
                when (val choice = ConsoleUI.getInputIntegerLong()) {
                    0L -> break
                    else -> updateItem(choice)
                }
            }
        }
        private fun updateItem(idItem: Long){
            val item = ItemDTO()
            item.id = idItem
            do {
                while (true) {
                    print("Digite o novo tipo de produto de higiene (SABONETE, ESCOVA_DE_DENTES, PASTA_DE_DENTES, ABSORVENTES):: ")
                    val higieneTypeInput = ConsoleUI.getInputString()
                    item.name = try {
                        HigieneType.valueOf(higieneTypeInput.uppercase()).toString()
                    } catch (e: IllegalArgumentException) {
                        println("Tipo de roupa invalido. Use AGASALHO ou CAMISA. Tente novamente.")
                        continue
                    }
                    break
                }

                while (true) {
                    print("Digite a descricao do item: ")
                    val descriptionInput = ConsoleUI.getInputString()
                    item.description = try {
                        descriptionInput
                    } catch (e: IllegalArgumentException) {
                        println("Tamanho de roupa invalido. Use INFANTIL, PP, P, M, G ou GG. Tente novamente.")
                        continue
                    }
                    break
                }

                print(item)
                //Um verficia se o item existe ai ele muda o indentificador para
                // ItemDTO em vez de ItemDTO? e é a msm coisa pra o insert
                item.let { ItemController.update(it) }

                println("Operacao realizada com sucesso")
                sleep(3000)

                println("")
                println("deseja alterar mais produtos ?")
                println("1 - sim")
                println("2 - nao")
                println("")
                print(">> ")
                val inputUser = ConsoleUI.getInputInteger()
                when (inputUser) {
                    1-> continue
                    2-> break
                }

            } while (true)
        }
    }
}