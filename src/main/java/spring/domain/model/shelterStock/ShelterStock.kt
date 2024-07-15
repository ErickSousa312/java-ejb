package spring.domain.model.shelterStock

import jakarta.persistence.*
import spring.domain.model.item.Item
import spring.domain.model.shelter.Shelter
import java.time.LocalDate

@Entity
@Table(name = "shelter_stock")
data class ShelterStock (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "shelter_id", unique = false)
    var shelterId: Shelter? = null,

    @ManyToOne
    @JoinColumn(name = "item_id", unique = false)
    var itemId: Item? = null,

    @Column(name = "expiration_date")
    var expirationDate : LocalDate? = null,
    var quantity : Int? = null,
)
