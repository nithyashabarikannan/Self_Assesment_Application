import java.sql.*;
public class JDBC {
  public static void main(String args[]) {
  Connection con = null;
  Statement st = null;
  ResultSet rs = null;
  String url = "jdbc:oracle:thin:@localhost:1521:XE";
  String driver = "oracle.jdbc.OracleDriver";
  String user = "SCOTT";   String pass = "scott";
  try {
  Class.forName(driver);
  con = DriverManager.getConnection(url , user, pass);   
  con.setAutoCommit(false);   
  st = con.createStatement();
  String sql = "select * from disease";   
  rs = st.executeQuery(sql);
  System.out.println("DID\t    DNAME\t    PRECAU\t\t\t\t\t\t\t      OCCUR\t\t\t\t\t\t     RISKFAC");
  while (rs.next()) {
  System.out.print(rs.getString(1) + " \t");
  System.out.print(rs.getString(2) + " \t");
  System.out.println(rs.getDate(3) + "\t");
  System.out.print(rs.getString(4) + " \t");
  System.out.print(rs.getString(5) + " \t");
  }
  } catch (Exception e) {
  System.out.println(e);
  }
  }
} 
