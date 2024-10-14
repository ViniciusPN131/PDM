package com.example.listagem;

import java.util.ArrayList;

public class PlanetasDAO {
     ArrayList<Planeta> planetas;

    public PlanetasDAO() {
        planetas= new ArrayList<Planeta>();

        planetas.add(new Planeta("mercurio", R.drawable.mercury));
        planetas.add(new Planeta("venus", R.drawable.venus));
        planetas.add(new Planeta("Terra", R.drawable.earth));
        planetas.add(new Planeta("Marte", R.drawable.mars));
        planetas.add(new Planeta("Jupter", R.drawable.jupter));
        planetas.add(new Planeta("Saturno", R.drawable.saturn));

    }
}
