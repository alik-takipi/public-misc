package alik.agent;

public class AlikExceptionRegularNew501 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegularNew501.class;
	
	public AlikExceptionRegularNew501()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
