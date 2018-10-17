package alik.agent;

public class AlikExceptionPack508 extends RuntimeException
{
	private static final String message = "Threw pack exception: " + AlikExceptionPack508.class;
	
	public AlikExceptionPack508()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
