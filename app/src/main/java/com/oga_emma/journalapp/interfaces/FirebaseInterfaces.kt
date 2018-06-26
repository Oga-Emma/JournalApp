package com.oga_emma.journalapp.interfaces

import com.oga_emma.journalapp.model.Entry

interface FirebaseInterfaces {


    interface fetchEntry{
        fun onFetchEntrySuccess(listOfEntries: Entry)
        fun onFetchEntryFailed()
    }


    interface addNewEntry{
        fun onAddEntrySuccess()
        fun onAddEntryFailed()
    }


    interface editEntry{
        fun onEditEntrySuccess()
        fun onEditEntryFailed()
    }


    interface deleteEntry{
        fun onDeleteEntrySuccess()
        fun onDeleteEntryFailed()
    }


}