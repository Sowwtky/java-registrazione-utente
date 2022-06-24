package jana60;

public class Utente {

	//attributi
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private int eta;
	
	//costruttore 
	public Utente (String nome, String cognome, String email, String password, int eta) throws Exception {
		
		this.nome=nome;
		this.cognome=cognome;
		this.email=email;
		this.password=password;
		this.eta=eta;
		
		this.passwordValida();
		this.etaValida();
		this.emailValida();
	}

	//metodi per validare
	private void emailValida () throws Exception {
		if (!(email.contains("@") && email.contains("."))) {
			throw new Exception("La mail deve contenere una chiocciola(@) e un punto(.)");
		}
	}
	
	private void etaValida() throws Exception {
		if (eta < 18) {
			throw new Exception("Devi essere maggiorenne per registrarti");
		}
	}
	
	private void passwordValida() throws Exception {
	
		if (password.length() < 8 || password.length() > 12) {
			throw new Exception("La password deve essere compresa tra 8 e 12 caratteri");
		} 
		
	}
	
	//metodo nome completo
	public String nomeCompleto() {
		return nome + " " + cognome;
	}	
	
	//getter e setter
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Nome utente: " + nomeCompleto() + "\nEmail: " + getEmail() + "\nPassword: " + getPassword() + "\nEtá: " + getEta(); 
	}
	
	//override 
	
	
	
}
