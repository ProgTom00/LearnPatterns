package com.patterns.adapter.bookclassifier;

import com.patterns.adapter.bookclasifier.MedianAdapter;
import com.patterns.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        // Given
        Book book = new Book("author1", "title1", 2000, "0001");
        Book book2 = new Book("author2", "title2", 2001, "0002");
        Book book3 = new Book("author3", "title3", 2002, "0003");
        Book book4 = new Book("author4", "title4", 2003, "0004");
        Book book5 = new Book("author5", "title5", 2004, "0005");
        Book book6 = new Book("author6", "title6", 2005, "0006");
        Book book7 = new Book("author7", "title7", 2006, "0007");
        Book book8 = new Book("author8", "title8", 2007, "0008");
        Book book9 = new Book("author9", "title9", 2008, "0009");
        Book book10 = new Book("author10", "title10", 2009, "0010");
        Book book11 = new Book("author11", "title11", 2010, "0011");
        Set<Book> bookSet = Stream.of(book, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11).collect(Collectors.toSet());
        MedianAdapter medianAdapter = new MedianAdapter();
        // When
        int median = medianAdapter.publicationYearMedian(bookSet);
        // Then
        Assertions.assertEquals(2005, median);

    }
}
