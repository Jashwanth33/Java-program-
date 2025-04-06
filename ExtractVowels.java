package day19;

/*public class PrintCharacters {
    public static void main(String[] args) {
        String str = "India";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
public class CountAlphabets {
    public static void main(String[] args) {
        String str = "Hello, World! 123";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("Number of alphabets: " + count);
    }
}public class CountCharacters {
    public static void main(String[] args) {
        String str = "Hello, World! 123";
        int alphabets = 0, digits = 0, characters = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                alphabets++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                characters++;
            }
        }

        System.out.println("Alphabets: " + alphabets);
        System.out.println("Digits: " + digits);
        System.out.println("Characters: " + characters);
    }
}public class PrintVowels {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String vowels = "AEIOUaeiou";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                result += ch;
            }
        }

        System.out.println("Vowels: " + result);
    }
    public class AsciiValues {
    public static void main(String[] args) {
        String str = "Hello, World!";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            System.out.println("ASCII value of " + ch + " is " + ascii);
        }
    }
}public class SumOfDigits {
    public static void main(String[] args) {
        String str = "Hello, World! 123";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        System.out.println("Sum of digits: " + sum);
    }
}


    public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}

}public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}



public class valueOfme {
	
	public static void main(String ar[])  
	{  
String a="INDIA";
	char s[]=a.toCharArray();
    for(int i=0;i<s.length;i++) {
	System.out.println(s[i]);
	}
	System.out.println(a.length());
	if(s.equals('a')||s.equals('e')||s.equals('i')||s.equals('o')||s.equals('u')||s.equals('A')||s.equals('E')||s.equals('I')||s.equals('O')||s.equals('U'));
     System.out.println(s);
	//for(int i=0;i<a.length;i++) {
	//System.out.println(a[i]);*/
		public class ExtractVowels {
		    public static void main(String[] args) {
		        String inputString = "Hello, World!";
		        String vowelsInString = extractVowels(inputString);
		        System.out.println("Vowels in the given string: " + vowelsInString);
		    }

		    public static String extractVowels(String input) {
		        String result = "";
		        String vowels = "AEIOUaeiou";
		        for (char c : input.toCharArray()) {
		            if (vowels.indexOf(c) != -1) {
		                result += c;
		            }
		        }
		        return result;
		    }
		

	
	}  
	  
