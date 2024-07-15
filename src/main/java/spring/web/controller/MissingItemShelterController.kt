package spring.web.controller

import spring.domain.model.missingItemShelter.MissingItemShelter
import spring.domain.services.MissingItemShelterService

class MissingItemShelterController {
    companion object{
        private val missingItemShelterService: MissingItemShelterService = MissingItemShelterService()

        fun insert(missingItemShelter: MissingItemShelter):MissingItemShelter{
            return missingItemShelterService.save(missingItemShelter)
        }
    }
}