import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printActors() {
        System.out.println("Список актёров в спектакле '" + title + "':");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в этом спектакле.");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor + " добавлен в спектакль '" + title + "'.");
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        int actorIndex = 0;
        int matches = 0;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surname)) {
                actorIndex = i;
                matches++;
            }
        }
        if (matches == 0) {
            System.out.println("Актёр с фамилией " + surname +
                    " не найден в спектакле '" + title + "'.");
            return;
        }

        if (matches > 1) {
            System.out.println("Найдено несколько актёров с фамилией " + surname +
                    " в спектакле '" + title + "'. Замена невозможна.");
            return;
        }

        listOfActors.set(actorIndex, newActor);
        System.out.println("Актёр с фамилией " + surname +
                " заменён на " + newActor + ".");
    }

    public void printDirectorInfo() {
        System.out.println("Информация о режиссёре спектакля '" + title + "':");
        System.out.println(director);
    }

}