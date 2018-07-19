package day06;

public class Main {
    public static void main(String[] args) {

        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();

        ll1.prepend(1);
        ll1.append(3);
        ll1.append(2);

        ll2.prepend(5);
        ll2.append(9);
        ll2.append(4);

        ll1.printList();
        System.out.println("");
        ll2.printList();

    }
}
