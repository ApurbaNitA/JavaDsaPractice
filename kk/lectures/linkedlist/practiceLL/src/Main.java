public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(12);
        list.insertLast(45);
        list.insert(34,3);
        list.deleteFirst();
        list.display();

    }
}
