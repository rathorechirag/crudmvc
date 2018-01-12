package com.datadao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.database.Database;
import com.loginmodel.Login;
import com.loginmodel.Loginmodel;


public class Datadao implements Datadaoi {

	
	Connection con=null;
	
	Database d=new Database();
	public String insert(Loginmodel model) {
		// TODO Auto-generated method stub
		
		
		
		
		try {
			con=d.gconnection();
		
			PreparedStatement psmt=con.prepareStatement("insert into myta(username,password,address,email,gender,language,city)values(?,?,?,?,?,?,?)");
			
			psmt.setString(1, model.getUsername());
			psmt.setString(2, model.getPassword());
			psmt.setString(3, model.getAddress());
			psmt.setString(4, model.getEmail());
			psmt.setString(5, model.getGender());
			psmt.setString(6, model.getLang());
			psmt.setString(7, model.getCity());
			
			int i=psmt.executeUpdate();
			
			if(i>0)
			{
				return "done" ;
			}
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		return null;
	}
	public List<Loginmodel> selectall() {
		// TODO Auto-generated method stub
		
		try {
			con=d.gconnection();
			Loginmodel model=null;
			ArrayList<Loginmodel>al=new ArrayList<Loginmodel>();
			PreparedStatement psmt=con.prepareStatement("select * from myta");
			ResultSet rs=psmt.executeQuery();
			while(rs.next())
			{
				model=new Loginmodel();
				
				model.setId(rs.getInt("id"));
				model.setUsername(rs.getString("username"));
				model.setPassword(rs.getString("password"));
				model.setAddress(rs.getString("address")); 
				model.setGender(rs.getString("gender"));
				model.setEmail(rs.getString("email"));
				model.setLang(rs.getString("language"));
				model.setCity(rs.getString("city"));
				al.add(model);
			}
			return al;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return null;
	}
	public Loginmodel fetch(int id) {
		// TODO Auto-generated method stub
		
		try {
			con=d.gconnection();
			
			Loginmodel model=null;
			
			PreparedStatement psmt=con.prepareStatement("select * from myta  where id=?");
			
			psmt.setInt(1, id);
			ResultSet rs=psmt.executeQuery();
			while(rs.next())
			{
				model=new Loginmodel();
				
				model.setId(rs.getInt("id"));
				model.setUsername(rs.getString("username"));
				model.setPassword(rs.getString("password"));
				model.setAddress(rs.getString("address")); 
				model.setGender(rs.getString("gender"));
				model.setEmail(rs.getString("email"));
				model.setLang(rs.getString("language"));
				model.setCity(rs.getString("city"));
				
			}
			
			return model;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public String update(Loginmodel model) {
		// TODO Auto-generated method stub
		
		try {
			con=d.gconnection();
PreparedStatement psmt=con.prepareStatement("update myta set username=?,password=?,address=?,email=?,gender=?,language=?,city=? where id=?");
			
			psmt.setString(1, model.getUsername());
			psmt.setString(2, model.getPassword());
			psmt.setString(3, model.getAddress());
			psmt.setString(4, model.getEmail());
			psmt.setString(5, model.getGender());
			psmt.setString(6, model.getLang());
			psmt.setString(7, model.getCity());
			psmt.setInt(8, model.getId());
			int i=psmt.executeUpdate();
			
			if(i>0)
			{
				return "done" ;
			}
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public String delete(int id) {
		// TODO Auto-generated method stub
		
		try {
			con=d.gconnection();
			PreparedStatement psmt=con.prepareStatement("delete from myta where id=?");
			psmt.setInt(1, id);
			int i=psmt.executeUpdate();
			
			if(i>0)
			{
				return "done" ;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	
	

}
