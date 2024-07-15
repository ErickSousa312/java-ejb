package spring.domain.model.donatedItems

import jakarta.persistence.*
import spring.domain.model.item.Item
import spring.domain.model.lot.Lot
import java.util.*

@Entity
@Table(name = "donated_items")
data class DonatedItem(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = 0,
    @ManyToOne(cascade=[(CascadeType.ALL)])
    @JoinColumn(name = "lot_id", unique = false, nullable = true)
    var lotId: Lot? = null,

    @ManyToOne
    @JoinColumn(name = "item_id", unique = false)
    var item: Item? = null,
    var description: String? = null,
    var quantity: Long? = null,
    @Column(name = "expiration_date")
    var expirationDate: Date? = null,
)