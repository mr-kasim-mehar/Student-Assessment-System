class Run {


	public static void main(String[] args)throws Exception {
		
		Student student = new Student(221370003,"Muhammad Qasim","BS Computer Science");

		Course course1 = new Course("CS-332","Object Oriented Programming",12,2,1,1,1);
		Course course2 = new Course("Math-107","Statistics and Probability",12,3,1,0,1);
		Course course3 = new Course("DLD-207","Digital Logic Design",12,4,1,1,0);
		Course course4 = new Course("SIP","Social Integration Program",12,3,1,2,1);

		student.registerCourse(course1);
		student.registerCourse(course2);
		student.registerCourse(course3);
		student.registerCourse(course4);

		
		Assessment assessment1 = new Assessment("Quiz",20,16);
		Assessment assessment2 = new Assessment("Assignment",50,39);
		Assessment assessment3 = new Assessment("Mid Exam",80,61);
		Assessment assessment4 = new Assessment("Final Exam",100,81);

		Assessment assessment5 = new Assessment("Quiz",10,7);
		Assessment assessment6 = new Assessment("Assignment",50,45);
		Assessment assessment7 = new Assessment("Mid Exam",80,75);
		Assessment assessment8 = new Assessment("Final Exam",100,89);

		Assessment assessment9 = new Assessment("Quiz",25,22);
		Assessment assessment10 = new Assessment("Assignment",50,41);
		Assessment assessment11 = new Assessment("Mid-Term",80,51);
		Assessment assessment12 = new Assessment("Final-Term",100,70);

		Assessment assessment13 = new Assessment("Quiz",20,17);
		Assessment assessment14 = new Assessment("Assignment",50,39);
		Assessment assessment15 = new Assessment("Mid_Term",80,60);
		Assessment assessment16 = new Assessment("Final-Term",100,66);

		course1.addAssessment(assessment1);
		course1.addAssessment(assessment2);
		course1.addAssessment(assessment3);
		course1.addAssessment(assessment4);

		course2.addAssessment(assessment5);
		course2.addAssessment(assessment6);
		course2.addAssessment(assessment7);
		course2.addAssessment(assessment8);

		course3.addAssessment(assessment9);
		course3.addAssessment(assessment10);
		course3.addAssessment(assessment11);
		course3.addAssessment(assessment12);

		course4.addAssessment(assessment13);
		course4.addAssessment(assessment14);
		course4.addAssessment(assessment15);
		course4.addAssessment(assessment16);

		Welcome welcome = new WelcomeToSys();
        welcome.displayWelcomeMessage();

		System.out.println("\n\t------------------->Student Information<-----------------------");
		student.displayState( );

		int percentage1 = course1.resultPercentage( );
			course1.result(percentage1);

		int percentage2 = course2.resultPercentage( );
			course2.result(percentage2);

		int percentage3 = course3.resultPercentage( );
			course3.result(percentage3);

		int percentage4 = course4.resultPercentage( );
			course4.result(percentage4);

		System.out.println("\n\t------------------------>Student 1<-----------------------------");

			student.printGradeBook((percentage1+percentage2+percentage3+percentage4)/4);

	}
}


