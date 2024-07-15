package spring.web.controller

import spring.domain.model.shelter.Shelter
import spring.domain.services.ShelterService

class ShelterController {
    companion object{
        private val shelterService: ShelterService = ShelterService()

        fun insert (shelter: Shelter): Shelter{
            return shelterService.save(shelter)
        }

        fun findAllShelters():List<Shelter?>?{
            return shelterService.findAll()
        }
    }
}