package tdevteam.model;

public class userrole {
	private int idUserRole;
	private int idUser;
	private int idRole;
	
	public userrole(){}

	public userrole(int idUserRole, int idUser, int idRole) {
		super();
		this.idUserRole = idUserRole;
		this.idUser = idUser;
		this.idRole = idRole;
	}

	public int getIdUserRole() {
		return idUserRole;
	}

	public void setIdUserRole(int idUserRole) {
		this.idUserRole = idUserRole;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	
	
}
