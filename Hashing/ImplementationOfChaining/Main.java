public class Main {
    public static void main(String[] args) {
        MyHash myHash = new MyHash(7);
        myHash.insert(1);
        myHash.insert(5);
        myHash.insert(7);
        myHash.insert(12);
        myHash.insert(14);
        myHash.insert(20);
        myHash.insert(23);
        myHash.insert(25);

        System.out.println(myHash.search(25));
        myHash.remove(25);
        System.out.println(myHash.search(25));
    }
}
