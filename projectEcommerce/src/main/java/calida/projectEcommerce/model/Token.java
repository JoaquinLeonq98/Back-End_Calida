package calida.projectEcommerce.model;

public class Token {
	private final String accessToken;

	public Token(String accessToken) {
		this.accessToken = accessToken;
	}//constructor Token

	public String getAcessToken() {
		return accessToken;
	}//getAccessToken
}//class Token
//crea un objeto para regresar un token al usuario