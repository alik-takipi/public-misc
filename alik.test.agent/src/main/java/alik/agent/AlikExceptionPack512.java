package alik.agent;

public class AlikExceptionPack512 extends RuntimeException
{
	private static final String message = "Threw pack exception: " + AlikExceptionPack512.class;
	
	public AlikExceptionPack512()
	{
		super(message);
		System.out.println();
		System.out.println(message);
		System.out.println();
	}
}
