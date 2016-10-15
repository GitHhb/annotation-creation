package mytest1;

public class Application {

	@Order(orderNr = 3)
	public void hello() {
		System.out.println("twee");

	}
	
	@Order(orderNr = 1)
	public void why() {
		System.out.println("een");
	}
	
	@Order(orderNr = 2)
	public void norder() {
		System.out.println("drie");
	}

}
