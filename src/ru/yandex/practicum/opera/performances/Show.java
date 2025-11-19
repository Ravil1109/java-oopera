package ru.yandex.practicum.opera.performances;

import ru.yandex.practicum.opera.staff.Actor;
import ru.yandex.practicum.opera.staff.Director;

import java.util.ArrayList;

public class Show {
    private String title; //Название
    private int duration; //Длительность в минутах
    private Director director; //Режиссёр
    private ArrayList<Actor> listOfActors; //Список актёров

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        if (listOfActors == null) {
            this.listOfActors = new ArrayList<>();
        } else {
            this.listOfActors = listOfActors;
        }
    }

    public void printDirector() {
        System.out.println(director.toString());

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
    public void replaceActor (Actor newActor, String replaceActorSurname) {
        if (newActor == null ||
            replaceActorSurname == null ||
            "".equals(replaceActorSurname)) {
            return;
        }

        for (Actor actor: listOfActors) {
            if (replaceActorSurname.equalsIgnoreCase(actor.getSurname())) {
                listOfActors.remove(actor);
                addActorToList(newActor);
                return;
            }
        }

        System.out.println("Актер с фамилией '"+replaceActorSurname+"' отсутствует!");
        System.out.println("");
    }

    public void printActors() {
        System.out.println("Актеры к спектаклю '"+getTitle()+"':");
        for (Actor actor: listOfActors) {
            System.out.println(actor.toString());
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
