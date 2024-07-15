package spring.web.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import spring.commons.MissingItemShelterContains.missingItemShelterValid

class MissingItemShelterTest {
    @Test
    fun testMissingItemShelter_whenCreated_shouldReturnMissingItemShelter() {
        val result = MissingItemShelterController.insert(missingItemShelterValid)
        assertThat(result.id).isNotNull
    }
}