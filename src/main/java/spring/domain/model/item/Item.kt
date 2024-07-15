package spring.domain.model.item

import jakarta.persistence.*
import spring.domain.enums.GenreType
import spring.domain.enums.ItemType
import spring.domain.enums.RoupaSize
import spring.domain.enums.UnitOfMeasureType
import spring.web.dto.ItemDTO

@Suppress("USELESS_ELVIS_RIGHT_IS_NULL")
@Entity
@Table(name = "item")
data class Item (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = 0,
    var name: String? = null,
    @Enumerated(EnumType.STRING)
    @Column(name = "item_type")
    var type: ItemType? = null,
    var description: String? = null,
    @Enumerated(EnumType.STRING)
    @Column(name = "genre_type")
    var gender: GenreType? = null,
    @Enumerated(EnumType.STRING)
    @Column(name = "roupa_size")
    var size: RoupaSize? = null,
    @Enumerated(EnumType.STRING)
    @Column(name = "unit_of_measure_type")
    var unitOfMeasureType: UnitOfMeasureType? = null,
) {
    companion object {
        fun mapToItem(dto: ItemDTO): Item {
            println(dto)
            return Item().apply {
                id = dto.id
                name = dto.name
                description = dto.description
                size = dto.roupaSize?.let {
                    try {
                        RoupaSize.valueOf(it)
                    } catch (e: IllegalArgumentException) {
                        null
                    }
                }
                type = dto.itemType?.let {
                    try {
                        ItemType.valueOf(it)
                    } catch (e: IllegalArgumentException) {
                        null
                    }
                }
                gender = dto.genreType?.let {
                    try {
                        GenreType.valueOf(it)
                    } catch (e: IllegalArgumentException) {
                        null
                    }
                }
                unitOfMeasureType = dto.unitOfMeasure?.let {
                    try {
                        UnitOfMeasureType.valueOf(it)
                    }catch (e: IllegalArgumentException){
                        null
                    }
                }
            }
        }
    }
}