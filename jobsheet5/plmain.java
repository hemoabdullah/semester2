package jobsheet5;
public class plmain {
    public static void main(String[] args) {
        plserve pr = new plserve() ;
        pr.add(new pl("Liverpool", 29, 45, 82));
        pr.add(new pl("Manchester city", 27, 39, 57));
        pr.add(new pl("leicestern", 28, 26, 50));
        pr.add(new pl("Chelsea", 29, 9, 48));
        pr.add(new pl("Wolvehampton", 29, 7, 43));
        pr.add(new pl("shelfield", 29, 5, 43));
        pr.add(new pl("Manchester united", 29, 9, 48));
        pr.add(new pl("Tottenham", 29, 7, 41));
        pr.add(new pl("Arsenal", 28, 4, 40));
        pr.add(new pl("Bumley", 29, -6, 39));
        pr.add(new pl("Crystal palace", 29, -6, 39));
        pr.add(new pl("everton", 29, -6, 37));
        pr.add(new pl("New Castle united", 29, -16, 35));
        pr.add(new pl("Southampton", 29, 17, 34));
        pr.add(new pl("brighton", 29, -8, 29));
        pr.add(new pl("westham united", 29, -15, 27));
        pr.add(new pl("watford", 29, -17, 27));
        pr.add(new pl("AFC Bournemouth", 29, -18, 27));
        pr.add(new pl("Aston villa", 27, -18, 25));
        pr.add(new pl("Norwitch city", 29, -27, 21));
    System.out.println("points before sorting");
    pr.displayAll();

    pr.insertionSort(false);
    System.out.println(" \n Points after sorting (ascending)");
    pr.displayAll();
    }
}