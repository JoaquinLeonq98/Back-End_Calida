/*packages and imports*/
package calida.projectEcommerce.utils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHAUtils {
	public static String salt = "CALIDAMXESINCREIBLE_984";
	public static String createHash(String value) {
		String res = "";
		value += salt;
		try {
			MessageDigest msgDigest = MessageDigest.getInstance("SHA-256");
			msgDigest.update(value.getBytes());
			byte[]resultado = msgDigest.digest();
			int max = resultado.length;
			String tmp;
			for (int i=0; i<max; i++) {
	             tmp = Integer.toHexString(0xFF & resultado[i]);
	             res += (tmp.length()<2)?0+tmp:tmp;
	         }// for i
		}//try 
		catch(NoSuchAlgorithmException e) {
			System.out.println(e.toString());
		}//catch
	return res;
	}//createHash
	
	/*De la contraseña cifrada a la normal*/
	public static boolean verifyHash(String original, String hash){
		String res = createHash(original);
		return res.equalsIgnoreCase(hash);		
	}//verifyHash
	
	//Falta modificar add de usario, verificar con team que este libre el archivo para edicion
	
}//class SHAUtils
