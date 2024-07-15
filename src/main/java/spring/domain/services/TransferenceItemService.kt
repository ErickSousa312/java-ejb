package spring.domain.services

import jakarta.persistence.EntityManager
import spring.domain.model.transferenceItem.TransferenceItem
import spring.domain.repository.TransferenceItemRepository
import spring.utils.Jpa

class TransferenceItemService: TransferenceItemRepository {

    private val entityManager: EntityManager = Jpa.getEntityManager()

    override fun findById(id: Long): TransferenceItem? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<TransferenceItem?>? {
        val query: String = "select b from TransferenceItem b "
        return entityManager.createQuery(query, TransferenceItem::class.java).resultList
    }

    override fun save(entity: TransferenceItem): TransferenceItem {
        entityManager.transaction.begin()
        entityManager.persist(entity)
        entityManager.transaction.commit()
        return entity
    }

    override fun update(entity: TransferenceItem?):TransferenceItem {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long?) {
        TODO("Not yet implemented")
    }

}