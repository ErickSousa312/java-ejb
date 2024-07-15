package spring.web.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import spring.domain.model.donatedItems.DonatedItem
import spring.domain.model.item.Item
import spring.domain.services.DonatedItemService
import java.text.SimpleDateFormat

class DonatedItemControllerTest () {

    private lateinit var donatedItemsService: DonatedItemService

    @BeforeEach
    fun setup (){
        val service = DonatedItemService()
        donatedItemsService = service
    }

    @Test
    fun testDonatedItemsController() {

         val dateFormat = SimpleDateFormat("yyyy-MM-dd")
         val dateString = "2023-12-25"

         val date1 = dateFormat.parse(dateString)


        val item = ItemController.findById(52)
        println(item)
        val data = DonatedItem(
            null,
            null,
            item?.let { Item.mapToItem(it) },
            "anyone description2sds",
            50,
            date1,
        )

        val result = DonatedItemsController.insert(data)
        assertThat(result.id).isNotNull()
    }

    @Test
    fun testDonatedItemsControllerFindById() {

        val result = DonatedItemsController.findById(4102)
        println(result)
        assertThat(result.id).isNotNull()
    }
}