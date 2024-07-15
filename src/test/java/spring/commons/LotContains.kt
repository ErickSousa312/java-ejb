package spring.commons

import spring.domain.model.donatedItems.DonatedItem
import spring.domain.model.lot.Lot
import java.text.SimpleDateFormat
import java.util.*

object LotContains {

    private val formatterDate =  SimpleDateFormat("yyyy-MM-dd")
    private val dataString = "2024-07-08"
    private val date: Date = formatterDate.parse(dataString)

    private var donatedItemId: MutableList<DonatedItem>? = mutableListOf()
    val LotValid = Lot(null,donatedItemId,2,date)
}