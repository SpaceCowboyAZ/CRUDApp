package Connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import guitarDB.color;
import guitarDB.model;

public class colorConnection {

	
	private Connection connection;
	private final String GET_COLORS = "SELECT * FROM colors WHERE id = ?";
	
	
	public colorConnection() {
		this.connection = DBconnection.getConnection();
	}
	
	public List<color> getColorbyguitarID() throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_COLORS);
		ps.setInt(1, 0);
		ResultSet rs = ps.executeQuery();
		List<color> colors = new ArrayList<color>();
		while (rs.next()) {
			colors.add(new color(rs.getInt(1), rs.getString(2), rs.getInt(3)));
		}
		return colors;
	}

	
}
