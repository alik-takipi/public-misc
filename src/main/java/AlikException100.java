public class AlikException100 extends Exception
{
	public AlikException100() {
		super("OverOps, do you see me ? " + AlikException100.class.getSimpleName());
	}
}
