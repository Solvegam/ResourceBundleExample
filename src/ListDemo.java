import java.util.Locale;
import java.util.ResourceBundle;

/**
 * (c) Swissquote 28.03.17
 * Created by Stanislav Lentsov
 */
public class ListDemo {

	static void displayValues(Locale currentLocale) {

		ResourceBundle stats =
				ResourceBundle.getBundle("StatsBundle",currentLocale);

		Integer gdp = (Integer)stats.getObject("GDP");
		System.out.println("GDP = " + gdp.toString());
		Integer pop = (Integer)stats.getObject("Population");
		System.out.println("Population = " + pop.toString());
		Double lit = (Double)stats.getObject("Literacy");
		System.out.println("Literacy = " + lit.toString());

	} // displayValues

	static public void main(String[] args) {

		Locale[] supportedLocales = {
				new Locale("en","CA"),
				new Locale("ja","JP"),
				new Locale("fr","FR")
		};

		for (int i = 0; i < supportedLocales.length; i ++) {
			System.out.println("Locale = " + supportedLocales[i]);
			displayValues(supportedLocales[i]);
			System.out.println();
		}

	} // main

}
