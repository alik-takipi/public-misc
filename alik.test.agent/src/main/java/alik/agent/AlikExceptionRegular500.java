package alik.agent;

public class AlikExceptionRegular500 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegular500.class;
	
	public AlikExceptionRegular500()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
