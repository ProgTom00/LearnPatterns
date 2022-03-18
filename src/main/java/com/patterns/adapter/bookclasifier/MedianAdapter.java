package com.patterns.adapter.bookclasifier;

import com.patterns.adapter.bookclasifier.librarya.Book;
import com.patterns.adapter.bookclasifier.librarya.Classifier;
import com.patterns.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.patterns.adapter.bookclasifier.libraryb.Book> booksMap =  new HashMap<>();
       for(Book book : bookSet) {
           booksMap.put(new BookSignature(book.getSignature()), new com.patterns.adapter.bookclasifier.libraryb.
                   Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));

        }
       return medianPublicationYear(booksMap);
    }
}
