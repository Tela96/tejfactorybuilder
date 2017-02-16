package bolt.aru;

import bolt.Aru;

/**
 * Created by akos on 2017.02.16..
 */
public class Szappan extends Aru
{
    char mosohatas;
    public Szappan(Long vonalKod, String gyarto, char mosohatas)
    {
        super(vonalKod, gyarto);
        this.mosohatas = mosohatas;
    }
    public char getMosoHatas()
    {
        return mosohatas;
    }
}
