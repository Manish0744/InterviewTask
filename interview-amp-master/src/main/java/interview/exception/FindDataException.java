package interview.exception;

public class FindDataException extends RuntimeException{
	
	public FindDataException() {
		super();
	}
	public FindDataException(String msg)
	{
		super(msg);
	}
}