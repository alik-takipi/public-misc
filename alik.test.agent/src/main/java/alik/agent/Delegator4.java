package alik.agent;

public class Delegator4 extends RunnableDecorator
{
	public Delegator4(Runnable decorated) {
		super(decorated);
	}
	
	@Override
	public void run()
	{
		decorated.run();
	}
}
