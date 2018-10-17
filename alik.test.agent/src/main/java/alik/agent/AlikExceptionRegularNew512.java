package alik.agent;

public class AlikExceptionRegularNew512 extends RuntimeException
{
	private static final String message = "Threw exception: " + AlikExceptionRegularNew512.class;
	
	public AlikExceptionRegularNew512()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
