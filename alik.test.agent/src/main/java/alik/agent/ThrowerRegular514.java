package alik.agent;

public class ThrowerRegular514 implements Runnable
{
	@Override
	public void run()
	{
		// In regular
		System.out.println("In regular");
		try
		{
			throwIt();
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	private void throwIt()
	{
		throw new AlikExceptionRegular514();
	}
	
	@SuppressWarnings("unchecked")
	private static <T extends Throwable> RuntimeException sneaky(Throwable throwable) throws T {
		throw (T) throwable; // rely on vacuous cast
	}
}
