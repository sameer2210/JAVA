/*
  if value null or "" empty then throw this exception
  
 */
public class EmptyBooleanException extends RuntimeException {
	public EmptyBooleanException(String errorDetails) {
  super(errorDetails);
}
}
