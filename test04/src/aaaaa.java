

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class aaaaa {
	
	public String id;
	public String name;
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) throws Exception {
		
		Connection con = DBUtil.getConnection();
		
		PreparedStatement pStmt = con.prepareStatement("SELECT * FROM subsub");
		
		ResultSet rs = pStmt.executeQuery();
		
		aaaaa a = new aaaaa();
		
		while(rs.next()){
			a.setId(rs.getString(1));
			a.setName(rs.getString(2));
			
			System.out.println(a.getId() +"\t/\t"+ a.getId());
		}
		
		con.close();
		pStmt.close();
		rs.close();

	}

}
