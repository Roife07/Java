package Utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {
	
	static NumberFormat formatandovalores = new DecimalFormat("R$ #,## 0,00");
	public static String doubleTostString(Double valor) {
		return formatandovalores.format(valor);
		
	}

}
