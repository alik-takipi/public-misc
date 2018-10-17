package alik.agent;

public class AlikExceptionRegular501 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegular501.class;
	
	public AlikExceptionRegular501()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
