package alik.agent;

public class AlikExceptionRegular514 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegular514.class;
	
	public AlikExceptionRegular514()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
