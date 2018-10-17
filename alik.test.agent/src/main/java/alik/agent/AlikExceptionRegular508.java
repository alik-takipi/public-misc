package alik.agent;

public class AlikExceptionRegular508 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegular508.class;
	
	public AlikExceptionRegular508()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
