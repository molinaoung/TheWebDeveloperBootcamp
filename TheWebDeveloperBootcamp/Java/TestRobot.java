
public class TestRobotAndPerson{
	public static void main(String[] args){
	//we used the constructor that we defined to create these two objects. 	
	Robot r1 = new Robot("Tom", "Red", 30);
	Robot r2 = new Robot("Jerry", "Blue", 40);

	r1.introduceSelf();
	r2.introduceSelf();	
	
	Person p1 = new Person("Alice", "Aggressive", false);
	Person p2 = new Person("Becky", "Talkative", true);

	//show that person one owns robot two
	//sets the robot owned attribute to r2
	p1.robotOwned = r2;
	p2.robotOwned = r1;

	//my name is jerry
	p1.robotOwned.introduceSelf();
	//my name is Tom
	p2.robotOwned.introduceSelf();



	}

}

//class robot
class Robot{
	
	String name;
	String color;
	int weight;
/*
Constroctor is a function that allows you to create an object from a class.
you can use the cnstructor to do things like set attributes for yourself. 
*/	
	Robot(String n, String c, int w){
		this.name = n;
		this.color = c;
		this.weight = w;
	}
	void introduceSelf(){
		System.out.println("My name is" + this.name);
		//This refers to whatever object that youre running the function on. r1.name
	}
	//void because it is not return anything
}

//second class for Person
class Person{
	String name;
	String personality;
	boolean isSitting;
	Robot robotOwned; //type of this attribute is robot

	Person(Sitting n, String p, bollean i){
		this.name = n;
		this.personality = p;
		this.isSitting = i;
	}
	void sitDown(){
		this.isSitting = true;
	}
	void standUp(){
		this.isSitting = false;
	}
}
