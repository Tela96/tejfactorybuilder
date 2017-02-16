package bolt.aru;

import java.util.Date;

public class Sajt extends Elelmiszer
{
    protected double suly;
    protected double zsirtartalom;
    public Sajt(Long vonalKod, String gyarto, Date szavatossagiIdo, double suly, double zsirtartalom)
    {
        super(vonalKod, gyarto, szavatossagiIdo);
        this.suly = suly;
        this.zsirtartalom = zsirtartalom;
    }

    public double getSuly()
    {
        return suly;
    }
    public double getZsirtartalom()
    {
        return zsirtartalom;
    }
}
