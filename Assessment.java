class Assessment{


	private String type;
	private double totalMarks;
	private double marksObtained;
	private Grade grade;


	void setType(String type){
		this.type = type;
	}
	
	void setTotalMarks(double totalMarks){
		this.totalMarks = totalMarks;
	}
	void setMarksObtained(double marksObtained){
		this.marksObtained = marksObtained;
	}

	//int getId( ){
		//return id;
	//}
	String getType( ){
		return type;
	}
	double getTotalMarks( ){
		return totalMarks;
	}
	double getMarksObtained( ){
		return marksObtained;
	}

	void displayState( ){
	
		System.out.println("\n\tAssessment Type is = "+getType( )+"\n\tAssessment Obtained Marks = "+getMarksObtained( )+"\n\tAssessment Total Marks = "+getTotalMarks( )+"\n\tAssessment Percentage = "+calculatePercentage( )+"%.");
		System.out.println("\n\t<------------------------------------->");
	}

	int calculatePercentage( ){
		return (int) (getMarksObtained( ) / getTotalMarks( ) * 100);
	}

	int totalPercentage(int number, int totalPercentage){
		return (int) (totalPercentage / number);
	}

	void resultCourse(int percentage){
		if (percentage >= 80 && percentage <= 100){
			grade = new Grade("A",100,80,"Excellent");
			grade.displayState( );
		}

		else
			if (percentage >= 65 && percentage <= 79){
				grade = new Grade("B",79, 65,"Good");
				grade.displayState( );
		}

		else
			if (percentage >= 50 && percentage <= 64){
				grade = new Grade("C",64,50,"Satisfactory");
				grade.displayState( );
		}

		else
			if (percentage >= 40 && percentage <= 49){
				grade = new Grade("D",49,40,"Pass");
				grade.displayState( );
		}

		else{
			grade = new Grade("F",40,1 ,"Fail");
			grade.displayState( );
		}
	}

	//Constructer.....
	Assessment(String type, double totalMarks, double marksObtained){
		
		//setId(id);
		this.type = type;
		this.totalMarks = totalMarks;
		this.marksObtained = marksObtained;
	}
}