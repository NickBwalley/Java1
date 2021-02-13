package accessModifiers;

public class Main {

	public static void main(String[] args) {
		Student.name = "Nick";	 // defined statically
		Student stu = new Student();
		stu.age = 40; 	// defined non-statically

	}

}
/*
 * ACCESS LEVELS
 * MODIFIER		CLASS 		PACKAGE		SUBCLASS		WORLD
 * Public		Y			Y			Y				Y
 * Protected	Y			Y			Y				N
 * Private 		Y			Y			N				N
 * No Modifier	Y			N			N				N
 * */		
