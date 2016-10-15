package mytest1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Controller {
	public static void main(String[] args) {
		
		System.out.println("Starting Controller");
		
		Class<Application> obj = Application.class;
		Method[] methods = obj.getDeclaredMethods();
		Arrays.sort(methods, new Comparator<Method>(){
			public int compare (Method x, Method y){
				return x.getAnnotation(Order.class).orderNr() - y.getAnnotation(Order.class).orderNr();
			}
		});
		// Process methods in order of annotation orderNr
		for (Method m: methods ) {
			/*
			// print method name
			System.out.println("Method: " + m.getName());
			for (Annotation a: m.getAnnotations()){
				System.out.println(a);
			}
			*/
			// execute method
			try {
				m.invoke(obj.newInstance());
			} catch (Throwable except) {
				System.out.println("Error invoking method");
			}
		}
	}

}
