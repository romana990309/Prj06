package ex02;

class Member {
	// Fields
	private String name;
	private String email;
	
	// Constructor
	// 기본 생성자 : NoArgsConstructor
	public Member() {
		
	}
	// 모든 인자가 있는 생성자 : AllArgsConstructor
	public Member(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	// Getter 
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	// Setter
	

	public void setName(String name) {
		this.name = name;
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	// Method
	public void info() {
		System.out.println("이름:" + name +", 이메일:" + email );
	}


	
}

public class TestMember {

	public static void main(String[] args) {
		 Member m1 = new Member ("박찬호","park@gmail.com");
		 m1.info();
		 
		 Member m2 = new Member ("류현진",null);
		 m2.info();
		 m2.setEmail("ryu@gmail.com");
		 //m2.email = "Ryu@gmail.com"; // error : not visible
		 m2.info();
		 
		 //m2 의 이름은 무엇인가
		 String m2Name = m2.getName();
		 System.out.println(m2Name);
		 
		 Member m3 = new Member ();
		 m3.setName("최동원");
		 m3.setEmail("c@gmail.com");
		 m3.info();
	}

}
