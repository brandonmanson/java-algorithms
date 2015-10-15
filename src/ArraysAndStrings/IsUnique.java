/* Check to see if all characters in a given string are unique */

package ArraysAndStrings;

import java.util.ArrayList;

public class IsUnique {
	private String string;
	
	
	public IsUnique(String string) {
		this.string = string;
	}
	
	public boolean checkCharacters(String string) {
		ArrayList<String> splitString = new ArrayList<String>();
		if(string.length() > 1)
		{
			splitString.add(0, string);
			for(int i = 1; i < string.length(); i++)
			{
				if(!splitString.contains(string.charAt(i)))
				{
					splitString.add(i, string);
				}
				else
				{
					return false;
				}
			}
		}
		return true;
	}
}