package spring.commons

import spring.domain.model.orderCenter.OrderCenter
import java.text.SimpleDateFormat

object OrderCenterContains {

    private val dataFormatter = SimpleDateFormat("yyyy-MM-dd")
    private val dateString = "2024-07-09"
    private val date = dataFormatter.parse(dateString)

    val orderCenterValid: OrderCenter = OrderCenter(null,1,2,1,"sending","",10, date)
}