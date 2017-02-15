package aru;

import java.util.Date;

public class TejFactory
{
    public Tej getTej(String tejType, Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar)
    {
        if (tejType.equals("tartós"))
        {
            return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom, ar);
        }
        else if (tejType.equals("féltartós"))
        {
            return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom, ar);
        }
        else return null;
    }
}
