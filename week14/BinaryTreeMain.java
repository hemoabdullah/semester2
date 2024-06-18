package week14;

import java.util.Scanner;

public class BinaryTreeMain {
    static void menu() {
        System.out.println("");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Find");
        System.out.println("4. Traverse In Order");
        System.out.println("5. Traverse Pre Order");
        System.out.println("6. Traverse Post Order");
        System.out.println("7. Display Smallest Value");
        System.out.println("8. Display Largest Value");
        System.out.println("9. Display Leaf Nodes");
        System.out.println("10. Count Leaves");
        System.out.println("11. Exit");
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        int choose;
        do {
            menu();
            System.out.print("Choose: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Enter data to add: ");
                    tree.insertRecursive(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter data to be deleted: ");
                    tree.delete(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter data to be found: ");
                    System.out.println(tree.find(sc.nextInt()));
                    break;
                case 4:
                    tree.traverseInOrder(tree.root);
                    break;
                case 5:
                    tree.traversePreOrder(tree.root);
                    break;
                case 6:
                    tree.traversePostOrder(tree.root);
                    break;
                case 7:
                    System.out.println("Smallest value: " + tree.findMin(tree.root).data);
                    break;
                case 8:
                    System.out.println("Largest value: " + tree.findMax(tree.root).data);
                    break;
                case 9:
                    System.out.print("Leaf nodes: ");
                    tree.displayLeafNodes();
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Number of leaves: " + tree.countLeaves());
                    break;
                case 11:
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } while (choose != 11);
    }
}
