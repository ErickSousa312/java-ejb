package spring.web.ui.item.typeItem.crud.create

import spring.domain.enums.ItemType
import spring.domain.enums.UnitOfMeasureType
import spring.domain.model.item.Item
import spring.utils.ConsoleUI
import spring.web.controller.ItemController

class CreateFood {
    companion object{
        fun run (itemType: ItemType){
            do {
                var nameFood: String
                while (true) {
                    print("Digite o nome do alimento: ")
                    val inputName: String = ConsoleUI.getInputString()
                    if (inputName.isNotEmpty()) {
                        nameFood = inputName.uppercase()
                    } else {
                        println("O nome do alimento nao pode ser vazio: ")
                        continue
                    }
                    break
                }

//                var quantidade: Int
//                while (true) {
//                    print("Digite a quantidade do alimento: ")
//                    quantidade = ConsoleUI.getInputInteger()
//                    if (quantidade <= 0) {
//                        println("A quantidade do alimento deve ser maior que zero. Tente novamente.")
//                    } else {
//                        break
//                    }
//                }

                var unidadeMedida: UnitOfMeasureType
                while (true) {
                    print("Digite a unidade de medida do alimento (QUILOGRAMA, LITROS, UNIDADE): ")
                    val unidadeMedidaInput = ConsoleUI.getInputString()
                    unidadeMedida = try {
                        UnitOfMeasureType.valueOf(unidadeMedidaInput.uppercase())
                    } catch (e: Exception) {
                        println("Unidade de medida nao pode ser vazia. Tente novamente.")
                        continue
                    }
                    break
                }

                var description: String
                while (true) {
                    print("Digite a descricao do item: ")
                    val descriptionInput = ConsoleUI.getInputString()
                    description = try {
                        descriptionInput
                    } catch (e: IllegalArgumentException) {
                        println("")
                        continue
                    }
                    break
                }

                val item = Item(null, nameFood, itemType, description, null, null, unidadeMedida)
                ItemController.insert(item)

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