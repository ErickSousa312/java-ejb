package spring.commons

import spring.domain.model.stock.Stock
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter

object StockContains {

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    val dataString = "2024-07-18"
    val fomatter2 = SimpleDateFormat("YYYY-MM-dd").parse(dataString)
    val data: String = formatter.format(LocalDate.now())


    val stockValid: Stock = Stock(null,2,1,LocalDate.now(),50)
}