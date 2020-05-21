package day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItterableInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(23);
        list.add(0);
        list.add(-100);
        list.add(45);
        list.add(90);

//        for (int number : list) {
//            System.out.print(number + " ");
//        }

        Iterator<Integer> iterator = list.iterator();

//        while (iterator.hasNext()) {
//            int number = iterator.next();
//            System.out.print(number + " ");
//        }

        BookShop shop = new BookShop();
        shop.add(new Book("harry potter", "j k rowlling"));
        shop.add(new Book("percy jackson", "rick riodrian"));
        shop.add(new Book("clean code", "uncle bob"));

//        for (Book book : shop) {
//            System.out.println(book + " ");
//        }

        Iterator<Integer> iter = shop.iterator();
        Iterator<Integer> other = shop.iterator();
        iter.next();
        iter.next();
        iter.next();
        iter.next();
        iter.next();

        other.next();
        other.next();

        System.out.println(iter.next());
        System.out.println(other.next());

//        for (int number : shop) {
//            System.out.print(number + " ");
//        }

        for (String s : new CustomIterable()) {
            System.out.println(s);
        }

        for (String s : new CustomIterable()) {
            System.out.println(s);
        }
    }
}
