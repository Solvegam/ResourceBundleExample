import java.util.ListResourceBundle;

/**
 * (c) Swissquote 28.03.17
 * Created by Stanislav Lentsov
 */
public class StatsBundle_fr_FR extends ListResourceBundle {

	private static Object [][] contens =
		{
			{"GDP", new Integer(22200)},
			{"Population", new Integer(2222)},
			{"Literacy", new Double(0.4541)}
		};

	public Object [][] getContents() {
		return contens;
	}
}
