package ru.yandex.practicum.opera;

import ru.yandex.practicum.opera.performances.*;
import ru.yandex.practicum.opera.staff.*;

import java.util.ArrayList;


public class Theatre {

    public static ArrayList<Show> listOfShows = new ArrayList<>();

    public static void main(String[] args) {
        //1. Создать трёх актеров и двух режиссёров. Также создайте одного автора музыки и одного хореографа
        //Актеры
        Actor actor1 = new Actor("Андрэ", "Бинош", Gender.MALE, 170);
        Actor actor2 = new Actor("Хонор", "Люмьер", Gender.MALE, 176);
        Actor actor3 = new Actor("Джейд", "Ришар", Gender.FEMALE, 162);

        //Режиссеры
        Director director1 = new Director("Виктор", "Магамедов", Gender.MALE, 238);
        Director director2 = new Director("Владимир", "Рамазанов", Gender.MALE, 56);

        //Автор музыки
        Person musicAuthor = new Person("Морозова", "Елизавета", Gender.FEMALE);

        //Хареограф
        Person choreographer = new Person ("Варвара", "Егорова ", Gender.FEMALE);

        /*2. Создать три спектакля: обычный, оперный и балет
          3. Распределить актёров по спектаклям. Используйте для этого метод
             добавления нового актёра в спектакль. Один актёр может участвовать
             в нескольких спектаклях.*/
        //Спектакль обычный
        Show show = new Show("Скамья забредших душ", 160, director1, null);
        show.addActorToList(actor1);
        show.addActorToList(actor2);

        //Спектакль оперный
        Opera opera = new Opera("Новогодний подарок судьбы", 96, director2, null,
                                musicAuthor,"Много слов 1 ........");
        opera.addActorToList(actor2);
        opera.addActorToList(actor3);

        //Спектакль балет
        Ballet ballet = new Ballet("Скамья забредших душ", 80, director2, null,
                                   musicAuthor, "Много слов 2 ........", choreographer);
        ballet.addActorToList(actor1);
        ballet.addActorToList(actor2);
        ballet.addActorToList(actor3);

        //Список спектаклей
        listOfShows.add(show);
        listOfShows.add(opera);
        listOfShows.add(ballet);

        //4. Для каждого спектакля выведите на экран список актёров.
        printActorsInListShows();

        //5. Замените актёра в одном из спектаклей на актёра из другого спектакля и ещё раз выведите для него список актёров.
        opera.replaceActor(actor1,"Люмьер");
        opera.printActors();

        //6.Попробуйте заменить в другом спектакле несуществующего актёра
        show.replaceActor(actor3,"Тихомиров");
        show.printActors();

        //7.Для оперного и балетного спектакля выведите на экран текст либретто.
        opera.printLibrettoText();
        ballet.printLibrettoText();
    }

    //Печать актеров по всем спектаклям
    public static void printActorsInListShows() {
        for (Show show: listOfShows) {
            show.printActors();
        }
    }


}
