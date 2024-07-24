import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionTest{
	
	@Test
	public void testThatChecksForAnEncryptedInteger(){

		Encryption encryption = new Encryption();
		
		String encryptedInteger = encryption.encryptInteger("0149");

		assertEquals("1632", encryptedInteger);
	}

	@Test
   	 public void testEncryptionThrowsExceptionForNegativeInteger(){
        
		Encryption encryption = new Encryption();
        
		assertThrows(IllegalArgumentException.class, () -> encryption.encryptInteger("-0149");
    }

	@Test
	public void testThatChecksForADecryptedInteger(){

		Encryption encryption = new Encryption();
		
		String decryptedInteger = encryption.decryptInteger("3412");

		assertEquals("4567", decryptedInteger);
	}

	

    	@Test
    	public void testDecryptionThrowsExceptionForNegativeInteger(){
        
		Encryption encryption = new Encryption();

        	assertThrows(IllegalArgumentException.class, () -> encryption.decryptInteger("-6216");
}