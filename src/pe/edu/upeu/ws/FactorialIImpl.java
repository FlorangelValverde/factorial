package pe.edu.upeu.ws;
import javax.jws.WebService;

@WebService(endpointInterface =  "pe.edu.upeu.ws.FactorialDao")
public class FactorialIImpl implements FactorialDao {

	@Override
	public int calcularFactorial(int numero){
		int fac = 1;
		for (int i = 1; i <=numero; i++) {
			fac = fac*i;
			
		}
		return fac;
	}

}
