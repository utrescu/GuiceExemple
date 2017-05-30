package net.xaviersala;

import com.google.inject.Guice;
import com.google.inject.Injector;
import net.xaviersala.repositori.RepositoriPersones;

/**
 * Demostració del funcionament de Guice.
 *
 */
public class App
{

    public static void main( String[] args )
    {

        Injector injector = Guice.createInjector(new GuiceConf());
        RepositoriPersones repositori = injector.getInstance(RepositoriPersones.class);

        // Obtenir la classe directament
        System.out.println(repositori.quantesPersonesHiHa());
        repositori.afegirPersona("Frederic");
        System.out.println(repositori.quantesPersonesHiHa());
        System.out.println("------- GestorDeNoms -------");
        GestorDeNoms noms = injector.getInstance(GestorDeNoms.class);
        noms.run();

        

    }
}
