package spring.web.controller

import spring.web.dto.DonatedItemDTO
import spring.domain.model.donatedItems.DonatedItem
import spring.domain.services.DonatedItemService

class DonatedItemsController  {
    companion object{
        private val donatedItemsService: DonatedItemService = DonatedItemService()

        fun insert (donatedItems: DonatedItem):DonatedItem{
            return donatedItemsService.save(donatedItems)
        }

        fun findById(donatedItemId:Long?): DonatedItemDTO {
            return donatedItemsService.findById(donatedItemId)
        }

    }
}