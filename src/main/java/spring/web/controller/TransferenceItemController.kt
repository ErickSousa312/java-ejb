package spring.web.controller

import spring.domain.model.transferenceItem.TransferenceItem
import spring.domain.services.TransferenceItemService

class TransferenceItemController {
    companion object{

        private val transferenceItemService: TransferenceItemService = TransferenceItemService()

        fun insert (transferenceItem: TransferenceItem): TransferenceItem{
            return transferenceItemService.save(transferenceItem)
        }
    }
}