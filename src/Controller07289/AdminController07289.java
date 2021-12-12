package Controller07289;

import Entity07289.AdminEntity0728907289;

public class AdminController07289 {
    public void insertData(int id,String nip,String nama, String alamat, String password, String noTelp){
        AllObjectModel07289.adminModel07289.insertData(new AdminEntity0728907289(id,nip,nama,alamat,password,noTelp));
    }
    public void updatePassword(String password, int id){
        AllObjectModel07289.adminModel07289.updatePassword(password,id);
    }
    public void updateNoTelp(String noTelp, int id){
        AllObjectModel07289.adminModel07289.updateNoTelp(noTelp,id);
    }
    public int cekLogin(String nip, String password){
       int login = AllObjectModel07289.adminModel07289.cekLogin(nip,password);
       return login;
    }
    public void deleteData(int id){
        AllObjectModel07289.adminModel07289.deleteData(id);
    }
}
