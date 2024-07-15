package spring.domain.services

import jakarta.persistence.EntityManager
import spring.domain.model.stock.Stock
import spring.domain.repository.StockRepository
import spring.utils.Jpa

class StockService: StockRepository{
    private val entityManager: EntityManager = Jpa.getEntityManager()
    override fun findById(id: Long): Stock? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Stock?>? {
        val query: String = "select c from Stock c"
        return entityManager.createQuery(query,Stock::class.java).resultList
    }

    override fun save(entity: Stock): Stock {
        entityManager.transaction.begin()
        entityManager.persist(entity)
        entityManager.transaction.commit()
        return entity
    }

    override fun update(entity: Stock?):Stock {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long?) {
        TODO("Not yet implemented")
    }


}