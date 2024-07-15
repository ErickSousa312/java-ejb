package spring.domain.model.stock

import jakarta.persistence.*
import spring.domain.model.distributionCenter.DistributionCenter
import spring.domain.model.item.Item
import java.time.LocalDate
import java.util.*

@Entity
data class Stock (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null,

    @ManyToOne
    @JoinColumn(name = "distribution_center_id", unique = false, nullable = true)
    var distributionCenterId : DistributionCenter? = null,

    @ManyToOne
    @JoinColumn(name = "stock_id", unique = false, nullable = true)
    var itemId : Item? = null,

    @Column(name = "expiration_date")
    var expirationDate : LocalDate? = null,

    var quantity : Int? = null,
)