package jobsheet5;

public class ticketserve {
        ticket[] tickets = new ticket[1];
    
        public void add(ticket t) {
            if (tickets[0] == null) {
                tickets[0] = t;
            } else {
                ticket[] temp = tickets;
                int newTicketsLen = tickets.length + 1;
                tickets = new ticket[newTicketsLen];
    
                for (int i = 0; i < temp.length; i++) {
                    tickets[i] = temp[i];
                }
    
                tickets[newTicketsLen-1] = t;
            }
        }
    
        public void displayAll() {
            for (int i = 0; i < tickets.length; i++) {
                System.out.println("------------------------------------------------");
                System.out.printf("%s Airlines\n",tickets[i].airlines);
                System.out.printf("From %s to %s\n",tickets[i].origin, tickets[i].destination);
                System.out.printf("Cost: Rp %,d\n",tickets[i].price);
            }
        }
    
        void bubbleSort(boolean asc) {
            for (int i = 0; i < tickets.length-1; i++) {
                for (int j = 0; j < tickets.length-i-1; j++) {
                    if (asc) {
                        if (tickets[j].price > tickets[j+1].price) {
                            ticket tmp = tickets[j];
                            tickets[j] = tickets[j+1];
                            tickets[j+1] = tmp;
                        }
                    } else {
                        if (tickets[j].price < tickets[j+1].price) {
                            ticket tmp = tickets[j];
                            tickets[j] = tickets[j+1];
                            tickets[j+1] = tmp;
                        }
                    }
                }
            }
        }
    
        void selectionSort(boolean asc) {
            for (int i = 0; i < tickets.length-1; i++) {
                int idxSelected = i;
                for (int j = i+1; j < tickets.length; j++) {
                    if (asc) {
                        if (tickets[j].price < tickets[idxSelected].price) {
                            idxSelected = j;
                        }
                    } else {
                        if (tickets[j].price > tickets[idxSelected].price) {
                            idxSelected = j;
                        }
                    }
                }
                ticket tmp = tickets[idxSelected];
                tickets[idxSelected] = tickets[i];
                tickets[i] = tmp;
            }
        }
    }
