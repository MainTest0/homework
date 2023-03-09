package ch04;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BuyDAO implements IBuyDAO{
	
	private DBclient dbClient;

	public BuyDAO() {
		dbClient = new DBclient();
	}
	
	public ArrayList<BuyDTO> select() {
		ArrayList<BuyDTO> list = new ArrayList<>();
		
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM buyTBL ");
			
			while(rs.next()) {
				String userName = rs.getString("userName");
				String prodName = rs.getString("prodName");
				int price = rs.getInt("price");
				int amount= rs.getInt("amount");
				
				BuyDTO dao = new BuyDTO(userName, prodName, price, amount);
				list.add(dao);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return list;
		
	}

	@Override
	public int insert(BuyDTO dto) {
		
		String sqlFormat = "INSERT INTO "
				+ "buyTBL(userName, prodName, price, amount) "
				+ "VALUES('%s', '%s', %d, %d) ";
		
		String sql = String.format(sqlFormat, dto.getUserName(), 
				dto.getProdName(), dto.getPrice(), dto.getAmount());
		
		int resultRowCount = 0;
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			resultRowCount = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.err.println("확인");
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return resultRowCount;
	}

	@Override
	public int update(BuyDTO dto, String targetBuyName, 
			String targetBuyProd) {

		String sqlFormat = "UPDATE buyTBL "
				+ "	SET prodName = '%s', "
				+ "        price = %d, "
				+ "        amount = %d "
				+ "WHERE userName = '%s' "
				+ "	AND prodName = '%s' ";
		String sql = String.format(sqlFormat, dto.getProdName(), 
				dto.getPrice(), dto.getAmount(), targetBuyName, targetBuyProd);
		
		int resultRow = 0;
		
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			resultRow = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return resultRow;
	}

	@Override
	public int delete(String targetBuyProd) {

		String sqlFormat = "DELETE FROM buyTBL "
				+ "WHERE prodName = '%s'";
		
		String sql = String.format(sqlFormat, targetBuyProd);
		
		int row = 0;
		Connection conn = dbClient.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			row = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
		
	}
	
} // end of class
