package spring.web.ui.item.typeItem.crud.update

import spring.domain.enums.UnitOfMeasureType
import spring.utils.ConsoleUI
import spring.web.controller.ItemController
import spring.web.dto.ItemDTO
import java.lang.Thread.sleep

class UpdateItemFood {
    companion object {
        fun run() {
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

        private fun updateItem(idItem: Long) {
            do {
                val item = ItemDTO()
                item.id = idItem

                while (true) {
                    print("Digite o nome do alimento: ")
                    val inputName: String = ConsoleUI.getInputString()
                    if (inputName.isNotEmpty()) {
                        item.name = inputName.uppercase()
                    } else {
                        println("O nome do alimento nao pode ser vazio: ")
                        continue
                    }
                    break
                }

                while (true) {
                    print("Digite a unidade de medida do alimento (QUILOGRAMA, LITROS, UNIDADE): ")
                    val unidadeMedidaInput = ConsoleUI.getInputString()
                    item.unitOfMeasure = try {
                        UnitOfMeasureType.valueOf(unidadeMedidaInput.uppercase()).toString()
                    } catch (e: Exception) {
                        println("Unidade de medida nao pode ser vazia. Tente novamente.")
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
                        println("")
                        continue
                    }
                    break
                }

                item.let { ItemController.update(it) }


                println("Operacao realizada com sucesso")
                sleep(3000)
                println("")
                println("deseja inserir mais produtos ?")
                println("1 - sim")
                println("2 - nao")
                println("")
                print(">> ")
                val inputUser = ConsoleUI.getInputInteger()
                when (inputUser) {
                    1-> continue
                    2-> break
                }

            }while (true)
        }
    }
}