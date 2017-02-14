package bolt;

import aru.Tej;

import java.util.Hashtable;

public class Bolt
{
    private String nev;
    private String cim;
    private String tulajdonos;
    private Hashtable<Long, BoltBejegyzes> tejpult;

    public Bolt(String nev, String cim, String tulajdonos)
    {
        this.nev = nev;
        this.cim = cim;
        this.tulajdonos = tulajdonos;
        this.tejpult = new Hashtable<Long, BoltBejegyzes>();
    }
    public Bolt(String nev, String cim, String tulajdonos, Hashtable tejpult)
    {
        this.nev = nev;
        this.cim = cim;
        this.tulajdonos = tulajdonos;
        this.tejpult = tejpult;
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
    public boolean vanMegTej()
    {
        return (tejpult.size() > 0);
    }
    public Tej vasarolTej(Long vonalKod)
    {
        Tej vasaroltTej = tejpult.get(vonalKod).getT();
        tejpult.get(vonalKod).levonMennyiseg(1);
        return vasaroltTej;
    }
    public void feltoltTej(Tej m)
    {
        BoltBejegyzes bejegyzes = new BoltBejegyzes(m, 1, 240);
        tejpult.put(bejegyzes.getT().getVonalKod(), bejegyzes);

    }
    protected class BoltBejegyzes
    {
        private Tej t;
        private int ar;
        private int mennyiseg;

        BoltBejegyzes(Tej t, int mennyiseg, int ar)
        {
            this.t = t;
            this.mennyiseg = mennyiseg;
            this.ar = ar;
        }

        public Tej getT()
        {
            return t;
        }

        public void setT(Tej t)
        {
            this.t = t;
        }

        public int getMennyiseg()
        {
            return mennyiseg;
        }

        public void setMennyiseg(int mennyiseg)
        {
            this.mennyiseg = mennyiseg;
        }

        public int getAr()
        {
            return ar;
        }

        public void setAr(int ar)
        {
            this.ar = ar;
        }

        public void adMennyiseg(int mennyiseg)
        {
            this.mennyiseg += mennyiseg;
        }
        public void levonMennyiseg(int mennyiseg)
        {
            this.mennyiseg -= mennyiseg;
        }
    }
}
