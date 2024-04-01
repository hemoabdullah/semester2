package jobsheet5;

public class plserve {

        pl [] premier = new pl[1];
    
        public void add(pl p) {
            if (premier[0] == null) {
                premier[0] = p;
            } else {
                pl[] temp = premier;
                int newPremierLen = premier.length + 1;
                premier = new pl[newPremierLen];

                for (int i = 0; i < temp.length; i++) {
                    premier[i] = temp[i];
                }

                premier[newPremierLen - 1] = p;
            }
        }
    
        public void displayAll() {
            for (int i = 0; i < premier.length; i++) {
                System.out.println("------------------------------------------------");
                System.out.println(premier[i].team + " Club");
                System.out.println("player: " + premier[i].player);
                System.out.println("Goal " +premier[i].goal);
                System.out.println("Points " +premier[i].points);
            }
        }
        void bubbleSort(boolean asc) {
            for (int i = 0; i < premier.length - 1; i++) {
                for (int j = 0; j < premier.length - i - 1; j++) {
                    if (asc) {
                        if (premier[j].points > premier[j + 1].points) {
                            pl tmp = premier[j];
                            premier[j] = premier[j + 1];
                            premier[j + 1] = tmp;
                        }
                    } else {
                        if (premier[j].points < premier[j + 1].points) {
                            pl tmp = premier[j];
                            premier[j] = premier[j + 1];
                            premier[j + 1] = tmp;
                        }
                    }
                }
            }
        }
        
        void insertionSort(boolean asc) {
            for (int i = 1; i < premier.length; i++) {
                pl key = premier[i];
                int j = i - 1;
        
                while (j >= 0 && premier[j].points > key.points) {
                    premier[j + 1] = premier[j];
                    j = j - 1;
                }
                premier[j + 1] = key;
            }
        }
    }
    

