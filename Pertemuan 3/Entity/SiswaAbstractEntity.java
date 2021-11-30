package Entity;

public abstract class SiswaAbstractEntity {
    private String Nama;
    private String Alamat;
    private String TglLahir;
    public SiswaAbstractEntity(String Nama,String Alamat,String TglLahir){
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.TglLahir = TglLahir;
    }

    public String getNama() {
        return this.Nama;
    }
    public String getAlamat() {
        return this.Alamat;
    }
    public String getTglLahir() {
        return this.TglLahir;
    }

}
