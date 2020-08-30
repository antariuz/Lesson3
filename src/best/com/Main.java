package best.com;


public class Main {

    public static void main(String[] args) {

        MyArrayList<String> strings = new MyArrayList<String>(3);
        System.out.println(strings.getSize());
        for (int i = 0; i < strings.getSize(); i++) {
            System.out.println(strings.get(i));
        }
        strings.add("NIGGA");
        System.out.println(strings.getSize());
        for (int i = 0; i < strings.getSize(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
