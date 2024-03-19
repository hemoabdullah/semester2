package jobsheet3;

import java.util.Scanner;

public class MainGeom {
    public static void main(String[] args) {
        Sphere[] sp = new Sphere[3];
        SquarePryamid sqp[] = new SquarePryamid[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.print("radius sphere(int) = ");
            int rSphere = sc.nextInt();
            sp[i] = new Sphere(rSphere);

            System.out.print("Side square pyramid(int) = ");
            int ssPyramid = sc.nextInt();
            System.out.print("Height square pyramid(int) = ");
            int hPyramid = sc.nextInt();
            sqp[i] = new SquarePryamid(ssPyramid,hPyramid);
        }
        for(int i=0;i<3;i++){
            System.out.println("Vol kerucut ke-"+i+"="+sqp[i].calcVol());
            System.out.println("Luas kerucut ke-"+i+"="+sqp[i].calcSurface());
            System.out.println("Vol limas ke-"+i+"="+sp[i].calcVol());
            System.out.println("Luas limas ke-"+i+"="+sp[i].calcSurface());
        }
    }
}