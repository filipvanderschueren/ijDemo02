package be.ua.fti;

import java.util.ArrayList;

public class Lijst {
    private ArrayList<Persoon> lijst;

    public Lijst() {
        lijst = new ArrayList<Persoon>();
    }

    public void voegToe(Persoon p)
    {
        lijst.add(p);
    }
}
