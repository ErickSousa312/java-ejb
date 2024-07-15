package spring.commons

import spring.domain.model.donatedItems.DonatedItem
import spring.domain.model.lot.Lot
import java.text.SimpleDateFormat

object DonateItemsConstains {

    private val dateFormat = SimpleDateFormat("yyyy-MM-dd")
    private val dateString = "2023-12-25"

    private val date1 = dateFormat.parse(dateString)

    val ItemsValid: DonatedItem = DonatedItem(
        null,
        Lot(),
        null,
        "anyone description",
        50,
        date1,
        )
    val ItemsValid2: DonatedItem = DonatedItem(
        null,
        Lot(),
        null,
        "anyone description",
        50,
        date1,
        )
    val ItemsInvalid: DonatedItem = DonatedItem()
}