package day9;

import java.util.ArrayList;
import java.util.List;

public class FoodRunner {
    public static void main(String[] args) {

//        pizza.make();
//
//        Food sandwhich = new Sandwhich();
//        sandwhich.make();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(0);
        numbers.add(4);
        numbers.add(2);

        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        Pizza pizza = new Pizza(3);
        Pizza other = new Pizza(3);
        System.out.println(other.compareTo(pizza));
        System.out.println(pizza.compareTo(other));

        List<Book> books = new ArrayList<>();
        books.add(new Book("abc", "kkk"));
        books.add(new Book("abc", "g"));
        books.add(new Book("abc", "i"));
        books.add(new Book("zzzzz", "aaaa"));
        books.add(new Book("abc", "bb"));

//        System.out.println("hello".compareTo());

        books.sort(Book::compareTo);
        System.out.println(books);
    }
}
