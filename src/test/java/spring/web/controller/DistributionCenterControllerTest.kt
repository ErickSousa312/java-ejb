package spring.web.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import spring.commons.DistributionCenterConstains.centerValid

class DistributionCenterControllerTest {
    @Test
    fun testCreateCenter_whenCreated_thenReturnItem() {
        val center = DistributionCenterController.insert(centerValid)
        assertThat(center.id).isNotNull()
    }
}