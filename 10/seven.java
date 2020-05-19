public class seven {
	public static void main(String[] args) {
		String[] token1 = split("ab#12#453", "#");
		for (int i = 0; i < token1.length; i++)
			System.out.print(token1[i] + " ");
		/*
		System.out.println();
		String[] token2 = split("a?b?gf#e", "[?#]");
		for (int i = 0; i < token2.length; i++)
			System.out.print(token2[i] + " ");
		*/
	}
	public static String[] split(String s, String regex) {
		/*
		 * String[] str=new String[10]; int n=0; for(int j=0;j<regex.length();j++) { int
		 * count=0; for(int i=0;i<s.length();i++) { if(s.charAt(i)==regex.charAt(j)) {
		 * str[n++]=s.substring(count,i); count=i+1; } } } return str;
		 */
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			int index = s.indexOf(regex);
			if (index == -1) {
				str = str + s;
				break;
			} 
			else {
				if (index != 0)
					str = str + s.substring(0, index) + ",";
				str = str + s.substring(index, index + regex.length()) + ",";//¼ÓÉÏ·Ö¸ô·û
				s = s.substring(index + regex.length(), s.length());
				i = 0;
			}
		}
		String[] sub = str.split(",");
		return sub;
	}
}