package Helper07289;
import java.sql.Connection;
import java.sql.DriverManager;

public class KoneksiDb07289 {
        public static Connection getconection(){
            Connection conn=null;
            String driver= "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/db_pendataanvaksinasi";
            String user = "root";
            String pass = "";
            try{
                Class.forName(driver);
                conn= DriverManager.getConnection(url,user,pass);
                System.out.println("Berhasil koneksi database");
            }catch (Exception e){
                System.out.println("Gagal Koneksi Database");
                e.printStackTrace();
            }
            return conn;

        }

    public static void main(String[] args) {
        Connection conn = KoneksiDb07289.getconection();
    }
}
