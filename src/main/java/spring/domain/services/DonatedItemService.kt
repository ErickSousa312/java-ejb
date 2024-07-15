package spring.domain.services

import jakarta.persistence.EntityManager
import jakarta.validation.Validation
import jakarta.validation.Validator
import spring.web.dto.DonatedItemDTO
import spring.domain.model.donatedItems.DonatedItem
import spring.domain.repository.DonatedItemsRepository
import spring.utils.Jpa

class DonatedItemService : DonatedItemsRepository{

    private var entity: EntityManager = Jpa.getEntityManager()

    override fun save(donatedItems: DonatedItem): DonatedItem {
        entity.transaction.begin()
        entity.persist(donatedItems)
        entity.transaction.commit()
        return donatedItems
    }

    override fun findById(id: Long?): DonatedItemDTO {
        val query: String = "SELECT d FROM DonatedItem d WHERE d.id = :id"
        val result = entity.createQuery(query,DonatedItem::class.java).setParameter("id", id).singleResult
        val dataDTO: DonatedItemDTO = DonatedItemDTO(result)
        println(dataDTO.toString())
        return dataDTO
    }

    override fun findAll(): List<DonatedItem?>? {
        TODO("Not yet implemented")
    }

    override fun update(user: DonatedItem?) {
        TODO("Not yet implemented")
    }

    override fun delete(id: DonatedItem?) {
        TODO("Not yet implemented")
    }
}