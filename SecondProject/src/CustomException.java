class FallInRiverException extends Exception {}

class DropOarException extends Exception {}


class RiverRafting {

    	void crossRapid(int degree) throws FallInRiverException {
	System.out.println("crossing rapid");
		if(degree > 10) throw new FallInRiverException();
	}

	void rowRaft(String state) throws DropOarException {
	System.out.println(" Row Raft");
		if(state.equals("nervous")) throw new DropOarException();
	}

}

public class CustomException {

	public static void main(String args[]) {

	RiverRafting rr = new RiverRafting();

	try {
		//rr.crossRapid(11);
		rr.crossRapid(9);
		rr.rowRaft("happy");
		System.out.println("Enjoying Row Rafting");
	 } 
	/*
	catch(FallInRiverException ex1) {
		System.out.println("Get back to Raft");
	
	}*/
	catch(DropOarException ex2) {
		System.out.println("Don't panic");
	}catch(Exception ex) {
		System.out.println("Exceptions: "+ex.getMessage());
		System.out.println("Trace: " + ex.getStackTrace());
		ex.printStackTrace();
	}
	finally {
		System.out.println("Pay for the sporting");
        }
        System.out.println("After the try block");
	}
}

	
