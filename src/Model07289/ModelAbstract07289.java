package Model07289;

import Helper07289.KoneksiDb07289;

import java.sql.Connection;

public abstract class ModelAbstract07289 {
    public Connection conn = KoneksiDb07289.getconection();

    public abstract void updatenoTelp(String noTelp,int id);

    public abstract void updateNoTelp(String noTelp, int id);
}
