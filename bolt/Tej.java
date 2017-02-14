package bolt;

import java.util.Date;

public class Tej
{
    private int urtartalom;
    private String gyarto;
    private Date szavatossagiIdo;
    private double zsirtartalom;
    private long ar;
    public Tej(int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar)
    {
        this.ar = ar;
        this.gyarto = gyarto;
        this.szavatossagiIdo = szavatossagiIdo;
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
    public long getAr()
    {
        return ar;
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
