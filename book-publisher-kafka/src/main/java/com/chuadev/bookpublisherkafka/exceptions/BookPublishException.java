package com.chuadev.bookpublisherkafka.exceptions;


import com.chuadev.bookpublisherkafka.model.Book;
import lombok.Getter;

public class BookPublishException extends RuntimeException{

    @Getter
    private Book book;

    public BookPublishException(final Book book) {
        this.book = book;
    }

    public BookPublishException(String message, final Book book){
        super(message);
        this.book = book;
    }

    public BookPublishException(Throwable cause, final Book book){
        super(cause);
        this.book = book;
    }

}
