class Student {

	private int id;
	private String name;
	private String program;
	private int numberOfCourses;
	private Course[] courses;

	
	//Constructers.....
	public Student( ){
		this.id = 0;
		this.name = "";
		this.program = "";
		courses = new Course[4];
		numberOfCourses = 0;

	}

	public Student(int id, String name, String program){
	this.id = id;
	this.name = name;
	this. program = program;
		courses = new Course[4];
		numberOfCourses = 0;
	}


	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setProgram(String program){
		this.program = program;
	}
	public void setNumberOfCourses(int numberOfCourses){
		this.numberOfCourses = numberOfCourses;
	}

	public int getId( ){
		return id;
	}
	public String getName( ){
		return name;
	}
	public String getProgram( ){
		return program;
	}
	public int getNumberOfCourses( ){
		return numberOfCourses;
	}
	public void nameDisplay(){
		System.out.print("Student Name: "+getName());
	}
	public void displayState( ){
		System.out.println("\tStudent Id is = "+getId( )+"\n\tStudent Name is: "+getName( )+"\n\tCourse: "+getProgram( ));
		System.out.println("\n\t<------------------------------------------>");
		
		for (int index = 0; index < getNumberOfCourses( ); index++){
			courses[index].displayState( );
		}
	}

	public void registerCourse(Course c){
		courses[numberOfCourses] = c;
		numberOfCourses++;
	}

	public void printGradeBook(int percentage){
		if (percentage >= 80 && percentage <= 100){
			System.out.println("\n\t------>Student Scores 4.00 CGPA...");	
		}
	
		else 
			if (percentage >= 65 && percentage <= 79){
				System.out.println("\n\t------>Student Scores 3.4 CGPA...");
		}

		else 
			if (percentage >= 50 && percentage <= 64){
			System.out.println("\n\t------>Student Scores 2.9 CGPA...");
		}

		else 
			if (percentage >= 40 && percentage <= 49){
				System.out.println("\n\t------>Student Scores 1.8 CGPA...");
		}
		
		else{
			System.out.println("\n\t------>Student Scores 1.0(Fail) CGPA...");
		}
	}

	//Copy Constructer.....
	Student(Student s){
		setId(s.getId( ));
		setName(s.getName( ));
		setProgram(s.getProgram( ));
	}

}