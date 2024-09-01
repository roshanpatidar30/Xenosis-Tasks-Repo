package Classes_Objects_Methods;

public class Person {
 String name = "Roshan Patidar";
 int age = 23;
 
 public void show() {
	 System.out.println(name);
	 System.out.println(age);
 }
 public static void main(String[] args)
 {
	Person person = new Person();
	person.show();
 }
}
