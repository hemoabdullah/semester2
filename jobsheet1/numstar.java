package jobsheet1;
import java.util.Scanner;
public class numstar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your NIM = ");
        //int nim = scan.nextInt();
        //input complete nim
        String oriNim = scan.nextLine();
        String lastDigit = oriNim.substring(oriNim.length()-2, oriNim.length());
        int nim = Integer.valueOf(lastDigit);
        if(nim < 10){
            nim +=10;
        }
        for(int i = 1;i<=nim;i++){
            if (i == 6 || i == 10) {
                continue;
            }
            else if (i % 2 == 0){
            System.out.print(i);
            }
            else {
            System.out.print("*");
            }
        }
    }
}

