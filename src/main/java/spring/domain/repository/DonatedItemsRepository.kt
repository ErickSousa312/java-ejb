package spring.domain.repository

import spring.web.dto.DonatedItemDTO
import spring.domain.model.donatedItems.DonatedItem

interface DonatedItemsRepository {
    fun findById(id: Long?): DonatedItemDTO?
    fun findAll(): List<DonatedItem?>?
    fun save(donatedItems: DonatedItem): DonatedItem
    fun update(user: DonatedItem?)
    fun delete(id: DonatedItem?)
}
