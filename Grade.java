class Grade{

	private String grade;
	private int minPercentage;
	private int maxPercentage;
	private String remarks;


	Grade(String grade, int maxPercentage, int minPercentage, String remarks){
		this.grade = grade;
		this.maxPercentage = maxPercentage;
		this.minPercentage = minPercentage;
		this.remarks = remarks;
	}

	void setGrade(String grade){
		this.grade = grade;
	}
	void setMinPercentage(int minPercentage){
		this. minPercentage = minPercentage;
	}
	void setMaxPercentage(int maxPercentage){
		this.maxPercentage = maxPercentage;
	}
	void setRemarks(String remarks){
		this.remarks = remarks;
	}

	String getGrade( ){
		return grade;
	}
	int getMinPercentage( ){
		return minPercentage;
	}
	int getMaxPercentage( ){
		return maxPercentage;
	}
	String getRemarks( ){
		return remarks;
	}

	void displayState( ){
	
		System.out.println("\n\tGrade is: "+getGrade()+"\n\tMaximuim Percencentage is = "+getMaxPercentage( )+"\n\tMinimium Percentage is = "+getMinPercentage( )+"\n\tRemarks: "+getRemarks( ));
		System.out.println("\n\t---------------------------------------------------");
	}


}