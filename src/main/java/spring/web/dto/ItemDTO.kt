package spring.web.dto

import spring.domain.model.item.Item


data class ItemDTO(
    var id: Long? = null,
    var name: String? = null,
    var description: String? = null,
    var genreType: String? = null,
    var roupaSize: String? = null,
    var itemType: String? = null,
    var unitOfMeasure: String? = null,
) {

//    var name: String? = _name
//        get(){
//            return field
//        }
//        set(value) {
//            field = value
//        }

    constructor(entity: Item) : this(
        id = entity.id,
        name = entity.name,
        description = entity.description,
        genreType = entity.gender.toString(),
        roupaSize = entity.size.toString(),
        itemType = entity.type.toString(),
        unitOfMeasure = entity.unitOfMeasureType.toString()
    )

    override fun toString(): String {
        return "id=$id || name=$name || description=$description || genreType=$genreType || roupaSize=$roupaSize || itemType=$itemType || unitOfMeasure=$unitOfMeasure ||"
    }


}