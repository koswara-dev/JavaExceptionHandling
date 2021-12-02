
class BebasException extends Exception {
	public BebasException(String s) {
		super(s);
	}
}


public class CobaBebasException {

	public static void main(String[] args) {
		//Latihan inputan
		//jenis kelamin, status
		//pria blm menikah, pajak 10% //Throw
		//pria menikah, pajak 5%
		//wanita blm menikah, pajak 7% //CustomException
		//wanita menikah, pajak 3%
		
		try {
			throw new BebasException("Throw Custom Message Error");
		} catch (BebasException bebas) {
			// TODO: handle exception
			System.out.println("Bebas Exception");
			System.out.println(bebas.getMessage());
		}
	}
}
