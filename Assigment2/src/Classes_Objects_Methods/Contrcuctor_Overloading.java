package Classes_Objects_Methods;

public class Contrcuctor_Overloading {
	String name;
	int age;
	String address;
public	Contrcuctor_Overloading(String name) {
	this.name=name;
}

public Contrcuctor_Overloading(String name, int age) {
	this.name = name;
	this.age = age;
}
public Contrcuctor_Overloading(String name,int age, String address) {
	this.name = name;
	this.age = age;
	this.address = address;
}

public void display() {
	System.out.println("Name: "+ name);
}

public void display(boolean isAge) {
	if(isAge)
	System.out.println("Name : "+name);

	System.out.println("Age :"+ age);
}

public void display(boolean isAge, boolean isAddress) {
	if(isAge && isAddress) {
		System.out.println("Name : "+ name);
		System.out.println("Age : " + age);
		System.out.println("Address : "+ address);
	}
	
}
public static void main(String[] args) {
	Contrcuctor_Overloading details1 = new Contrcuctor_Overloading("Roshan");
	Contrcuctor_Overloading details2 = new Contrcuctor_Overloading("Roshan",23,"23 1st floor");
	Contrcuctor_Overloading details3 = new Contrcuctor_Overloading("Roshan",23,"23 1st floor");
	
	System.out.println("Displaying details 1: ");
	details1.display();
	
	System.out.println("Displaying details 1: ");
	details2.display(true);
	
	System.out.println("Displaying details 1: ");
	details3.display(true, true);
	
}
}