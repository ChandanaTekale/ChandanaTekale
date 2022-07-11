package com;

public class EncapsulationEg {
	public static void main(String args []) {
		Student s = new Student (); //object creation for accessing varibles
		s.setId(111); //putting values using set()
		s.setsName("Riya");
		s.setsEmail("riya@gmail.com");
		s.setsPhone(123465878);
		
		System.out.println("------- Student Details -------");
		System.out.println("Id is :" + s.getId());  //fetch value using get()
        System.out.println("Name is :" + s.getsPhone());	
        System.out.println("Phone is :" + s.getsPhone());
        System.out.println("Email is :" + s.getsEmail());	
	}

}
