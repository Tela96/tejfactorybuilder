package bolt;

import java.util.Arrays;
import java.util.Vector;

public class Bolt
{
    private String nev;
    private String cim;
    private String tulajdonos;
    private Vector<Tej> tejpult;

    public Bolt(String nev, String cim, String tulajdonos, Vector<Tej> tejpult)
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
    public Tej vasarolTej(Tej m)
    {
        for (Tej tej:tejpult)
        {
            if (m.equals(tej))
            {
                Arrays.asList(tejpult).remove(tej);
                return tej;
            }

        }
        return null;
    }
    public void feltoltTej(Tej m)
    {
        tejpult.add(m);
    }
}
