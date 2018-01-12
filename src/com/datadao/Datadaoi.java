package com.datadao;

import java.util.List;

import com.loginmodel.Login;
import com.loginmodel.Loginmodel;

public interface Datadaoi {
	
	
	public String insert(Loginmodel model);
	public List<Loginmodel >selectall();
	public Loginmodel fetch(int id);
	public String update(Loginmodel model);
	public String delete(int id);
	

}
