import java.util.Scanner;

public class Facet {
    public static int met;
    String imie;
    double waga;
    double wzrost;
    int wiek;

    public Facet(String imie, double waga, double wzrost, int wiek) {
        this.imie = imie;
        this.waga = waga;
        this.wzrost = wzrost;
        this.wiek = wiek;
    }


    ObliczPPm ppm = new ObliczPPm(waga,wzrost,wiek);

    public double ppmVar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj metodę: 1- Miffin, 2 -Harris");
        met = sc.nextInt();
        if(met==1){
            return ppm.ppm1men(waga,wzrost,wiek);
        }
        else if(met ==2){
            return ppm.ppm2men(waga,wzrost,wiek);
        }
        else{
            return 0;
        }


    }
}
