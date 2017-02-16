package bolt.aru;

import java.util.Date;

public abstract class Tej extends Elelmiszer
{
    public static final int LITER = 4;
    public static final int FELLITER = 2;
    public static final int POHAR = 1;
    public static final double ZSIROS = 6;
    public static final double FELZSIROS = 3;

    protected int urtartalom = 0;
    protected double zsirtartalom = 0.00;
    public Tej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom)
    {
        super(vonalKod, gyarto, szavatossagiIdo);
        this.urtartalom = urtartalom;
        this.zsirtartalom = zsirtartalom;
    }
    public boolean joMeg()
    {
        Date maiNap = new Date();
        return maiNap.before(szavatossagiIdo);
    }
    public int getUrtartalom()
    {
        return urtartalom;
    }
    public String getGyarto()
    {
        return gyarto;
    }
    public Date getSzavatossagiIdo()
    {
        return szavatossagiIdo;
    }
    public double getZsirtartalom()
    {
        return zsirtartalom;
    }
    public long getVonalKod()
    {
        return vonalKod;
    }
    public String toString()
    {

        StringBuilder tejAdatok = new StringBuilder();
        tejAdatok.append("A tej ára:\t");
        tejAdatok.append("A tej űrtartalma:\t" + getUrtartalom() + "\n");
        tejAdatok.append("A tej lejárati dátuma:\t" + getSzavatossagiIdo() + "\n");
        tejAdatok.append("A tej zsírtartalma:\t" + getZsirtartalom() + "\n");
        return tejAdatok.toString();
    }
}
