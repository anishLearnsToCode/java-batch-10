package day7;

public class BoxFactory {
    public static void main(String[] args) {
        Box box = Box.createCube(10);
        Box b = Box.createCuboid(10, 20, 30);


        String base = "abc";
        String string = new String(base);
        System.out.println(string);

        char[] array = { 'a', 'n', 'i', 's', 'h'};
        string = new String(array);
        System.out.println(string);

        string = new String(array, 1, 2);
        System.out.println(string);
    }
}
