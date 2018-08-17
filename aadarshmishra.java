import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AndroidWorkDay1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		int n = s.nextInt();
		s.nextLine();
		List<Integer> ans = new ArrayList<Integer>();
		while(n-- > 0) {
		    String pat = s.nextLine();
		    Pattern pattern = Pattern.compile(pat);
		    Matcher m = pattern.matcher(text);
		    while (m.find()) {
			    ans.add(m.start());
		    }
		}
	    Collections.sort(ans);
		for(int i=0 ; i < ans.size() ; i++) {
		    System.out.print(ans.get(i) + " ");
	    }
	}
}