package spring.web.ui.item.typeItem.crud.create

import spring.domain.enums.HigieneType
import spring.domain.enums.ItemType
import spring.domain.enums.UnitOfMeasureType
import spring.domain.model.item.Item
import spring.utils.ConsoleUI
import spring.web.controller.ItemController

class CreateHygieneProduct {
    companion object {
        fun run (type:ItemType){
            var hygieneType: HigieneType
            do {
                print("Digite o tipo de produto de higiene (SABONETE, ESCOVA_DE_DENTES, PASTA_DE_DENTES, ABSORVENTES): ")
                val higieneTypeInput = ConsoleUI.getInputString()
                hygieneType = try {
                    HigieneType.valueOf(higieneTypeInput.uppercase())
                } catch (e: IllegalArgumentException) {
                    println("Tipo de produto de higiene inválido. Use SABONETE, ESCOVA_DE_DENTES, PASTA_DE_DENTES ou ABSORVENTES. Tente novamente.")
                    continue
                }

                var description: String
                while (true) {
                    print("Digite a descricao do item: ")
                    val descriptionInput = ConsoleUI.getInputString()
                    description = try {
                        descriptionInput
                    } catch (e: IllegalArgumentException) {
                        println("Tamanho de roupa inválido. Use INFANTIL, PP, P, M, G ou GG. Tente novamente.")
                        continue
                    }
                    break
                }

                val item = Item(null,null,type,description,null,null, UnitOfMeasureType.UNIDADE)
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