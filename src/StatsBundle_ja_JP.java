import java.util.ListResourceBundle;

/**
 * (c) Swissquote 28.03.17
 * Created by Stanislav Lentsov
 */
public class StatsBundle_ja_JP extends ListResourceBundle {

	private static Object [][] contens =
		{
			{"GDP", new Integer(23300)},
			{"Population", new Integer(333)},
			{"Literacy", new Double(0.333)}
		};

	public Object [][] getContents() {
		return contens;
	}
}
