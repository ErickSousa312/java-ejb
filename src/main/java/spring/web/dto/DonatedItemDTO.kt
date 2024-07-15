package spring.web.dto

import spring.domain.model.donatedItems.DonatedItem
import spring.domain.model.lot.Lot
import java.util.*

class DonatedItemDTO(
    var id: Long? = null,
    private var lotId: Lot? = null,
    private var itemId: Long? = null,
    private var description: String? = null,
    private var expirationDate: Date? = null
) {
    constructor(entity: DonatedItem):this(
        id = entity.id,
        lotId = entity.lotId,
        itemId= entity.item?.id,
        description = entity.description,
        expirationDate = entity.expirationDate
    )

    override fun toString(): String {
        return "DonatedItemDTO(id=$id, lotId=$lotId, itemId=$itemId, description=$description, expirationDate=$expirationDate)"
    }
}