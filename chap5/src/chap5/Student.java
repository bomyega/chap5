package chap5;
class Person{
	int age;
	public String name;
	protected int height;
	private int weight;
	
	public void setWeight(int w) {
		this.weight=w;
	}
	public int getWeight() {
		return weight;
	}
}
public class Student extends Person{
	void set() {
		age=30;
		name="¹Ú¿¹ÀÎ";
		height=160;
		setWeight(333);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.set();
	}

}
