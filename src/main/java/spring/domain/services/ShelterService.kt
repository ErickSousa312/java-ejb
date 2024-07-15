package spring.domain.services

import jakarta.persistence.EntityManager
import spring.domain.model.shelter.Shelter
import spring.domain.repository.ShelterRepository
import spring.utils.Jpa

class ShelterService:ShelterRepository {

    private val entityManager: EntityManager = Jpa.getEntityManager()

    override fun findById(id: Long): Shelter? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Shelter?>? {
        val query: String = "select c from Shelter c"
        return entityManager.createQuery(query, Shelter::class.java).resultList
    }

    override fun save(entity: Shelter): Shelter {
        entityManager.transaction.begin()
        entityManager.persist(entity)
        entityManager.transaction.commit()
        return entity
    }

    override fun update(entity: Shelter?):Shelter {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long?) {
        TODO("Not yet implemented")
    }

}