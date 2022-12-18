package bai03;

public class Main {


    public static void main(String[] args) {
        SamSung samSung = new SamSung("quay phim", "ultra22", 1080, 15000000, true, true);
        Sony sony = new Sony("quay phim", "Xperia", 2520,10000000, true, false);
        samSung.showDetails();
        System.out.println("\n");
        sony.showDetails();
    }
}