class Course {

	private String code;
	private String title;
	private int creditHours;
	private int numberOfQuizzes;
	private int numberOfAssignments;
	private int numberOfMidExam;
	private int numberOfFinalExam;
	private int numberOfStudents;
	private int numberOfAssessment;
	private Student[] student;
	private Assessment[] assessment;

	void setCode(String code){
		this.code = code;
	}
	void setTitle(String title){
		this.title = title;
	}
	void setCreditHours(int creditHours){
		this.creditHours = creditHours;
	}
	void setNumberOfQuizzes(int numberOfQuizzes){
		this.numberOfQuizzes = numberOfQuizzes;
	}
	void setNumberOfAssignments(int numberOfAssignments){
		this.numberOfAssignments = numberOfAssignments;
	}
	void setNumberOfMidExam(int numberOfMidExam){
		this.numberOfMidExam = numberOfMidExam;
	}
	void setNumberOfFinalExam(int numberOfFinalExam){
		this.numberOfFinalExam = numberOfFinalExam;
	}
	void setNumberOfAssessment(int numberOfAssessment){
		this.numberOfAssessment += numberOfAssessment;
	}


	String getCode( ){
		return code;
	}
	String getTitle( ){
		return title;
	}
	int getCreditHours( ){
		return creditHours;
	}
	int getNumberOfQuizzes( ){
		return numberOfQuizzes;
	}
	int getNumberOfAssignments( ){
		return numberOfAssignments;
	}
	int getNumberOfMidExam( ){
		return numberOfMidExam;
	}
	int getNumberOfFinalExam( ){
		return numberOfFinalExam;
	}
	int getNumberOfAssessment( ){
		return numberOfAssessment;
	}

	void displayState( ){
		System.out.println("\n\tCourse Code: "+getCode( )+"\n\tCourse Title: "+getTitle( )+"\n\tCredit Hours = "+getCreditHours( )+"\n\tNumber of Quizzes = "+getNumberOfQuizzes( )+"\n\tNumber of Assignments = "+getNumberOfAssignments( )+"\n\tNumber of Mid Exams = "+getNumberOfMidExam( )+"\n\tNumber of Final Exams = "+getNumberOfFinalExam( ));
		System.out.println("\n\t<----------------------------------------------->");

		for (int index = 0; index < getNumberOfAssessment( ); index++){
			assessment[index].displayState( );
		}	
	}

	int resultPercentage( ){
		int totalPercentage = 0;
		for (int index = 0; index < getNumberOfAssessment( ); index++) {
			totalPercentage+=assessment[index].calculatePercentage( );
		}
		System.out.println("------>Total Percentage of "+getCode( )+" is = "+totalPercentage/getNumberOfAssessment( )+"%.");
		return totalPercentage/getNumberOfAssessment( );
	}

	void result(int percentage){
		assessment[3].resultCourse(percentage);
	}

	void addAssessment(Assessment a){
		assessment[getNumberOfAssessment( )] = a;
		numberOfAssessment++;
	}

	//Constructers.....
	Course(String code, String title, int creditHours, int numberOfQuizzes, int numberOfAssignments, int numberOfMidExam, int numberOfFinalExam){
		setCode(code);
		setTitle(title);
		setCreditHours(creditHours);
		setNumberOfQuizzes(numberOfQuizzes);
		setNumberOfAssignments(numberOfAssignments);
		setNumberOfMidExam(numberOfMidExam);
		setNumberOfFinalExam(numberOfFinalExam);
		assessment = new Assessment[getNumberOfQuizzes( )+getNumberOfAssignments( )+getNumberOfMidExam( )+getNumberOfFinalExam( )];
		numberOfAssessment = 0;
	}
}