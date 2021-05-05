package ExceptionDemoBank;

/**
 * @author dharmik mehta
 *
 */
public class CardBlockedException extends RuntimeException {
	
	@Override
	public String getMessage() {
		return "Your card is blocked. Please contact nearest branch soon.";
	}
	
//	@Override
//	public String toString() {
//		return "CardBlockedException";
//	}
}