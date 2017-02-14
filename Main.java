import bolt.*;

import java.util.Date;

public class Main
{
    public static void main(String[] args) {
        Date faszomat = new Date();
        Tej teszttej = new Tej(1, "Tesztgyarto", faszomat, 2.6, 230 );
        System.out.println(teszttej.toString());
    }
}
