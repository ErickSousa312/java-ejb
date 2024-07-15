package spring.domain.repository

import spring.domain.model.lot.Lot

interface LotRepository: RepositoryCRUD<Lot,Long> {
}