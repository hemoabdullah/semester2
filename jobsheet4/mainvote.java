package jobsheet4;
    import java.util.Scanner;
    public class mainvote {    
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input the number of candidates: ");
            int candidateAmount = scan.nextInt();
            scan.nextLine(); 
    
            String[] candidates = new String[candidateAmount];
    
            for (int i = 0; i < candidateAmount; i++) {
                System.out.printf("Enter name of the #%d candidate: ", i + 1);
                candidates[i] = scan.next();
            }
    
            System.out.println("List of candidate voting number: ");
    
            for (int i = 0; i < candidateAmount; i++) {
                System.out.printf("%d. %s\n", i + 1, candidates[i]);
            }
    
            int[][] votes = new int[candidateAmount][candidateAmount];
    
            for (int i = 0; i < candidateAmount; i++) {
                System.out.printf("Enter votes for candidate %s (separated by space): ", candidates[i]);
                for (int j = 0; j < candidateAmount; j++) {
                    votes[i][j] = scan.nextInt();
                }
            }
    
            vote voting = new vote(candidates);
    
            voting.display();
    
        }
    }