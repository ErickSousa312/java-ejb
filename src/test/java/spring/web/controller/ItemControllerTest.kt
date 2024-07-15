package spring.web.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import spring.commons.itemConstains.item


class ItemControllerTest {
    @Test
    fun testCreateItem_whenCreated_thenReturnItem() {
        val item = ItemController.insert(item)
        assertThat(item.id).isNotNull()
    }

    @Test
    fun testUpdateItem_whenUpdated_thenReturnItemUpdated() {
        val item = ItemController.findById(552)
        assertThat(item?.id).isNotNull()
        item?.apply {
            name = "teste updated"
        }
        val itemUpdated = item?.let { ItemController.update(it) }
        assertThat(itemUpdated).isEqualTo(item)
    }

    @Test
    fun testDeleteItem_whenDeleted_thenReturnItemDeleted() {
        ItemController.delete(502)
        val item = ItemController.findById(502)
        assertThat(item?.id).isNull()
    }

}