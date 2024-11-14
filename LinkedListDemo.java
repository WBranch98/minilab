import java.util.Iterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();

        // Populate the list with 50,000 elements instead of 5 million for faster testing
        for (int i = 0; i < 50000; i++) {
            list.add(i);
        }

        ////////////////////////////// using get() method
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Traverse time using get(index) method: " + (endTime - startTime) + " ms");

        ///////////////////////////// using iterator shortcut
        int x;
        startTime = System.currentTimeMillis();
        for (int i : list) {
            x = i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Traverse time using iterator shortcut: " + (endTime - startTime) + " ms");

        ///////////////////////////// using iterator original way
        int y;
        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            y = iterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Traverse time using iterator original way: " + (endTime - startTime) + " ms");
    }
}
