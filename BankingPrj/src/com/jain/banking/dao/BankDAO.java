package com.jain.banking.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.jain.banking.dto.AccountInformationDTO;
import com.jain.banking.dto.BankInformationDTO;
import com.jain.banking.dto.CustomerDetailsDTO;
import com.jain.banking.jdbc.DataBaseSingleton;

public class BankDAO {

	//get Bank information from Oracle using JDBC
	public List getBankInformation() {
		System.out.println("DAO.getBankInformation begin!");
		Connection con = null;
		ResultSet rs = null;
		List dto = null;

		try {
			dto = new ArrayList<BankInformationDTO>();
			con = getConnection();
			String sqlCommand = "select * from BANKINFORMATION";
			Statement st = con.createStatement();
			rs = st.executeQuery(sqlCommand);

			while (rs.next()) {
				BankInformationDTO dto_instance = new BankInformationDTO();
				dto_instance.setBankId(rs.getInt("ID"));
				dto_instance.setBankName(rs.getString("NAME"));
				dto_instance.setBankAddress(rs.getString("Address"));
				dto_instance.setBankPhone(rs.getString("PHONE"));

				dto.add(dto_instance);
			}

		} catch (SQLException ex) {
			ex.getStackTrace();
		} finally {
			try {
				rs.close();
				con.close();
			} catch (SQLException ex) {
				ex.getStackTrace();
			}
		}
		System.out.println("DAO.getBankInformation end!");

		return dto;
	}
	
	//get account information using JDBC
	public List getAccountInformation() {
		System.out.println("DAO.getAccountInformation begin!");
		Connection con = null;
		ResultSet rs = null;
		List dto = null;

		try {
			dto = new ArrayList<AccountInformationDTO>();
			con = getConnection();
			String sqlCommand = "select * from AccountInformation";
			Statement st = con.createStatement();
			rs = st.executeQuery(sqlCommand);

			while (rs.next()) {
				AccountInformationDTO dto_instance = new AccountInformationDTO();
				dto_instance.setId((rs.getInt(1)));
				dto_instance.setName((rs.getString(2)));

				dto.add(dto_instance);
			}

		} catch (SQLException ex) {
			ex.getStackTrace();
		} finally {
			try {
				rs.close();
				con.close();
			} catch (SQLException ex) {
				ex.getStackTrace();
			}
		}
		System.out.println("DAO.getAccountInformation end!");

		return dto;
	}
	
	//get customer details using JDBC
	public List getCustomerDetailsInformation() {
		System.out.println("DAO.getCustomerDetailsInformation begin!");
		Connection con = null;
		ResultSet rs = null;
		List dto = null;

		try {
			dto = new ArrayList<CustomerDetailsDTO>();
			con = getConnection();
			String sqlCommand = "select cc.*,bb.name,bb.address,bb.phone,aa.type_name from BANKINFORMATION bb,ACCOUNTINFORMATION aa,CUSTOMERINFORMATION cc,CUSTOMERACCOUNT ca where bb.id=ca.bank_id and aa.type_id=ca.account_id and cc.id=ca.customer_id";
			Statement st = con.createStatement();
			rs = st.executeQuery(sqlCommand);

			while (rs.next()) {
				CustomerDetailsDTO dto_instance = new CustomerDetailsDTO();
				dto_instance.setCustomerId(rs.getInt(1));
				dto_instance.setFirstName(rs.getString(2));
				dto_instance.setLastName(rs.getString(3));
				dto_instance.setUserName(rs.getString(4));
				dto_instance.setPassword(rs.getString(5));
				dto_instance.setEmail(rs.getString(6));
				dto_instance.setBankName(rs.getString(7));
				dto_instance.setBankAddress(rs.getString(8));
				dto_instance.setBankPhone(rs.getString(9));
				dto_instance.setAccountType(rs.getString(10));

				dto.add(dto_instance);
			}

		} catch (SQLException ex) {
			ex.getStackTrace();
		} finally {
			try {
				rs.close();
				con.close();
			} catch (SQLException ex) {
				ex.getStackTrace();
			}
		}
		System.out.println("DAO.getCustomerDetailsInformation end!");

		return dto;
	}
	
	//build the connection with database
	private Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(DataBaseSingleton.getInstance().getProperties(
					"DRIVER"));
			con = DriverManager.getConnection(DataBaseSingleton.getInstance()
					.getProperties("URL"), DataBaseSingleton.getInstance()
					.getProperties("USER"), DataBaseSingleton.getInstance()
					.getProperties("PASSWORD"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}
}
