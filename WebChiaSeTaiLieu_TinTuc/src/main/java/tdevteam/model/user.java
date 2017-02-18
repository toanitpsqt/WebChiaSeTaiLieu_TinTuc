package tdevteam.model;

public class user {
	private int idUser;
	private String tenUser;
	private String mail;
	private String matKhau;
	private String sdt;
	private String diaChi;
	
	public user(){}
	
	public user(String tenUser, String mail, String matKhau, String sdt, String diaChi) {
		super();
		this.tenUser = tenUser;
		this.mail = mail;
		this.matKhau = matKhau;
		this.sdt = sdt;
		this.diaChi = diaChi;
	}

	public user(int idUser, String tenUser, String mail, String matKhau, String sdt, String diaChi) {
		super();
		this.idUser = idUser;
		this.tenUser = tenUser;
		this.mail = mail;
		this.matKhau = matKhau;
		this.sdt = sdt;
		this.diaChi = diaChi;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getTenUser() {
		return tenUser;
	}

	public void setTenUser(String tenUser) {
		this.tenUser = tenUser;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	
}
