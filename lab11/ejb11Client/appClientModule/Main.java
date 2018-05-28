import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import abcd.AdditionRemote;

public class Main {
	public static void main(String[] args) {

		try {
			Context ctx = new InitialContext();
			AdditionRemote remote = (AdditionRemote) ctx.lookup("dofindAdd");
			System.out.println(remote.add(5, 10));
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
	


}