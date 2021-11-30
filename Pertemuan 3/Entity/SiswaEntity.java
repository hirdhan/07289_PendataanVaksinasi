package Entity;

public class SiswaEntity extends SiswaAbstractEntity{
    protected String Nim;
    public SiswaEntity(String Nim, String Nama, String Alamat, String TglLahir){
        super(Nama,Alamat,TglLahir);
        this.Nim = Nim;
    }

    public String getNim() {
        return this.Nim;
    }
}
