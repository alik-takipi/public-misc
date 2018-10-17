package alik.agent;

public class AlikExceptionRegular512 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegular512.class;
	
	public AlikExceptionRegular512()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
