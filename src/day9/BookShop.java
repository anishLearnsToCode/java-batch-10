package day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShop implements Iterable<Integer> {
    private List<Book> books = new ArrayList<>();

    @Override
    public Iterator<Integer> iterator() {
        return new BookIterator();
    }

    private class BookIterator implements Iterator<Integer> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < 10;
        }

        @Override
        public Integer next() {
            return index++;
        }
    }

    public void add(Book book) {
        books.add(book);
    }
}

class Book implements Comparable<Book> {
    String author;
    String name;

    Book(String name) {
        this.name = name;
    }

    Book(String name, String author) {
        this(name);
        this.author = author;
    }

    @Override
    public String toString() {
        return name + "@" + author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj.getClass() == this.getClass()) {
            Book other = (Book) obj;
            return this.name.equals(other.name) &&
                    this.author.equals(other.author);
        }

        return false;
    }

    @Override
    public int compareTo(Book other) {
        return this.author.compareTo(other.author);
    }
}

class CustomIterable implements Iterable<String> {

    private final List<String> messages = new ArrayList<>();

    CustomIterable() {
        messages.add("hello");
        messages.add("world");
        messages.add("java!");
    }

    @Override
    public Iterator<String> iterator() {
        return messages.iterator();
    }
}

class StringIterator implements Iterator<String> {
    private final List<String> messages = new ArrayList<>();
    private int index = 0;

    StringIterator() {
        messages.add("hello");
        messages.add("world");
        messages.add("java!");
    }

    @Override
    public boolean hasNext() {
        return index < messages.size();
    }

    @Override
    public String next() {
        String message = messages.get(index);
        index++;
        return message;
    }
}
