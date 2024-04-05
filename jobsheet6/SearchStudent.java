package jobsheet6;
public class SearchStudent {
    Students[] listStd = new Students[10];
    int idx = 0;

    void add(Students std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
    } else {
            System.out.println("List is full");
    }
    }
    void display() {
        for (Students std : listStd) {
            std.display();
    }
    }
    int findSeqSearch(int search) {
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].nim == search) {
                return i;
    }
    }
        return -1;
    }

    int findBinarySearch(int search) {
        int low = 0;
        int high = listStd.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (listStd[mid].nim == search) {
                return mid;
    } else if (listStd[mid].nim > search) {
                high = mid - 1;
    } else {
                low = mid + 1;
    }
    }
        return -1;
    }

    int orangBin(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            //HERE
            if (cari == listStd[mid].nim) {
                return mid;
            } else if (listStd[mid].nim < cari) {
                return orangBin(cari, left, mid - 1);
            } else {
                return orangBin(cari, mid + 1, right);
            }
        }

        return -1;
    }

    void showPosition(int x, int pos) {
        if (pos == -1) {
            System.out.println("Data: " + x + " is not found");
    } else {
            System.out.println("Data: "+x + " is found at position " + pos);
    }
    }

    void showData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t : "+ x);
            System.out.println("Name \t : "+ listStd[pos].name);
            System.out.println("Age \t : "+ listStd[pos].age);
            System.out.println("GPA \t : "+ listStd[pos].gpa);
        } else {
            System.out.println("Data: " + x + " is not found");
}
}
}
