package spring.web.ui.shelter

import spring.utils.ConsoleUI

class Shelter {
    companion object {
        fun screen(){
            while (true){
                showGUIShelter()
                when(ConsoleUI.getInputInteger()){
                    1-> print("oi")
                }
            }
        }
        private fun showGUIShelter() {
            ConsoleUI.clear()
            println("||============================||")
            println("||           Abrigo           ||")
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