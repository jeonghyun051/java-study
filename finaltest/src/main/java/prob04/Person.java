package prob04;

public class Person {
	private static int numberOfPerson; // 전체 인구수
	private int age;
	private String name;
	
	public Person( String name ){
		this.name = name;
		this.age = 12;
		numberOfPerson++;
		
	}
	
	public Person(int age, String name){
		this(name);
		this.age = age;
		
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
	public void selfIntroduce(){
		System.out.println("내 이름은" + " " + name + "이며," + "" + "나이는" + " " + this.age + "살 입니다.");
		// "내 이름은 ...이며, 나이는 ...살입니다." 출력함
		// 예) 내이름은 김철수이며, 나이는 19살 입니다.
	}

	static int getPopulation(){
		// 전체 인구수를 return 함
		return numberOfPerson;
	}
}
