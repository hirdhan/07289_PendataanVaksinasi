package Controller07289;

import Entity07289.PendudukEntity0728907289;

import java.util.ArrayList;

public class PendudukController07289 {

    public void insertData(String nik,String nama, String alamat, String noTelp, String dosis, String jns_vaksin){
        AllObjectModel07289.pendudukModel.insertData(new PendudukEntity0728907289(nik, nama, alamat, noTelp, dosis, jns_vaksin));
    }
    public void updateDosis(String dosis, int id){
        AllObjectModel07289.pendudukModel.updateDosis(dosis,id);
    }
    public void updateNoTelp(String noTelp, int id){
        AllObjectModel07289.pendudukModel.updateNoTelp(noTelp,id);
    }
    public ArrayList<PendudukEntity0728907289> getDataPenduduk(int id) {
        return AllObjectModel07289.pendudukModel.getPenduduk(id);
    }
    public ArrayList<PendudukEntity0728907289> getDataPenduduk() {
        return AllObjectModel07289.pendudukModel.getPenduduk();
    }
    public int CekData(String nik){
        int cek = AllObjectModel07289.pendudukModel.cekData(nik);
        return cek;
    }

}
