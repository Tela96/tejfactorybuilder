package bolt;

import bolt.aru.Sajt;
import bolt.aru.Szappan;
import bolt.aru.Tej;
import bolt.aru.tej.FeltartosTej;
import bolt.aru.tej.TartosTej;

import java.util.Date;

public class BoltFactory
{
    public Tej ujTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom)
    {
        return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
    }
    public Tej ujFeltartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom)
    {
        return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
    }
    public Tej ujFelzsirosTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo)
    {
        return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, Tej.FELZSIROS);
    }
    public Tej ujZsirosTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo)
    {
        return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, Tej.ZSIROS);
    }
    public Tej ujFelzsirosFeltartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo)
    {
        return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, Tej.FELZSIROS);
    }
    public Tej ujZsirosFeltartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo)
    {
        return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, Tej.ZSIROS);
    }
    public Tej ujFelzsirosLiteresTartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo)
    {
        return new TartosTej(vonalKod, Tej.LITER ,gyarto, szavatossagiIdo ,Tej.FELZSIROS);
    }
    public Tej ujZsirosLiteresTartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo)
    {
        return new TartosTej(vonalKod, Tej.LITER ,gyarto, szavatossagiIdo ,Tej.ZSIROS);
    }
    public Tej ujFelzsirosLiteresFelartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo)
    {
        return new FeltartosTej(vonalKod, Tej.LITER ,gyarto, szavatossagiIdo ,Tej.FELZSIROS);
    }
    public Tej ujZsirosLiteresFelartosTej(Long vonalKod, String gyarto, Date szavatossagiIdo)
    {
        return new FeltartosTej(vonalKod, Tej.LITER ,gyarto, szavatossagiIdo ,Tej.ZSIROS);
    }

    public Sajt ujSajt(Long vonalKod, double suly, String gyarto, Date szavatossagiIdo, double zsirtartalom)
    {
        return new Sajt(vonalKod, gyarto, szavatossagiIdo, suly, zsirtartalom);
    }
    public Szappan ujSzappan(Long vonalkod, String gyarto, char mosohatas)
    {
        return new Szappan(vonalkod, gyarto, mosohatas);
    }
    public Szappan ujAMosohatasuSzappan(Long vonalkod, String gyarto)
    {
        return new Szappan(vonalkod, gyarto, 'A');
    }
}
