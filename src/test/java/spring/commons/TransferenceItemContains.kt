package spring.commons

import spring.domain.model.transferenceItem.TransferenceItem
import java.text.SimpleDateFormat
import java.util.*

object TransferenceItemContains {
    private val fomatterData = SimpleDateFormat("yyyy-MM-dd")
    private val dataString = "2024-07-09"
    private val date: Date = fomatterData.parse(dataString)
    val transferenceItemValid: TransferenceItem = TransferenceItem(null,null,1,1,1,50,date)
}