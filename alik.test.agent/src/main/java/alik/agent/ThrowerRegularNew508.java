package alik.agent;

public class ThrowerRegularNew508 implements Runnable
{
	@Override
	public void run()
	{
		// In regular New
		System.out.println("In regular New");
		throw new AlikExceptionRegularNew508();
	}
}
