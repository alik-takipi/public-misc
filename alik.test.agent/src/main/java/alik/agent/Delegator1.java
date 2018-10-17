package alik.agent;

public class Delegator1 extends RunnableDecorator
{
	public Delegator1(Runnable decorated) {
		super(decorated);
	}
	
	@Override
	public void run()
	{
		decorated.run();
	}
}
