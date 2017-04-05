import java.util.ListResourceBundle;

/**
 * (c) Swissquote 28.03.17
 * Created by Stanislav Lentsov
 */
public class StatsBundle_en_CA extends ListResourceBundle {

	private static Object [][] contens =
		{
			{"GDP", new Integer(21100)},
			{"Population", new Integer(1111)},
			{"Literacy", new Double(0.146)}
		};

	public Object [][] getContents() {
		return contens;
	}
}
