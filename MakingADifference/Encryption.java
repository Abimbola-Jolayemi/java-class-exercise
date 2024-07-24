public class Encryption{

	public String encryptInteger(String number){
		int myNumber = Integer.parseInt(number);

		if (myNumber < 0){
		   throw new IllegalArgumentException("Invalid Input!!!");
		}

		String stringNumber = String.format("%4d", myNumber);
		   char numberChar1 = stringNumber.charAt(0);
		   char numberChar2 = stringNumber.charAt(1);
		   char numberChar3 = stringNumber.charAt(2);
		   char numberChar4 = stringNumber.charAt(3);

		   String stringnumChar1 = String.valueOf(numberChar1);
		   String stringnumChar2 = String.valueOf(numberChar2);
		   String stringnumChar3 = String.valueOf(numberChar3);
		   String stringnumChar4 = String.valueOf(numberChar4);

		   int digit1 = Integer.parseInt(stringnumChar1);
		   int digit2 = Integer.parseInt(stringnumChar2);
		   int digit3 = Integer.parseInt(stringnumChar3);
		   int digit4 = Integer.parseInt(stringnumChar4);

		   int newDigit1 = (digit3 + 7) % 10;
		   int newDigit2 = (digit4 + 7) % 10;
		   int newDigit3 = (digit1 + 7) % 10;
		   int newDigit4 = (digit2 + 7) % 10;

		   int encryptedData = (newDigit1 * 1000) + (newDigit2 * 100) + (newDigit3 * 10) + (newDigit4);
		
	String stringEncryptedData = String.format("%4d", encryptedData);
		return stringEncryptedData;
	}


	public String decryptInteger(String number){
		int myNumber = Integer.parseInt(number);

		if (myNumber < 0){
		   throw new IllegalArgumentException("Invalid input!!!");
		}

		String stringNumber = String.format("%4d", myNumber);
		   char numberChar1 = stringNumber.charAt(0);
		   char numberChar2 = stringNumber.charAt(1);
		   char numberChar3 = stringNumber.charAt(2);
		   char numberChar4 = stringNumber.charAt(3);

		   String stringnumChar1 = String.valueOf(numberChar1);
		   String stringnumChar2 = String.valueOf(numberChar2);
		   String stringnumChar3 = String.valueOf(numberChar3);
		   String stringnumChar4 = String.valueOf(numberChar4);

		   int digit1 = Integer.parseInt(stringnumChar1);
		   int digit2 = Integer.parseInt(stringnumChar2);
		   int digit3 = Integer.parseInt(stringnumChar3);
		   int digit4 = Integer.parseInt(stringnumChar4);

		   int newDigit1 = (digit3 + 3) % 10;
		   int newDigit2 = (digit4 + 3) % 10;
		   int newDigit3 = (digit1 + 3) % 10;
		   int newDigit4 = (digit2 + 3) % 10;

		   int decryptedData = (newDigit1 * 1000) + (newDigit2 * 100) + (newDigit3 * 10) + (newDigit4);

		String stringDecryptedData = String.format("%4d", decryptedData);
		return stringDecryptedData;
	}
}