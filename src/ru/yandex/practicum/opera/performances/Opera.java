package ru.yandex.practicum.opera.performances;

import ru.yandex.practicum.opera.staff.Actor;
import ru.yandex.practicum.opera.staff.Director;
import ru.yandex.practicum.opera.staff.Person;

public class Opera extends MusicalShow {
    protected int choirSize;

    public Opera(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = listOfActors.size();
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }

    @Override
    public void addActorToList(Actor actor) {
        super.addActorToList(actor);
        this.choirSize = listOfActors.size();
    }
}
