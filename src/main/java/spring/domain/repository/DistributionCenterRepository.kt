package spring.domain.repository

import spring.domain.model.distributionCenter.DistributionCenter

interface DistributionCenterRepository {
    fun findById(id: Long?): DistributionCenter?
    fun findAll(): List<DistributionCenter?>?
    fun save(distributionCenter: DistributionCenter): DistributionCenter
    fun update(user: DistributionCenter?)
    fun delete(id: Long?)
}