package ru.yandex.practicum.opera.performances;

import ru.yandex.practicum.opera.staff.Director;
import ru.yandex.practicum.opera.staff.Person;

public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, int duration, Director director, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Person choreographer) {
        this.choreographer = choreographer;
    }
}
