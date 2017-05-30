package net.xaviersala;

import com.google.inject.AbstractModule;
import net.xaviersala.repositori.RepositoriPersones;
import net.xaviersala.repositori.RepositoriPersonesMemory;

/**
 * Created by xavier on 29/05/17.
 */
public class GuiceConf extends AbstractModule {
    protected void configure() {
        bind(RepositoriPersones.class).to(RepositoriPersonesMemory.class);
    }
}
