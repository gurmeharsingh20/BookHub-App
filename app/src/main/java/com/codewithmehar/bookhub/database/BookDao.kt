package com.codewithmehar.bookhub.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BookDao {

    @Insert
    fun insertBook(bookEntity: BookEntities)

    @Delete
    fun deleteBook(bookEntity: BookEntities)

    @Query("SELECT * FROM books")
    fun getAllBooks(): List<BookEntities>

    @Query("SELECT * FROM books WHERE book_id = :bookId")
    fun getBookById(bookId: String): BookEntities

}