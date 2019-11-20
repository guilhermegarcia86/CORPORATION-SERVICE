package repository

import entity.Corporation

interface CorporationRepository {

    fun save(bean: Corporation): String
    fun update(bean: Corporation): Boolean
    fun remove(corporationId: String): Boolean
    fun fetchBy(corporationId: String): Corporation?
    fun fetchByDocument(document: String): Corporation?

}