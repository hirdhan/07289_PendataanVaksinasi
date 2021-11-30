package Model;
import Helper.KoneksiDb;
import Entity.SiswaEntity;
import java.util.ArrayList;

public class SiswaModel {
    protected KoneksiDb koneksi = new KoneksiDb();
    public ArrayList<SiswaEntity> Siswa = new ArrayList<SiswaEntity>();
    
    public SiswaModel(){
        koneksi.getconnection();
    }

    public void toSingkron(){
        String sql = "SELECT * FROM siswa";

        try {
            koneksi.rs = koneksi.stmt.executeQuery(sql);

            while (koneksi.rs.next()) {
                Siswa.add(new SiswaEntity(koneksi.rs.getString("Nim"), koneksi.rs.getString("Nama"), koneksi.rs.getString("Alamat"), koneksi.rs.getString("TglLahir")));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Insert(String Nim, String Nama, String Alamat, String TglLahir){
        Siswa.add(new SiswaEntity(Nim, Nama, Alamat, TglLahir));
        String sql = "INSERT INTO siswa (Nama, Alamat, TglLahir, Nim) VALUE('%s', '%s','%s', '%s')";
        try {
        sql = String.format(sql, Nama, Alamat, TglLahir, Nim);
        koneksi.stmt.execute(sql);
        } catch (Exception e){
            System.out.println("Data Gagal di buat.\n");
            e.printStackTrace();
        }
    }

    public void Display(){
        System.out.println("+--------------------------------+");
        System.out.println("|      DATA SISWA TERDAFTAR      |");
        System.out.println("+--------------------------------+");
        for(int i = 0; i < Siswa.size();i++){
            System.out.println(String.format("|Nim : %s \n|Nama : %s \n|Alamat : %s \n|Tanggal Lahir : %s \n+--------------------------------+",Siswa.get(i).getNim(), Siswa.get(i).getNama(), Siswa.get(i).getAlamat(),Siswa.get(i).getTglLahir()));
        }
    }

    public void Update(String Nim, String Nama, String Alamat){
        try {
            String sql = "UPDATE siswa SET Nama='%s', Alamat='%s' WHERE Nim=%s";
            sql = String.format(sql, Nama, Alamat, Nim);
            koneksi.stmt.execute(sql);
            for(int i = 0; i < Siswa.size();i++){
                Siswa.remove(i);
            }
            toSingkron();
        } catch (Exception e) {
            System.out.println("Update Data Gagal.");
            e.printStackTrace();
        }
    }

    public void Delete(String Nim){
        try {
            String sql = String.format("DELETE FROM siswa WHERE Nim=%s", Nim);
            koneksi.stmt.execute(sql);
            System.out.println("Data telah terhapus...");
            for(int i = 0; i < Siswa.size();i++){
                Siswa.remove(i);
            }
            toSingkron();
            
        } catch (Exception e) {
            e.printStackTrace();
            }
        }
    }   
