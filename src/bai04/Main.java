package bai04;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1.1f,"pink",500);
        System.out.println("the tich hinh tron la:");
        System.out.println(cylinder.getVolumetric());

        System.out.println("\n thong tin hinh tron la:");
        System.out.println(cylinder);
    }
}
