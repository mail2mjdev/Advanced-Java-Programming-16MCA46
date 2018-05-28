package abcd;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless(mappedName = "dofindAdd")
@LocalBean
public class Addition implements AdditionRemote {

	public int add(int a, int b) {
		return a+b;
	}
}
