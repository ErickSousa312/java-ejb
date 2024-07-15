package spring.testIntegrations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import spring.domain.model.donatedItems.DonatedItem
import spring.domain.model.item.Item
import spring.domain.model.lot.Lot
import spring.web.controller.ItemController
import spring.web.controller.LotController
import java.util.*

class LotItemsTest {
    @Test
    fun testLotItems() {
        val item = ItemController.findById(502)
        assertThat(item?.id).isNotNull

        val donatedItemOBJ = DonatedItem(null, Lot(), item?.let { Item.mapToItem(it) },"nada",29,Date())
        val lot = Lot(null, mutableListOf(donatedItemOBJ),0,Date())

//        assertThat(lot.donatedItemId).contains(donatedItemOBJ)
        val result = LotController.insert(lot)
        assertThat(result.id).isNotNull
//        val search = LotController.findById(result.id!!)

    }
}