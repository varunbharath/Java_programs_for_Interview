package interview;

public class Seperatecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				   String b = "Bharath212345%^&*(678";
			        
			        StringBuilder letters = new StringBuilder();
			        StringBuilder numbers = new StringBuilder();
			        StringBuilder specialCharacters = new StringBuilder();
			        
			        for (int i = 0; i < b.length(); i++) {
			            char ch = b.charAt(i);
			            if (Character.isLetter(ch)) {
			                letters.append(ch);
			            } else if (Character.isDigit(ch)) {
			                numbers.append(ch);
			            } else {
			                specialCharacters.append(ch);
			            }
			        }
			        
			        System.out.println("Letters: " + letters);
			        System.out.println("Numbers: " + numbers);
			        System.out.println("Special Characters: " + specialCharacters);
			}
			
		}
	

