package spring.web.controller

import spring.domain.model.item.Item
import spring.domain.services.ItemService
import spring.web.dto.ItemDTO

class ItemController {
    companion object {
        private val itemService: ItemService = ItemService()

        fun insert (item : Item) : Item {
            return itemService.save(item)
        }

        fun findById(itemId: Long) : ItemDTO? {
            return itemService.findById(itemId)?.let { ItemDTO(it) }
        }

        fun findAll() : MutableList<ItemDTO> {
            val items = itemService.findAll()?:return emptyList<ItemDTO>().toMutableList()
            return items.map { ItemDTO(it) }.toMutableList()
        }

        fun update(item : ItemDTO) : ItemDTO? {
            return itemService.update(Item.mapToItem(item))?.let { ItemDTO(it) }
        }

        fun delete(item : Long) {
            return itemService.delete(item)
        }
    }
}