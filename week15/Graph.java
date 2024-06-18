package week15;

import java.util.LinkedList;
import java.util.Scanner;

public class Graph<T> {
    int vertex;
    LinkedList<T> list[];
    boolean isDirected;

    Graph(int vertex, boolean isDirected) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        this.isDirected = isDirected;
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<>();
        }
    }

    boolean graphType() {
        return isDirected;
    }

    void addEdge(T source, T destination) {
        int sourceIndex = (Integer) source; 
        int destinationIndex = (Integer) destination; 
        if (!isDirected) {
            list[destinationIndex].addFirst(source);
        }
    }

    void degree(T source) throws Exception {
        int sourceIndex = (Integer) source; 
        if (isDirected) {
            int totalIn = 0, totalOut = list[sourceIndex].size();
            for (int i = 0; i < vertex; i++) {
                if (i != sourceIndex) {
                    for (int j = 0; j < list[i].size(); j++) {
                        if (list[i].get(j).equals(source)) {
                            totalIn++;
                        }
                    }
                }
            }
            System.out.println("InDegree vertex " + source + " : " + totalIn);
            System.out.println("OutDegree vertex " + source + " : " + totalOut);
            System.out.println("Degree vertex " + source + " : " + (totalIn + totalOut));
        } else {
            System.out.println("Degree vertex " + source + " : " + list[sourceIndex].size());
        }
    }

    void removeEdge(T source, T destination) throws Exception {
        int sourceIndex = (Integer) source; 
        int destinationIndex = (Integer) destination; 
        if (!isDirected) {
            list[destinationIndex].remove(source);
        }
    }

    void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph cleared");
    }

    void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " connected with: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("1. Add edge");
        System.out.println("2. Degree");
        System.out.println("3. Remove edge");
        System.out.println("4. Remove all edges");
        System.out.println("5. Print graph");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Enter the number of vertices:");
        int v = sc.nextInt();
        System.out.println("Enter 1 for directed graph and 0 for undirected graph:");
        boolean isDirected = sc.nextInt() == 1;
        Graph<Integer> graph = new Graph<>(v, isDirected);

        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Enter the source and destination:");
                    Integer source = sc.nextInt();
                    Integer destination = sc.nextInt();
                    graph.addEdge(source, destination);
                    break;
                case 2:
                    System.out.println("Enter the source:");
                    source = sc.nextInt();
                    graph.degree(source);
                    break;
                case 3:
                    System.out.println("Enter the source and destination:");
                    source = sc.nextInt();
                    destination = sc.nextInt();
                    graph.removeEdge(source, destination);
                    break;
                case 4:
                    graph.removeAllEdges();
                    break;
                case 5:
                    graph.printGraph();
                    break;
            }
        } while (choose != 6);
    }
}
