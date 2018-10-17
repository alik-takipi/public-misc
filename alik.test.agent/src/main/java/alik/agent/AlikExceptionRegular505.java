package alik.agent;

public class AlikExceptionRegular505 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegular505.class;
	
	public AlikExceptionRegular505()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
