package com.oga_emma.journalapp.interfaces

import com.oga_emma.journalapp.model.Entry

interface JournalEntriesMVP {

    interface View {
        fun showEntries(entries: List<Entry>)
        fun showNoEntryError()
        fun showLoadEntryFailedError()
        fun editEntry(entry: Entry)
        fun addNewEntry()
    }

    interface Presenter{
        fun loadEntry()
        fun removeEntry()
        fun editEntry()
        fun saveEntry(entry: Entry)
    }

    interface Repository{
        fun fetchEntries()
        fun addNewEntry()
        fun updateEntry()
        fun removeEntry()
    }
}