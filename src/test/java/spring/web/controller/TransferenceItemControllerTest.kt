package spring.web.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import spring.commons.TransferenceItemContains.transferenceItemValid

class TransferenceItemControllerTest {
    @Test
    fun testTransferenceItem_whenCreated_shouldReturnTransferenceItem(){
        val result = TransferenceItemController.insert(transferenceItemValid)
        assertThat(result.id).isNotNull
    }
}