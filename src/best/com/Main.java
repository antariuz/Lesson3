package best.com;


public class Main {

    public static void main(String[] args) {


        long m = System.currentTimeMillis();


        MyArrayList<Integer> array = new MyArrayList<Integer>(5);
        MyArrayList.debugCheck(array);
        array.add(777);
        System.out.println();

        System.out.print("\n" + "Performance time: ");
        System.out.println(System.currentTimeMillis() - m);
    }


}
