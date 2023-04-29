public class Main {
    public static void main(String[] args) {
        MyHash myHash = new MyHash(7);
        System.out.println(myHash.insert(49));
        System.out.println(myHash.insert(50));
        System.out.println(myHash.insert(51));
        System.out.println(myHash.insert(63));
        System.out.println(myHash.insert(68));
        System.out.println(myHash.insert(71));
        System.out.println(myHash.insert(72));
        System.out.println(myHash.insert(64));
        System.out.println(myHash.search(51));
        System.out.println(myHash.delete(51));
        System.out.println(myHash.search(51));

    }
}
