import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(TYPE)
public @interface TesterInfo {
	public enum Priority {LOW, MEDIUM, HIGH}
	
	Priority priority() 	default Priority.MEDIUM;
	String[] tags()			default "";
	String createdBy()		default "Leandro";
	String lastModified()	default "today";
}
