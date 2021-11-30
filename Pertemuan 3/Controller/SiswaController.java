package Controller;
import Model.SiswaModel;

public class SiswaController {
    protected SiswaModel SiswaModel = new SiswaModel();
    public void Singkron(){
        SiswaModel.toSingkron();
    }

    public void Insert(String Nim, String Nama, String Alamat, String TglLahir){
        SiswaModel.Insert(Nim, Nama, Alamat, TglLahir);
    }

    public void Display(){
        SiswaModel.Display();
    }

    public void Update(String Nim, String Nama, String Alamat){
        SiswaModel.Update(Nim, Nama, Alamat);
    }

    public void Delete(String Nim){
        SiswaModel.Delete(Nim);
    }
}
