package spring.domain.model.orderCenter

import jakarta.persistence.*
import spring.domain.model.distributionCenter.DistributionCenter
import spring.domain.model.item.Item
import spring.domain.model.shelter.Shelter
import java.util.*

@Entity
@Table(name = "order_center")
data class OrderCenter (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @ManyToOne
    @JoinColumn(name = "center_id", nullable = true)
    var centerId: DistributionCenter? = null,

    @ManyToOne
    @JoinColumn(name = "item_id", unique = false)
    var itemId: Item? = null,

    @ManyToOne
    @JoinColumn(name = "shelter_id", nullable = true)
    var shelterId: Shelter? = null,

    var status: String? = null,
    @Column(name = "reason_refusal")
    var reasonRefusal: String? = null,

    @Column(name = "description")
    var quantityRequested: Int? = null,
    var date: Date? = null,
)