package jobsheet3;

public class Sphere {
    int r;
    public Sphere(int j){
        r = j;
    }
    double calcVol(){
        double vol = 0;
        vol = (4.0/3.0)*Math.PI*r*r*r;
        return vol;
    }
    double calcSurface(){
        double sur = 0;
        sur = 4*Math.PI*r*r;
        return sur;
    }
}
