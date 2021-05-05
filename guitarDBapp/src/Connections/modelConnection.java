package Connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import guitarDB.model;

public class modelConnection {
	private Connection connection;
	private colorConnection connection1;
	

	private final String Get_models = "SELECT * FROM model";
	
	public modelConnection() {
		connection = DBconnection.getConnection();
		connection1 = new colorConnection();
	}
	
	public List<model> displayGuitars() throws SQLException {
		ResultSet rs = connection.prepareStatement(Get_models).executeQuery();
		List<model> models = new ArrayList<model>();
		
		while (rs.next()) {
			models.add(add_colors(rs.getInt(1), rs.getString(3)));
		}
		return models;
		}
	public model getModelByID(int Serial_id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Get_models);
		ps.setInt(1, Serial_id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		return add_colors(rs.getInt(1), rs.getString(2));
	}
	
	private model add_colors(int id, String name) throws SQLException {
		return new model(id, name, connection1.getColorbyguitarID());

}

	
	}

	

	
	


