package tdevteam.model;

public class role {
	private int idRole;
	private String tenRole;
	
	public role(){}

	public role(int idRole, String tenRole) {
		super();
		this.idRole = idRole;
		this.tenRole = tenRole;
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getTenRole() {
		return tenRole;
	}

	public void setTenRole(String tenRole) {
		this.tenRole = tenRole;
	}
	
	
	
}
