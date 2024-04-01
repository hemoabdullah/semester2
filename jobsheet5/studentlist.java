package jobsheet5;
public class studentlist {
    Student list[] = new Student[5];
    int idx = 0;

    void add(Student std) {
        if (idx < list.length) {
            list[idx] = std;
            idx++;
        } else {
            System.out.println("List is full");
        }
    }

    void display() {
        for (Student std : list) {
            std.print();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length; j++) {
                if (list[j].gpa < list[j-1].gpa) {
                    // SWAP
                    Student tmp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = tmp;
                    
                    
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < list.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].gpa < list[idxMin].gpa) {
                    idxMin = j;
                }
            }
            // SWAP
            Student tmp = list[idxMin];
            list[idxMin] = list[i];
            list[i] = tmp;
        }
    }

    void insertionSort(boolean asc) {
        for (int i = 1; i < list.length; i++) {
            Student tmp = list[i];
            int j = i;
            if (asc) {
                while (j > 0 && list[j - 1].gpa > tmp.gpa) {
                    list[j] = list[j - 1];
                    j--;
                }
            } else {
                while (j > 0 && list[j - 1].gpa < tmp.gpa) {
                    list[j] = list[j - 1];
                    j--;
                }
            }
            list[j] = tmp;
        }
    }
}