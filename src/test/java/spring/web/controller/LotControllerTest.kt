package spring.web.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import spring.commons.LotContains.LotValid

class LotControllerTest {

    @Test
    fun testLot_whenCreated_shouldReturnLot() {
        val result = LotController.insert(LotValid)
        assertThat(result.id).isNotNull
    }

    @Test
    fun testLot_whenSearching_shouldReturnLot() {
//        val result = LotController.findById()
    }

}