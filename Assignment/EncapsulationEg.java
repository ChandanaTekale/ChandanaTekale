package Assignment5;

public class EncapsulationEg {
	public static void main(String args[]) {
		Bank s = new Bank (); //object creation for accessing variables
		s.setId(100); //putting values using set()
		s.setsName("Maharashtra Gramin Bank");
		s.setsEmail("mgbhonnd@gmail.com");
		s.setsLocation("Vazirabad Nanded Maharashtra");
		s.setsMainBranch("Vazirabad");
		s.setsSubBranch("Chaitanya Nagar");
		s.setsIFSCcode(123456);
		
		System.out.println("----------Bank Details -----------");
		System.out.println("Id is :" + s.getId());  //fetch value using get()
		System.out.println("Name is :" + s.getsName());
		System.out.println("Email is :" + s.getsEmail());
		System.out.println("Location is :" + s.getsLocation());
		System.out.println("MainBranch is :" + s.getsMainBranch());
		System.out.println("SubBranch is :" + s.getsSubBranch());
		System.out.println("IFSCcode is :" + s.getsIFSCcode());
	}

}
