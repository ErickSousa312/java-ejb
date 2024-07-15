package spring.domain.repository

interface RepositoryCRUD<T, Number> {
     fun findById(id: Number): T?
     fun findAll(): List<T?>?
     fun save(entity: T): T
     fun update(entity: T?):T?
     fun delete(id: Number?)
}