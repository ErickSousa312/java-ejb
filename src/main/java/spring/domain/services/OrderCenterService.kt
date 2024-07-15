package spring.domain.services

import jakarta.persistence.EntityManager
import spring.domain.model.orderCenter.OrderCenter
import spring.domain.repository.OrderCenterRepository
import spring.utils.Jpa

class OrderCenterService: OrderCenterRepository {

    private val entityManager: EntityManager = Jpa.getEntityManager()

    override fun findById(id: Long): OrderCenter? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<OrderCenter?>? {
        val query: String = "select c from OrderCenter c"
        return entityManager.createQuery(query,OrderCenter::class.java).resultList
    }

    override fun save(entity: OrderCenter): OrderCenter {
        entityManager.transaction.begin()
        entityManager.persist(entity)
        entityManager.transaction.commit()
        return entity
    }

    override fun update(entity: OrderCenter?):OrderCenter {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long?) {
        TODO("Not yet implemented")
    }
}