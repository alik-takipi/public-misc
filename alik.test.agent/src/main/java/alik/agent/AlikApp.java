package alik.agent;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class AlikApp
{
	public static void main(String[] args) throws InterruptedException
	{
		int retries = Integer.parseInt(args[0]);
		
		if (args.length > 1 && args[1].equals("justNew"))
		{
			for (int i = 0 ; i < retries ; ++i)
			{
				new Thread(new Delegator3(new ThrowerRegularNew503())).start();
				
				Thread.sleep(1000);
			}
			
			Thread.sleep(5030);

			return;
		}
		
		if (args.length > 1 && args[1].equals("justPack"))
		{
			for (int i = 0 ; i < retries ; ++i)
			{
				
				new Thread(new ThrowerPack503()).start();
				
				Thread.sleep(1000);
			}
			
			Thread.sleep(5030);

			return;
		}
		
		if (args.length > 1 && args[1].equals("loop"))
		{
			while (true)
			{
				try
				{
					throwE();
				}
				catch (Exception e)
				{
					System.out.println("Caught exception: " + e);
				}
				Thread.sleep(1000);
			}
		}
		
		for (int i = 0 ; i < retries ; ++i)
		{
			
			// Regular
			new Thread(new Delegator3(new ThrowerRegular503())).start();
			
			// Pack
			new Thread(new ThrowerPack503()).start();
//        CtClass ctClass = ClassPool.getDefault().get("alik.agent.ThrowerPack");
//        new Thread(new Delegator1((ThrowerPack) ctClass.toClass().newInstance())).start();
//        // Change bytecode to create a pack
//        CtField f = new CtField(CtClass.intType, "hiddenValue", ctClass);
////        f.setModifiers(AccessFlag.PUBLIC);
//        ctClass.addField(f);
//        ctClass.writeFile();

//        ClassFile cf = ClassPool.getDefault().get("alik.agent.ThrowerPack").getClassFile();
//        FieldInfo f = new FieldInfo(cf.getConstPool(), "whatever", "I");
//        f.setAccessFlags(AccessFlag.PUBLIC);
//        cf.addField(f);

//        ThrowerPack throwerPack = (ThrowerPack) ClassPool.getDefault().get("alik.agent.ThrowerPack").toClass().newInstance();
//        new Thread(new Delegator1((ThrowerPack) ctClass.toClass().newInstance())).start();
//        new Thread(new ThrowerPack()).start();
			
			// Mommy pack
			new Thread(new Delegator1(new ThrowerMommy503())).start();
			new Thread(new Delegator2(new ThrowerMommy503())).start();

			Thread.sleep(1000);
		}
		
		Thread.sleep(5030);
	}
	
	private static void throwE()
	{
		throw new IllegalStateException("Some error.");
	}
}
