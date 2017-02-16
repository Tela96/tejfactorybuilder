package bolt.aru;

import bolt.Aru;

import java.util.Date;

public abstract class Elelmiszer extends Aru
{
    protected Long vonalKod = null;
    protected String gyarto = null;
    protected Date szavatossagiIdo = null;

    public Elelmiszer(Long vonalKod, String gyarto, Date szavatossagiIdo)
    {
        this.gyarto = gyarto;
        this.szavatossagiIdo = szavatossagiIdo;
        this.vonalKod = vonalKod;
    }

    public boolean joMeg()
    {
        Date maiNap = new Date();
        return maiNap.before(szavatossagiIdo);
    }

    public Date getSzavatossagiIdo()
    {
        return szavatossagiIdo;
    }

    public long getVonalKod()
    {
        return vonalKod;
    }
    public String getGyarto()
    {
        return gyarto;
    }
    public String toString()
    {

        StringBuilder elelmiszerAdatok = new StringBuilder();
        elelmiszerAdatok.append("A termék vonalkódja :\t");
        elelmiszerAdatok.append(getVonalKod());
        elelmiszerAdatok.append("\n");
        elelmiszerAdatok.append("A termék gyártója:\t");
        elelmiszerAdatok.append(getGyarto());
        elelmiszerAdatok.append("\n");
        elelmiszerAdatok.append("A termék lejárati dátuma:\t" + getSzavatossagiIdo() + "\n");
        return elelmiszerAdatok.toString();

    }
}
