package MyMap;

public class Main {
    public static void main(String[] args) {
        //i'm tired doing scans so i'll do hard code
        MyMap<Integer, Integer> m = new MyMap<Integer, Integer>();
        m.put(2,22);
        m.put(3,17);
        m.put(1,4);
        System.out.println(m.get(1));
        System.out.println(m.get(2));
        System.out.println("Original 3rd index: " + m.get(3));
        //check if replace works
        m.put(3,72);
        System.out.println("Replaced 3rd index: " + m.get(3));
        System.out.println("Removed value: " + m.remove(3));
        System.out.println("Index value: " + m.get(3)); //supposed to be null but why
    }
}
