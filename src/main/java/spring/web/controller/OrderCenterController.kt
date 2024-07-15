package spring.web.controller

import spring.domain.model.orderCenter.OrderCenter
import spring.domain.services.OrderCenterService

class OrderCenterController {
    companion object{
        private val OrderCenterService: OrderCenterService = OrderCenterService()

        fun insert (orderCenter: OrderCenter): OrderCenter{
            return OrderCenterService.save(orderCenter)
        }
    }
}