package edu.handong.csee.java.example.inheritance;

public class Faculty extends Person {

	private int facultyNumber; 
	public Faculty() {
			super();
			facultyNumber=0;
		}
	
	public Faculty(String initialName, int initialStudentNumber){
		super(initialName);        
		facultyNumber = initialStudentNumber;    
	}
	
		public void reset(String newName, int newFacultyNmber){
		setName(newName);
		facultyNumber=newFacultyNmber;
		}
		public int getFacultyNmuber()
		{
			return facultyNumber;
			
		}

		public void setFacultyNumber(int newFacultyNumber)
		{
			facultyNumber= newFacultyNumber;
			
		}
		public void writeOutput() {
			System.out.println("Name: " + getName());
			System.out.println("Student Number: " + facultyNumber); 
		}
		
		public boolean equals(Faculty otherFaculty)
		{
			return this.hasSameName(otherFaculty) && (this.facultyNumber == otherFaculty.facultyNumber);

		}
	}
