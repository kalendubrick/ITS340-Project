package guiPackage;

import javax.swing.ImageIcon;
import java.net.URL;

public final class LoadResource 
{
	private static final String IMAGE_PATH_FORMAT = "/resources/%s.png";
	
	public static ImageIcon getCardImage(Card card) 
	{
		String formatString;
		
		formatString = String.valueOf(card.toString().charAt(0)) + String.valueOf(card.getSuit().charAt(0)).toLowerCase();
		
		String path = String.format(IMAGE_PATH_FORMAT, formatString);
        return getIcon(path);
	}
	
	public static ImageIcon getIcon(String path) {
        URL url = LoadResource.class.getResource(path);
        if (url != null) {
            return new ImageIcon(url);
        } else {
            throw new RuntimeException("Resource file not found: " + path);
        }
    }

}
