package service

import entity.Corporation
import javax.management.loading.ClassLoaderRepository

class CorporationService(val repository: ClassLoaderRepository){

    fun createCorporation(value: Corporation){

    }

    fun searchCorporationById(value: String){}

    fun searchCorporationByDocument(value: String){}

    fun updateCorporation(value: Corporation){}


}
