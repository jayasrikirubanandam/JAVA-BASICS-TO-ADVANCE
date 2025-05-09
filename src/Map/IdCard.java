package Map;

public class IdCard {

	private int age;
	private String name;
	private String city;
	
	
	public IdCard(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "IdCard [age=" + age + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
}
