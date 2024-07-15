package spring.domain.services

import jakarta.persistence.EntityManager
import spring.domain.model.lot.Lot
import spring.domain.repository.LotRepository
import spring.utils.Jpa

class LotService: LotRepository {

    private val entity : EntityManager = Jpa.getEntityManager()

    override fun findById(id: Long): Lot? {
        return entity.find(Lot::class.java, id)
    }

    override fun findAll(): List<Lot?>? {
        val query:String = "select t from Lot t"
        return entity.createQuery(query, Lot::class.java).resultList
    }

    override fun delete(id: Long?) {
        TODO("Not yet implemented")
    }

    override fun update(entity: Lot?):Lot {
        TODO("Not yet implemented")
    }

    override fun save(entity: Lot): Lot {
        this.entity.transaction.begin()
        this.entity.persist(entity)
        this.entity.transaction.commit()
        return entity
    }
}