package mytest1;

public class Application {

	@Order(value = 3)
	public void hello() {
		System.out.println("twee");

	}
	
	@Order(value = 1)
	public void why() {
		System.out.println("een");
	}
	
	@Order(2)
	public void norder() {
		System.out.println("drie");
	}

}
