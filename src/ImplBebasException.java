
public class ImplBebasException {

	public static void main(String[] args) {
		String jk="wanita", status="single";
		if(jk=="pria") {
			if(status=="single") {
				System.out.println("pajak 10%");
			} else {
				System.out.println("pajak 5%");
			}
		} if (jk=="wanita") {
			if (status=="single") {
				System.out.println("pajak 7%");
			} else {
				System.out.println("pajak 3%");
			}
		}
	}
	
}
