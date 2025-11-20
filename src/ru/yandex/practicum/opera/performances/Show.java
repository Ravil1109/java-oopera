package ru.yandex.practicum.opera.performances;

import ru.yandex.practicum.opera.staff.Actor;
import ru.yandex.practicum.opera.staff.Director;

import java.util.ArrayList;

public class Show {
    protected String title; //Название
    protected int duration; //Длительность в минутах
    protected Director director; //Режиссёр
    protected ArrayList<Actor> listOfActors = new ArrayList<>(); //Список актёров

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printDirector() {
        System.out.println(director);

    }

    //Добавление нового актера
    public void addActorToList(Actor actor) {
        if (actor == null) {
            return;
        }

        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        }
    }

    //Замена Актера
    public void replaceActor(Actor newActor, String replaceActorSurname) {
        if (newActor == null || replaceActorSurname == null || "".equals(replaceActorSurname)) {
            return;
        }

        for (Actor actor : listOfActors) {
            if (replaceActorSurname.equalsIgnoreCase(actor.getSurname())) {
                listOfActors.remove(actor);
                addActorToList(newActor);
                return;
            }
        }

        System.out.println("Актер с фамилией '" + replaceActorSurname + "' отсутствует!\n");
    }

    public void printActors() {
        System.out.println("Актеры к спектаклю '" + title + "':");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println("");
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }
}
