package aru;

import java.util.Date;

public abstract class  Tej
{
    public final int LITER = 4;
    public final int FELLITER = 2;
    public final int POHAR = 1;
    public final double ZSIROS = 6;
    public final double FELZSIROS = 3;

    protected long vonalKod;
    protected int urtartalom;
    protected String gyarto;
    protected Date szavatossagiIdo;
    protected double zsirtartalom;
    protected long ar;
    public Tej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar)
    {
        this.ar = ar;
        this.gyarto = gyarto;
        this.szavatossagiIdo = szavatossagiIdo;
        this.urtartalom = urtartalom;
        this.zsirtartalom = zsirtartalom;
        this. vonalKod = vonalKod;
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
    public long getAr()
    {
        return ar;
    }
    public long getVonalKod()
    {
        return vonalKod;
    }
    public String toString()
    {

        StringBuilder tejAdatok = new StringBuilder();
        tejAdatok.append("A tej ára:\t");
        tejAdatok.append(getAr() + "\n");
        tejAdatok.append("A tej űrtartalma:\t" + getUrtartalom() + "\n");
        tejAdatok.append("A tej lejárati dátuma:\t" + getSzavatossagiIdo() + "\n");
        tejAdatok.append("A tej zsírtartalma:\t" + getZsirtartalom() + "\n");
        return tejAdatok.toString();
    }
}
