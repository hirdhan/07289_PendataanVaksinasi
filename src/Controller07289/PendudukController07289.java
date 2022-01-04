package Controller07289;

import Entity07289.PendudukEntity0728907289;

import javax.swing.table.DefaultTableModel;
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
    public ArrayList<PendudukEntity0728907289> getDataPenduduk(String nik) {
        return AllObjectModel07289.pendudukModel.getPenduduk(nik);
    }
    public ArrayList<PendudukEntity0728907289> getDataPenduduk() {
        return AllObjectModel07289.pendudukModel.getPenduduk();
    }
    public int CekData(String nik){
        int cek = AllObjectModel07289.pendudukModel.cekData(nik);
        return cek;
    }
    public DefaultTableModel daftarPenduduk(){
        DefaultTableModel dataDaftarPenduduk = new DefaultTableModel();
        Object[] kolom = {"ID", "NIK", "NAMA", "ALAMAT", "NOTELP", "DOSIS", "JENIS VAKSIN"};
        dataDaftarPenduduk.setColumnIdentifiers(kolom);
        int size = getDataPenduduk().size();
        for(int i = 0; i < size; i++ ){
            Object[] data = new Object[7];
            data[0] = AllObjectModel07289.pendudukModel.getPenduduk().get(i).getId();
            data[1] = AllObjectModel07289.pendudukModel.getPenduduk().get(i).getNik();
            data[2] = AllObjectModel07289.pendudukModel.getPenduduk().get(i).getNama();
            data[3] = AllObjectModel07289.pendudukModel.getPenduduk().get(i).getAlamat();
            data[4] = AllObjectModel07289.pendudukModel.getPenduduk().get(i).getNoTelp();
            data[5] = AllObjectModel07289.pendudukModel.getPenduduk().get(i).getDosis();
            data[6] = AllObjectModel07289.pendudukModel.getPenduduk().get(i).getJns_vaksin();
            dataDaftarPenduduk.addRow(data);
        }
        return dataDaftarPenduduk;
    }

}
