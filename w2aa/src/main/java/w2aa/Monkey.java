package w2aa;

public class Monkey {
private String name;
private int age;
private double weight;
public Monkey() {
	super();
	// TODO Auto-generated constructor stub
}


public Monkey(double weight) {
	super();
	this.weight = weight;
}


public Monkey(String name, int age, double weight) {
	super();
	this.name = name;
	this.age = age;
	this.weight = weight;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public double getWeight() {
	return weight;
}


public void setWeight(double weight) {
	this.weight = weight;
}


}
