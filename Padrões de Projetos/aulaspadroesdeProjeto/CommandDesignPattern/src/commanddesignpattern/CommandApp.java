package commanddesignpattern;

import java.util.*;

public class CommandApp
{
	public static void main( String arg[] )
	{
		ArrayList a = new ArrayList();
		Receiver r = new ConcreteReceiver();
		
		a.add(new CommandAbrir(r));
		a.add(new CommandFechar(r));
		a.add(new CommandNovo(r));
		
		Iterator it = a.iterator();
		while(it.hasNext()) 
			((Command)it.next()).execute();
	}
	
}