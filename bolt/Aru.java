package bolt;

/**
 * Created by akos on 2017.02.16..
 */
public abstract class Aru
{
    protected Long vonalKod = null;
    protected String gyarto = null;
    public Aru(Long vonalKod, String gyarto)
    {
        this.vonalKod = vonalKod;
        this.gyarto = gyarto;
    }

}
