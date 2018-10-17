package alik.agent;

public class Delegator3 extends RunnableDecorator
{
	public Delegator3(Runnable decorated) {
		super(decorated);
	}
	
	@Override
	public void run()
	{
		decorated.run();
	}
}
