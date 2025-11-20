package ru.yandex.practicum.opera.staff;

import java.util.Objects;

public class Actor extends Person {

    private int height; //Рост

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true; // проверяем адреса объектов
        if (obj == null) return false; // проверяем ссылку на null
        if (this.getClass() != obj.getClass()) return false;

        Actor actor = (Actor) obj;
        return height == actor.height && Objects.equals(getName(), actor.getName()) && Objects.equals(getSurname(), actor.getSurname());
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash += Objects.hashCode(height);

        if (getName() != null) {
            hash += getName().hashCode();
        }

        hash = hash * 31;

        if (getSurname() != null) {
            hash += getSurname().hashCode();
        }

        return hash;
    }

    @Override
    public String toString() {
        return "Actor{" + "name='" + super.getName() + '\'' + ", surname='" + super.getSurname() + '\'' + ", height=" + height + '}';
    }
}
