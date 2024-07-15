package spring.web.controller

import spring.domain.model.stock.Stock
import spring.domain.services.StockService

class StockController {
    companion object {
        private val stockService: StockService = StockService()

        fun insert (stock : Stock): Stock {
            return stockService.save(stock)
        }
    }
}