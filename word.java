import java.util.*;
class word {
	String st;
	word() {
		st = "";
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line = ");
		st = sc.nextLine().trim();
	}
	int count_vowel(String w) {
		int c = 0;
		w = w.toUpperCase();
		for(int i = 0; i < w.length(); ++i) {
			switch(w.charAt(i)) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					++c;
					break;
				default:
					return 0;
			}
		}
		return c;
	}
	
}
