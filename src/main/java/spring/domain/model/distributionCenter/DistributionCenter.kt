package spring.domain.model.distributionCenter

import jakarta.persistence.*

@Entity
@Table(name = "distribution_center")
data class DistributionCenter(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,
    var name: String? = null,
    var adress: String? = null,
    var capacity: Int? = null,
    @Column(name = "current_inventory")
    var currentInventory: Int? = null,
    @Column(name = "max_capacity")
    var maxCapacity: Int? = null,
)