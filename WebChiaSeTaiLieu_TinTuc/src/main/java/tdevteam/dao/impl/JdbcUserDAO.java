package tdevteam.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import tdevteam.dao.userDAO;
import tdevteam.model.user;

public class JdbcUserDAO implements userDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insert(user us) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO user " +
				"(tenUser, mail, matKhau, sdt, diaChi) VALUES (?, ?, ?, ?, ?)";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, us.getTenUser());
			ps.setString(2, us.getMail());
			ps.setString(3, us.getSdt());
			ps.setString(4, us.getMatKhau());
			ps.setString(5, us.getDiaChi());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	@Override
	public user findByUserId(int idUser) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM user WHERE idUser = ?";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idUser);
			user us = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				us = new user(
					rs.getInt("idUser"),
					rs.getString("tenUser"),
					rs.getString("mail"),
					rs.getString("matKhau"),
					rs.getString("sdt"),
					rs.getString("diaChi")
				);
			}
			rs.close();
			ps.close();
			return us;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	
}
