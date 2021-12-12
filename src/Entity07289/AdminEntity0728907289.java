package Entity07289;

public class AdminEntity0728907289 extends UserEntityAbstract07289 {
    private String nip, password;

    public AdminEntity0728907289(){
    }
    public AdminEntity0728907289(int id, String nip, String nama, String alamat, String password, String noTelp) {
        super(nama, alamat, noTelp, id);
        this.nip = nip;
        this.password = password;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

