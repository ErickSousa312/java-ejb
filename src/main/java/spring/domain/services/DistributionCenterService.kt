package spring.domain.services

import jakarta.persistence.EntityManager
import spring.domain.model.distributionCenter.DistributionCenter
import spring.domain.repository.DistributionCenterRepository
import spring.utils.Jpa

class DistributionCenterService : DistributionCenterRepository{

    private val entity: EntityManager = Jpa.getEntityManager()

    override fun findById(id: Long?): DistributionCenter? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<DistributionCenter?>? {
        val query: String = "select c from Item c"
        return entity.createQuery(query,DistributionCenter::class.java).resultList
    }

    override fun save(distributionCenter: DistributionCenter): DistributionCenter {
        entity.transaction.begin()
        entity.persist(distributionCenter)
        entity.transaction.commit()
        return distributionCenter
    }

    override fun update(user: DistributionCenter?) {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long?) {
        TODO("Not yet implemented")
    }
}