package day06;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        if (ll.isEmpty()) {
            System.out.println("Your list is empty");
        }

        System.out.println("Size of list: " + ll.size());
        ll.printList();
    }
}
