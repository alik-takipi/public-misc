package alik.agent;

public class ThrowerRegularNew511 implements Runnable
{
	@Override
	public void run()
	{
		// In regular New
		System.out.println("In regular New");
		throw new AlikExceptionRegularNew511();
	}
}
