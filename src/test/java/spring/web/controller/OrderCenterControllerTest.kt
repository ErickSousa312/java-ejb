package spring.web.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import spring.commons.OrderCenterContains.orderCenterValid
import spring.domain.model.orderCenter.OrderCenter

class OrderCenterControllerTest {
    @Test
    fun testOrderCenter_whenCreated_shouldReturnOrderCenter() {
        val orderCenter = OrderCenterController.insert(orderCenterValid)
        assertThat(orderCenter.id).isNotNull
    }
}