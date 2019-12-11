import java.sql.*;
import java.lang.*;
class PrepredStatement
{
	public static void main(String [] args) throws Exception
	{
		
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");	
		
			PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?)");
			pstmt.setInt(1, 109);
			pstmt.setString(2,"Ankita");
			pstmt.setInt(3, 3000);
		
			int i=pstmt.executeUpdate();
			System.out.println(i);
			
			con.close();
	} 	
}
