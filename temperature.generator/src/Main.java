import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Patient vasya = new Patient();
        vasya.name = "Вася";
        vasya.temp = Math.floor(vasya.randomtemp * 100) / 100;

        Patient petya = new Patient();
        petya.name = "Петя";
        petya.temp = Math.floor(petya.randomtemp * 100) / 100;

        Patient kolya = new Patient();
        kolya.name = "Коля";
        kolya.temp = Math.floor(kolya.randomtemp * 100) / 100;

        Patient lesha = new Patient();
        lesha.name = "Леша";
        lesha.temp = Math.floor(lesha.randomtemp * 100) / 100;

        Patient sasha = new Patient();
        sasha.name = "Саша";
        sasha.temp = Math.floor(sasha.randomtemp * 100) / 100;

        Patient abdul = new Patient();
        abdul.name = "Абдул";
        abdul.temp = Math.floor(abdul.randomtemp * 100) / 100;

        Patient ramzan = new Patient();
        ramzan.name = "Рамзан";
        ramzan.temp = Math.floor(ramzan.randomtemp * 100) / 100;

        Patient volodya = new Patient();
        volodya.name = "Владимир";
        volodya.temp = Math.floor(volodya.randomtemp * 100) / 100;

        Patient dima = new Patient();
        dima.name = "Дима";
        dima.temp = Math.floor(dima.randomtemp * 100) / 100;

        Patient tolya = new Patient();
        tolya.name = "Толя";
        tolya.temp = Math.floor(tolya.randomtemp * 100) / 100;

        System.out.println(vasya.name + ": " + vasya.temp + ", " + tolya.name + ": " + tolya.temp + ", " +
                petya.name + ": " + petya.temp + ", " + kolya.name + ": " + kolya.temp + ", " +
                lesha.name + ": " + lesha.temp + ", " + abdul.name + ": " + abdul.temp + ", " +
                sasha.name + ": " + sasha.temp + ", " + ramzan.name + ": " + ramzan.temp + ", " +
                volodya.name + ": " + volodya.temp + ", " + dima.name + ": " + dima.temp);

    }
}
