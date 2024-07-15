package spring.domain.model.missingItemShelter

import jakarta.persistence.*
import spring.domain.model.item.Item
import spring.domain.model.shelter.Shelter

@Entity
@Table(name = "missing_item_shelter")
data class MissingItemShelter (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "item_id", unique = false)
    var itemId: Item? = null,

    @ManyToOne
    @JoinColumn(name = "item_shelter_id", unique = false)
    var shelterId: Shelter? = null,

    var quantity: Long? = null,
    var description: String? = null,
)