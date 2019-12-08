package classActivity.day5;

public class HDFC implements RBI, Cibil{
		
		public void maxTrax() {
			System.out.println("Welcome. Your max trasaction can't be more than Rs.100000");
		}
		
		public void minBal() {
			System.out.println("Your minimum balance has to be Rs.1000");
		}
		
		public void verifyAadhar() {
			System.out.println("Submit your Aadhaar as part of KYC.");
		}
		
		public void getCreditLimit() {
			System.out.println("You'll get a Credit limit updated.");
		}

public static void main (String args[]) {
	HDFC h = new HDFC();
	h.maxTrax();
	h.minBal();
	h.verifyAadhar();
	h.getCreditLimit();
}

}