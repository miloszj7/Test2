


public class Person {
	
	private String firstName, secondName;
	
	
	public Person(String firstName, String secondName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getSecondName() {
		return secondName;
	}


	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}


	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", secondName=" + secondName
				+ "]";
	}
	

	public static void main(String[] args) {
		System.out.println(false); 
		System.out.println("ala ma kota");
		Person me = new Person("Milosz", "Nazwisko");
		System.out.println(me.firstName);
		System.out.println(me.toString());
		System.out.println(me.getFirstName());
		me.setSecondName("Kowsalki");
		System.out.println(me.toString());
	}

}
