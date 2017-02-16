package bolt;

import bolt.aru.Tej;
import bolt.aru.tej.FeltartosTej;
import bolt.aru.tej.TartosTej;

import java.util.Date;

public class TejFactory
{
    public Tej ujTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar)
    {
        return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom, ar);
    }
    public Tej ujFeltartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar)
    {
        return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom, ar);
    }
}
