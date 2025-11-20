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

        //Поиск однофамильцев
        int cnt = 0;
        int inx = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);

            if (replaceActorSurname.equalsIgnoreCase(actor.getSurname())) {
                if (cnt == 0) {
                    inx = i;
                }

                cnt++;
            }
        }

        if (cnt == 0) {
            System.out.println("Актер с фамилией '" + replaceActorSurname + "' отсутствует!\n");
        } else if (cnt > 1) {
            System.out.println("Найдено несколько однофамильцев " + replaceActorSurname + "! Невозможно однозначно определить заменяемого актера!\n");
        } else {
            listOfActors.remove(inx);
            addActorToList(newActor);
        }

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
