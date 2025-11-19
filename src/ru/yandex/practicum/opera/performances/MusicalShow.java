package ru.yandex.practicum.opera.performances;

import ru.yandex.practicum.opera.staff.Actor;
import ru.yandex.practicum.opera.staff.Director;
import ru.yandex.practicum.opera.staff.Person;

import java.util.ArrayList;

public class MusicalShow extends Show {
    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {

        System.out.println("Текст к спектаклю '"+super.getTitle()+"':"+librettoText);
        System.out.println("");
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(Person musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }
}
