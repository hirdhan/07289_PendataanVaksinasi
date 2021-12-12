package Model07289;

import Entity07289.PendudukEntity0728907289;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PendudukModel07289 extends ModelAbstract07289 {
    private String sql;

    public void insertData(PendudukEntity0728907289 pendudukEntity07289){
        try{
            sql = "INSERT INTO penduduk(nik, nama, alamat, noTelp, dosis, jns_vaksin)" +
                    "VALUE(?,?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, pendudukEntity07289.getNik());
            stat.setString(2, pendudukEntity07289.getNama());
            stat.setString(3, pendudukEntity07289.getAlamat());
            stat.setString(4, pendudukEntity07289.getNoTelp());
            stat.setString(5, pendudukEntity07289.getDosis());
            stat.setString(6, pendudukEntity07289.getJns_vaksin());
            stat.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
 }
    public void updateDosis(String dosis, int id){
        try{
            sql = "UPDATE penduduk SET dosis = ? WHERE id = ? ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, dosis);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows+" row(s) updated ");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public ArrayList<PendudukEntity0728907289> getPenduduk(int id){
        ArrayList<PendudukEntity0728907289> arrPenduduk = new ArrayList<>();

        try{
            sql = "SELECT * FROM penduduk where id = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                PendudukEntity0728907289 pendudukEntity0728907289 = new PendudukEntity0728907289();
                pendudukEntity0728907289.setId(rs.getInt("id"));
                pendudukEntity0728907289.setNama(rs.getString("nama"));
                pendudukEntity0728907289.setAlamat(rs.getString("alamat"));
                pendudukEntity0728907289.setNoTelp(rs.getString("noTelp"));
                pendudukEntity0728907289.setNik(rs.getString("nik"));
                pendudukEntity0728907289.setDosis(rs.getString("dosis"));
                pendudukEntity0728907289.setJns_vaksin(rs.getString("jns_vaksin"));
                arrPenduduk.add(pendudukEntity0728907289);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return arrPenduduk;
    }

    public ArrayList<PendudukEntity0728907289> getPenduduk(){
        ArrayList<PendudukEntity0728907289> arrPenduduk = new ArrayList<>();

        try{
            sql = "SELECT * FROM penduduk";
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                PendudukEntity0728907289 pendudukEntity0728907289 = new PendudukEntity0728907289();
                pendudukEntity0728907289.setId(rs.getInt("id"));
                pendudukEntity0728907289.setNama(rs.getString("nama"));
                pendudukEntity0728907289.setAlamat(rs.getString("alamat"));
                pendudukEntity0728907289.setNoTelp(rs.getString("noTelp"));
                pendudukEntity0728907289.setNik(rs.getString("nik"));
                pendudukEntity0728907289.setDosis(rs.getString("dosis"));
                pendudukEntity0728907289.setJns_vaksin(rs.getString("jns_vaksin"));
                arrPenduduk.add(pendudukEntity0728907289);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return arrPenduduk;
    }

    @Override
    public void updatenoTelp(String noTelp, int id) {
        try{
            sql = "UPDATE penduduk SET noTelp = ? WHERE id = ? ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, noTelp);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows+" row(s) updated ");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateNoTelp(String noTelp, int id){
        try{
            sql = "UPDATE penduduk SET noTelp = ? WHERE id = ? ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, noTelp);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows+" row(s) updated ");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int cekData(String nik){
        int cek = 0;
        try{
            sql = "SELECT * FROM penduduk WHERE nik = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,nik);
            ResultSet rs = stat.executeQuery();

            if(rs.next()){
                cek = rs.getInt("id");
            }else {
                cek = 0;
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return cek;
    }
}
