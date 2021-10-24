package tp1;

public class StringManipulator {

    private String s;

    public StringManipulator(String s) {
        this.s = s;
    }

    public void reverse(){
        String ch="";
        for(int i = s.length()-1; i>=0; i--){
            ch = ch + s.charAt(i);
    }
        System.out.println("reverse : "+ch);
    }

    public void isPalindrome(){
        int j;
        boolean test;
        test=true;
        j=s.length()-1;
        for(int i = 0; i<(s.length()/2)-1; i++)
            if (s.charAt(i)!=s.charAt(j))
                test=false;
                
                
        if (test==true)
        System.out.println(ch+"palindrome");
        else
         System.out.println(ch+"is not palindrome");

    }

    public void toUpperCase(){
       char c;
		String z = "";
		
		int n;

		for (int i = 0; i<s.length(); i++) {
			c = s.charAt(i);
			if (c >= 97 && c<= 122) 
			{
				n = c - 32;
				c = (char) n;
			}
			z = z + c;
		}
		s=z;
        System.out.println("uppercase : "+s);
    }

    public void toLowerCase(){
         char c;
		String z = "";
		
		int n;

		for (int i = 0; i<s.length(); i++) {
			c = s.charAt(i);
			if (c >= 65 && c<= 90) 
			{
				n = c + 32;
				c = (char) n;
			}
			z = z + c;
		}
		s=z;
        System.out.println("lowercase : "+s);
    }

    public void getVowelNumber(){
        char ch;
	int i=0;
	for(int j=0;j<s.length();j++)
	{
	  ch=s.charAt(j);	
	  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	  {
            i++;
	 
	  }
	}
	if(i==0)
		System.out.println("There are no vowels in a string"); 
	else 	
        System.out.println("vowelNumber : "+i);
    }

    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator("tene");
        stringManipulator.reverse();
        stringManipulator.isPalindrome();
        stringManipulator.toUpperCase();
        stringManipulator.toLowerCase();
        stringManipulator.getVowelNumber();
    }
}
