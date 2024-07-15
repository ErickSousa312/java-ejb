package spring.domain.model.shelter

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull

@Entity
data class Shelter(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @NotNull
    var name: String? = null,

    var addr: String? = null,

    var responsible: String? = null,

    var phone: String? = null,

    @Column(name = "contact_email")
    var contactEmail: String? = null,

    var capacity: Int? = null,
    @Column(name = "people_occupation")
    var peopleOccupation: Int? = null,
)