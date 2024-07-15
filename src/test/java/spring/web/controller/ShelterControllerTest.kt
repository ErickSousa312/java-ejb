package spring.web.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import spring.commons.ShelterContains.shelterValid

class ShelterControllerTest {
    @Test
    fun testShelterController_whenCreated_shouldReturnShelter() {
        val result = ShelterController.insert(shelterValid)
        assertThat(result.id).isNotNull
    }
}