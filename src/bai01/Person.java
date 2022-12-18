package bai01;
import java.util.Scanner;
public class Person {
	private  String name;
	private String address;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		 this.name=name;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void inputData() {
		Scanner sc =new Scanner(System.in);
		System.out.println("nhap ho va ten:");
		name = sc.nextLine();
		System.out.println("nhap vao dia chi:");
		address= sc.nextLine();
	}
	public void displayData() {
		System.out.println("Ho va ten:"+ name);
		System.out.println("Dia chi"+address);
	}
}

