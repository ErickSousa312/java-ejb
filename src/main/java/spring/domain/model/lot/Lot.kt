package spring.domain.model.lot

import jakarta.persistence.*
import spring.domain.model.distributionCenter.DistributionCenter
import spring.domain.model.donatedItems.DonatedItem
import java.util.*

@Entity
@Table(name = "lot")
data class Lot(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    @OneToMany(mappedBy = "lotId" ,cascade=[(CascadeType.ALL)])
    @Column(name = "donate_item_id")
    var donatedItemId: MutableList<DonatedItem>? = mutableListOf(),
    @ManyToOne
    @JoinColumn(name = "distribution_center", unique = false)
    var distributionCenter: DistributionCenter? = null,
    @Column(name = "send_date")
    var sendDate: Date? = Date(),
)