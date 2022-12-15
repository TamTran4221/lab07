import java.util.Scanner;

public class Staff extends Person{
	private String school;
	private double pay;
	public Staff() {
		// TODO Auto-generated constructor stub
	}
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPAy(double pay) {
		this.pay=pay;
	}
	public void inputData(Scanner sc) {
		super.inputData();
		System.out.println("nhap vao truong hoc:");
		this.school = sc.nextLine();
		System.out.println("nhap hinh thuc tra tien");
		this.pay = sc.nextDouble();
	
	}

	public void displayData(Scanner sc) {
		super.displayData();
		System.out.println("truong:" +school);
		System.out.println("hinh thuc tra tien:" + pay);
		
	}
}
