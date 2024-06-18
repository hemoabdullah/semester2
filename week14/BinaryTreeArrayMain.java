package week14;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray tree = new BinaryTreeArray();
        int[] data = {5, 3, 7, 2, 4, 6, 8, 0, 0, 0, 0, 0, 0, 0, 0};
        int idxLast = 6;
        tree.populateData(data, idxLast);
        System.out.print("In order Traversal: ");
        tree.traverseInOrder(0);
        System.out.println();

        System.out.print("Pre order Traversal: ");
        tree.traversePreOrder(0);
        System.out.println();

        System.out.print("Post order Traversal: ");
        tree.traversePostOrder(0);
        System.out.println();

        tree.add(9);
        tree.add(10);

        System.out.print("In order after elements: ");
        tree.traverseInOrder(0);
        System.out.println();

        System.out.print("Pre order after elements: ");
        tree.traversePreOrder(0);
        System.out.println();

        System.out.print("Post order after elements: ");
        tree.traversePostOrder(0);
        System.out.println();
    }
}
