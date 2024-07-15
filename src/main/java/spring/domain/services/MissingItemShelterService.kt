package spring.domain.services

import jakarta.persistence.EntityManager
import spring.domain.model.missingItemShelter.MissingItemShelter
import spring.domain.repository.MissingItemShelterRepository
import spring.utils.Jpa

class MissingItemShelterService: MissingItemShelterRepository {
    private val entityManager = Jpa.getEntityManager()
    override fun findById(id: Long): MissingItemShelter? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<MissingItemShelter?>? {
        val query: String = "select c from MissingItemShelter c"
        return entityManager.createQuery(query, MissingItemShelter::class.java).resultList
    }

    override fun save(entity: MissingItemShelter): MissingItemShelter {
        entityManager.transaction.begin()
        entityManager.persist(entity)
        entityManager.transaction.commit()
        return entity
    }

    override fun update(entity: MissingItemShelter?):MissingItemShelter {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long?) {
        TODO("Not yet implemented")
    }

}