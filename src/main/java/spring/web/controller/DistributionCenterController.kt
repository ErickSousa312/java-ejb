package spring.web.controller

import spring.domain.model.distributionCenter.DistributionCenter
import spring.domain.services.DistributionCenterService

class DistributionCenterController {
    companion object {
        private val distributionCenterService: DistributionCenterService = DistributionCenterService()

        fun insert (distributionCenter: DistributionCenter): DistributionCenter {
            return distributionCenterService.save(distributionCenter)
        }
    }
}