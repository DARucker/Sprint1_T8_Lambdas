package n3_exercici1;

public class Alumno {

	String name;
	int age;
	String course;
	int mark;
	
	public Alumno(String name, int age, String course, int mark) {
		this.name = name;
		this.age = age;
		this.course = course;
		this.mark = mark;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "name: " + name + ", age=" + age + ", course=" + course + ", mark=" + mark + "\n";
	}
	
	
	
	
	
}
