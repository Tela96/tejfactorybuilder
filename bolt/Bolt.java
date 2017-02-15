package bolt;

import aru.Elelmiszer;
import aru.Sajt;
import aru.Tej;

import java.util.Hashtable;

public class Bolt
{
    private String nev;
    private String cim;
    private String tulajdonos;
    private Hashtable<Long, BoltBejegyzes> elelmiszerpult;

    public Bolt(String nev, String cim, String tulajdonos)
    {
        this.nev = nev;
        this.cim = cim;
        this.tulajdonos = tulajdonos;
        this.elelmiszerpult = new Hashtable<Long, BoltBejegyzes>();
    }
    public Bolt(String nev, String cim, String tulajdonos, Hashtable elelmiszerpult)
    {
        this.nev = nev;
        this.cim = cim;
        this.tulajdonos = tulajdonos;
        this.elelmiszerpult = elelmiszerpult;
    }

    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    public String getTulajdonos() {
        return tulajdonos;
    }
    private boolean vanMegAdottAru(Class c)
    {
        for (BoltBejegyzes b :elelmiszerpult.values())
        {
            Elelmiszer e = b.getElelmiszer();
            if (e.getClass().equals(c)) return true;
        }
        return false;
    }
    public boolean vanMegTej()
    {
        return vanMegAdottAru(Tej.class);
    }
    public boolean vanMegSajt()
    {
        return vanMegAdottAru(Sajt.class);
    }
    public Elelmiszer vasarolElelmiszer(Long vonalKod)
    {
        BoltBejegyzes bejegyzes = elelmiszerpult.get(vonalKod);
        Elelmiszer vasaroltElelmiszer = bejegyzes.getElelmiszer();
        bejegyzes.levonMennyiseg(1);
        return vasaroltElelmiszer;
    }
    public void  feltoltElelmiszerrel(Long vonalKod, long mennyiseg)
    {
        BoltBejegyzes bejegyzes = elelmiszerpult.get(vonalKod);
        bejegyzes.adMennyiseg(mennyiseg);

    }
    public void feltoltUjElelmiszerrel(Elelmiszer elelmiszer, long mennyiseg, long ar)
    {
        BoltBejegyzes bejegyzes = new BoltBejegyzes(elelmiszer, mennyiseg, ar);
        Elelmiszer ujElelmiszer = bejegyzes.getElelmiszer();
        long vonalKod = ujElelmiszer.getVonalKod();
        elelmiszerpult.put(vonalKod, bejegyzes);

    }
    protected class BoltBejegyzes
    {
        private Elelmiszer e;
        private long ar;
        private long mennyiseg;

        BoltBejegyzes(Elelmiszer e, long mennyiseg, long ar)
        {
            this.e = e;
            this.mennyiseg = mennyiseg;
            this.ar = ar;
        }

        public Elelmiszer getElelmiszer()
        {
            return e;
        }

        public void setElelmiszer(Elelmiszer e)
        {
            this.e = e;
        }

        public long getMennyiseg()
        {
            return mennyiseg;
        }

        public void setMennyiseg(long mennyiseg)
        {
            this.mennyiseg = mennyiseg;
        }

        public long getAr()
        {
            return ar;
        }

        public void setAr(long ar)
        {
            this.ar = ar;
        }

        public void adMennyiseg(long mennyiseg)
        {
            this.mennyiseg += mennyiseg;
        }
        public void levonMennyiseg(long mennyiseg)
        {
            this.mennyiseg -= mennyiseg;
        }
    }
}
