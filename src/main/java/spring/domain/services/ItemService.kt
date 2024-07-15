package spring.domain.services

import jakarta.persistence.EntityManager
import spring.domain.model.item.Item
import spring.domain.repository.ItemRepository
import spring.utils.Jpa

class ItemService: ItemRepository {

    private val entity: EntityManager = Jpa.getEntityManager()


    override fun findById(id: Long): Item? {
        return entity.find(Item::class.java, id)
    }

    override fun findAll(): List<Item>? {
        val query: String = "select c from Item c"
        return entity.createQuery(query, Item::class.java).resultList
    }

    override fun save(entity: Item): Item {
        this.entity.transaction.begin()
        this.entity.persist(entity)
        this.entity.transaction.commit()
        return entity
    }

    override fun update(entity: Item?): Item? {

        this.entity.transaction.begin()
        var item = entity?.id?.let { findById(it) }?: return null

        item.apply {
            name = entity.name
            entity.name?.let { name = it }
            entity.type?.let { type = it }
            entity.description?.let { description = it }
            entity.gender?.let { gender = it }
            entity.size?.let { size = it }
            entity.unitOfMeasureType?.let { unitOfMeasureType = it }
        }
        this.entity.merge(item)
        this.entity.transaction.commit()
        return item
    }

    override fun delete(id: Long?) {
        entity.transaction.begin()
        val item = id?.let { findById(it) }
        entity.remove(item)
        entity.transaction.commit()
    }
}