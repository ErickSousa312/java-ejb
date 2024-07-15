package spring.domain.model.transferenceItem

import jakarta.persistence.*
import spring.domain.model.item.Item
import java.util.*

@Entity
@Table(name = "transference_item")
data class TransferenceItem(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(name = "transference_type")
    var transferenceType: Int? = null,
    @Column(name = "origin_id")
    var originId: Int? = null,
    @Column(name = "destination_id")
    var destinationId: Int? = null,
    @ManyToOne
    @JoinColumn(name = "item_id", unique = false)
    var item: Item? = null,

    var quantity: Int? = null,
    @Column(name = "transference_data")
    var transferenceData: Date? = null
)