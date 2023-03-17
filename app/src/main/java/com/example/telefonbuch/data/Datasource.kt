package com.example.telefonbuch.data

import com.example.telefonbuch.data.model.Contact

class Datasource {
    var contactList = mutableListOf<Contact>(
        Contact("Fetullah Andug", "017661818706"),
        Contact("Andrea Willenschmidt", "015764635245"),
        Contact("Karlos Antonius", "02217563824"),
        Contact("Pablo Escobat", "01717463434"),
        Contact("Jonny Depp", "015754637294"),
        Contact("Julius Caesar", "+492217563827"),
        Contact("Dora Frankenstein", "+9055346284721"),
        Contact("Friedrich Merle", "+017468u2u46842"),
    )

    fun getContactList() : MutableList<Contact>{
        return contactList
    }
}