package net.xaviersala;

import com.google.inject.Inject;
import net.xaviersala.repositori.RepositoriPersones;

/**
 * Created by xavier on 29/05/17.
 */
public class GestorDeNoms {

    RepositoriPersones repositori;

    @Inject
    public GestorDeNoms(RepositoriPersones repositori) {
        this.repositori = repositori;
    }


    public void run() {
        System.out.println(repositori.quantesPersonesHiHa());
    }
}
