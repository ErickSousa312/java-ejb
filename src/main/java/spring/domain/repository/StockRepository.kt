package spring.domain.repository

import spring.domain.model.stock.Stock

interface StockRepository: RepositoryCRUD<Stock, Long> {
}