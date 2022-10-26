package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Manuel
 *
 */
public class DateUtils {


	/**
	 * Methode pour paramétrer une date avec une valeur par défaut
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String format (Date date, String pattern) {
		if (pattern.equals(null))
		{
			pattern = "dd/MM/yyyy HH:mm:ss";
		}
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}
}
