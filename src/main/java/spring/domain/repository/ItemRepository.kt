package spring.domain.repository

import spring.domain.model.item.Item

interface ItemRepository: RepositoryCRUD<Item, Long> {

}