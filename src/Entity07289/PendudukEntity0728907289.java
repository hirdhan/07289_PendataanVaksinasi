package Entity07289;

public class PendudukEntity0728907289 extends UserEntityAbstract07289 {
    public String nik, dosis, jns_vaksin;

    public PendudukEntity0728907289(String nik, String nama, String alamat, String noTelp, String dosis, String jns_vaksin){
        super(nama, alamat, noTelp);
        this.nik = nik;
        this.dosis = dosis;
        this.jns_vaksin = jns_vaksin;
    }

    public PendudukEntity0728907289(int id, String nama, String alamat, String noTelp, String nik, String dosis, String jns_vaksin) {
        super(nama, alamat, noTelp, id);
        this.nik = nik;
        this.dosis = dosis;
        this.jns_vaksin = jns_vaksin;
    }
    public PendudukEntity0728907289(){}

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getJns_vaksin() {
        return jns_vaksin;
    }

    public void setJns_vaksin(String jns_vaksin) {
        this.jns_vaksin = jns_vaksin;
    }
}
