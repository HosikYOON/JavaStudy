package java03_18;

public class Person {
	
	public int age;
	public String name;
	public boolean marige; 
	public int child; 
	
	public void print_person() {
		System.out.println(this.age + "살\n" 
							+"이름 "+this.name + "\n" 
							+ "결혼유무" + this.marige +"\n"
							+ "자녀"+ this.child+"명");
	}
}
