package bai01;
import java.util.Scanner;
public class Student extends Person {
    private String program;
	private int year;
	private double fee;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String address,String program, int year, double fee ) {
		super(name, address);
		// TODO Auto-generated constructor stub
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setFrameworkPopular(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public void inputData(Scanner sc) {
		super.inputData();
		System.out.println("nhap vao chuong trinh hoc:");
		this.program = sc.nextLine();
		System.out.println("nhap vao nam");
		this.year = sc.nextInt();
		System.out.println("nhap vao fee");
		this.fee = sc.nextDouble();
	}

	public void displayData(Scanner sc) {
		super.displayData();
		System.out.println("chuong trinh hoc:" + program);
		System.out.println("nam hoc:" + year);
		System.out.println("hoc phi:" + fee);
	}
}
