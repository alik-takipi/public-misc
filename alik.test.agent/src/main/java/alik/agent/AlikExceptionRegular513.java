package alik.agent;

public class AlikExceptionRegular513 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegular513.class;
	
	public AlikExceptionRegular513()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
