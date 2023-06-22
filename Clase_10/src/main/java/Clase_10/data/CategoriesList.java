package Clase_10.data;

import Clase_10.models.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoriesList {
    public static List<Category> sendCategories(){

        List<Category> catList = new ArrayList<>();

        Category cine = new Category();
        cine.setCategory("Cine");
        cine.setDescription("Preguntas relacionadas con películas, actores, directores y otros temas cinematográficos.");

        Category musica = new Category();
        musica.setCategory("Musica");
        musica.setDescription("Preguntas relacionadas con géneros musicales, artistas y canciones populares.");

        Category ciencia = new Category();
        ciencia.setCategory("Ciencia");
        ciencia.setDescription("Preguntas relacionadas con los avances científicos, descubrimientos, teorías y conceptos en diversas áreas de la ciencia.");

        Category arte = new Category();
        arte.setCategory("Arte");
        arte.setDescription("Preguntas relacionadas con diversas formas de expresión artística.");

        Category deportes = new Category();
        deportes.setCategory("Deportes");
        deportes.setDescription("Preguntas relacionadas con diferentes disciplinas deportivas, equipos, atletas destacados, reglas y eventos deportivos.");

        Category cultura = new Category();
        cultura.setCategory("Cultura");
        cultura.setDescription("Preguntas relacionadas con tradiciones, costumbres, historia, arte, literatura y otros aspectos culturales de diversas regiones y comunidades.");

        catList.add(cine);
        catList.add(musica);
        catList.add(ciencia);
        catList.add(arte);
        catList.add(deportes);
        catList.add(cultura);

        return catList;

    }
}
