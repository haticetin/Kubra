package Programming1;

public class EmailAdress {
	
	String email;
	
	public EmailAdress(final String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return this.email;
	}
	
	public String getLocalPart() {
		return this.email.split("@")[0];
	}
	
	public String getDomainPart() {
		return this.email.split("@")[1];
	}
	
	public String[] getDomainParts() {
		return (this.email.split("@")[1]).split(".");
	}
	
	

}
