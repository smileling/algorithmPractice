package algorithm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindWords {
	
	public Set<String> findWords(Set<String> wordSet) {
		Set<String> words = new HashSet<String>();
		if(wordSet == null || wordSet.size() == 0) 
			return words;
		
		String[] keyboard = new String[3];
		keyboard[0] = "QWERTYUIOP";
		keyboard[1] = "ASDFGHJKL";
		keyboard[2] = "ZXCVBNM";

		Iterator<String> it = wordSet.iterator();
		while(it.hasNext()){
			String wd = it.next();
			String word = wd.toUpperCase();
			
			int line = -1;
			boolean flag = true;
			for (int i = 0; i < word.length(); i++) {
				if(line == -1) {
					for (int j = 0; j < 3; j++) {
						 if(keyboard[j].indexOf(word.charAt(i)) != -1) {
							line = j;
							break;
						} 
					}
				} else {
					if (keyboard[line].indexOf(word.charAt(i)) == -1) {
						flag = false;
						break;
					}
				}
				
				
			}
			if (flag) {
				words.add(wd);
			}
			
			
		}
		
		return words;
	}

	public static void main(String[] args) {

		Set<String> words = new HashSet<String>();
		words.add("life");
		words.add("require");
		words.add("option");
		words.add("hall");
		words.add("Hallm");
		FindWords fw = new FindWords();
		System.out.println(fw.findWords(words));
	}

}
