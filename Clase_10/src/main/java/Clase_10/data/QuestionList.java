package Clase_10.data;

import Clase_10.models.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionList {
    public static List<Question> sendQuestions(){

        List<Question> questList = new ArrayList<>();

        Question cine = new Question();
        cine.setCategory("Cine");
        cine.setQuestion("¿Cuál es la película más taquillera de todos los tiempos?");
        cine.setOptions(new String[]{"Avengers: Endgame", "Avatar", "Titanic", "Star Wars: El despertar de la fuerza"});
        cine.setAnswer(0);
        cine.setExplanation("La película más taquillera de todos los tiempos es Avengers: Endgame, que logró un gran éxito de taquilla a nivel mundial gracias a su gran popularidad y a la culminación de la saga del Universo Cinematográfico de Marvel.");

        Question musica = new Question();
        musica.setCategory("Musica");
        musica.setQuestion("¿Cuál es la banda de rock más exitosa de todos los tiempos?");
        musica.setOptions(new String[]{"The Beatles", "Led Zeppelin", "Queen", "Rolling Stones"});
        musica.setAnswer(0);
        musica.setExplanation("La banda de rock más exitosa de todos los tiempos es The Beatles, con su influencia duradera en la música y sus numerosos éxitos a lo largo de su carrera.");

        Question ciencia = new Question();
        ciencia.setCategory("Ciencia");
        ciencia.setQuestion("¿Cuál es la teoría científica más aceptada sobre el origen del universo?");
        ciencia.setOptions(new String[]{"Big Bang", "Teoría del Estado Estacionario", "Teoría del Universo Oscilante", "Teoría del Multiverso"});
        ciencia.setAnswer(0);
        ciencia.setExplanation("La teoría científica más aceptada sobre el origen del universo es el Big Ban.");

        Question arte = new Question();
        arte.setCategory("Arte");
        arte.setQuestion("¿Quién pintó la famosa obra 'La Mona Lisa'?");
        arte.setOptions(new String[]{"Pablo Picasso", "Leonardo da Vinci", "Vincent van Gogh", "Salvador Dalí"});
        arte.setAnswer(1);
        arte.setExplanation("La famosa obra 'La Mona Lisa' fue pintada por Leonardo da Vinci, uno de los artistas más influyentes del Renacimiento.");

        Question deportes = new Question();
        deportes.setCategory("Deportes");
        deportes.setQuestion("¿Cuál es el deporte más popular en Argentina?");
        deportes.setOptions(new String[]{"Tennis", "Futbol", "Rugby", "Polo"});
        deportes.setAnswer(1);
        deportes.setExplanation("El fútbol es el deporte más popular en Argentina. El país tiene una gran pasión por el fútbol y ha producido renombrados jugadores y equipos reconocidos a nivel mundial.");

        Question cultura = new Question();
        cultura.setCategory("Cultura");
        cultura.setQuestion("¿En qué país se encuentra la famosa Torre Eiffel?");
        cultura.setOptions(new String[]{"Francia", "Italia", "España", "Inglaterra"});
        cultura.setAnswer(0);
        cultura.setExplanation("La famosa Torre Eiffel se encuentra en Francia, específicamente en la ciudad de París.");

        questList.add(cine);
        questList.add(musica);
        questList.add(cultura);
        questList.add(ciencia);
        questList.add(deportes);
        questList.add(arte);

        return questList;
    }

}
