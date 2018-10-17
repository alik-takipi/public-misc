package alik.agent;

public class AlikExceptionPack514 extends RuntimeException
{
	private static final String message = "Threw pack exception: " + AlikExceptionPack514.class;
	
	public AlikExceptionPack514()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
