package spring.web.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import spring.commons.StockContains.stockValid

class StockControllerTest {
    @Test
    fun testStocks_whenCreated_thenReturnStock() {
        val result = StockController.insert(stockValid)
        assertThat(result.itemId).isNotNull
        assertThat(result.id).isNotNull
    }
}