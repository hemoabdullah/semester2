public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        
        list.addFirst(890);
        list.print();
        list.addLast(760);
        list.print();
        list.insertAt(1, 700);
        list.print();
        list.insertAfter(700, 999);
        list.print();
        list.insertAfter(999, 780);
        list.print();
        
        // for 2nd lab activity
        System.out.println("Data at index 2: " + list.getData(2));
        System.out.println("Index of 999: " + list.indexOf(999));
        
        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();
        list.remove(999);
        list.print();
        list.removeAt(1);
        list.print();
    }
}

