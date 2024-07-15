package spring.domain.services

import jakarta.persistence.EntityManager
import spring.domain.model.shelterStock.ShelterStock
import spring.domain.repository.ShelterStockRepository
import spring.utils.Jpa

class ShelterStockService : ShelterStockRepository {


    private val entityManager: EntityManager = Jpa.getEntityManager()

    override fun findById(id: Long): ShelterStock? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<ShelterStock?>? {
        TODO("Not yet implemented")
    }

    override fun save(entity: ShelterStock): ShelterStock {
        entityManager.transaction.begin()
        entityManager.persist(entity)
        entityManager.transaction.commit()
        return entity
    }

    override fun update(entity: ShelterStock?):ShelterStock {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long?) {
        TODO("Not yet implemented")
    }

}

