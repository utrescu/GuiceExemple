package net.xaviersala.repositori;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.inject.Singleton;

/**
 * Només crea una sola instància de RepositoriPersonesMemory per
 * tot el programa perquè està etiquetat amb @Singleton.
 * 
 * Created by xavier on 29/05/17.
 */
@Singleton
public class RepositoriPersonesMemory implements RepositoriPersones{

    List<String> llistaPersones = new ArrayList<>(Arrays.asList("Pere", "Manel"));

    public int quantesPersonesHiHa() {
        return llistaPersones.size();
    }

    public void afegirPersona(String nom) {
        llistaPersones.add(nom);
    }
}
