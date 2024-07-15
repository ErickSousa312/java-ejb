package spring.web.ui.item.typeItem.crud.create

import spring.domain.enums.*
import spring.domain.model.item.Item
import spring.utils.ConsoleUI
import spring.web.controller.ItemController

class CreateClothing {
    companion object {
        fun run(type: ItemType) {
            do {
                var roupaType: RoupaType
                while (true) {
                    print("Digite o tipo de roupa (AGASALHO, CAMISA): ")
                    val roupaTypeInput = ConsoleUI.getInputString()
                    roupaType = try {
                        RoupaType.valueOf(roupaTypeInput.uppercase())
                    } catch (e: IllegalArgumentException) {
                        println("Tipo de roupa invalido. Use AGASALHO ou CAMISA. Tente novamente.")
                        continue
                    }
                    break
                }

                var roupaSize: RoupaSize
                while (true) {
                    print("Digite o tamanho da roupa (INFANTIL, PP, P, M, G, GG): ")
                    val roupaSizeInput = ConsoleUI.getInputString()
                    roupaSize = try {
                        RoupaSize.valueOf(roupaSizeInput.uppercase())
                    } catch (e: IllegalArgumentException) {
                        println("Tamanho de roupa invalido. Use INFANTIL, PP, P, M, G ou GG. Tente novamente.")
                        continue
                    }
                    break
                }

                var genre: GenreType
                while (true) {
                    print("Digite o genero da roupa (Masculino, Feminino): ")
                    val genreInput = ConsoleUI.getInputString()
                    genre = try {
                        GenreType.valueOf(genreInput.uppercase())
                    } catch (e: IllegalArgumentException) {
                        println("Genero de roupa invalido. Use Masculino, Feminino. Tente novamente.")
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
                val item = Item(null,roupaType.toString(),type,description,genre,roupaSize, UnitOfMeasureType.UNIDADE)
                print(item)
                ItemController.insert(item)

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