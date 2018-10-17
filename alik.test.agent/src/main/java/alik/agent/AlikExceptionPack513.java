package alik.agent;

public class AlikExceptionPack513 extends RuntimeException
{
	private static final String message = "Threw pack exception: " + AlikExceptionPack513.class;
	
	public AlikExceptionPack513()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
