package com.aquariumapp;

import com.aquarium.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        // 5 видов рыб, каждой по 2 экземпляра
        aquarium.addFish(new Pike(1200.0, new Size(15.0, 45.0), 30.0));
        aquarium.addFish(new Pike(950.0,  new Size(13.0, 40.0), 25.0));
        aquarium.addFish(new Perch(150.0, new Size(8.0, 20.0), 5.0));
        aquarium.addFish(new Perch(180.0, new Size(9.0, 22.0), 6.0));
        aquarium.addFish(new Catfish(2500.0, new Size(25.0, 80.0), true));
        aquarium.addFish(new Catfish(3000.0, new Size(28.0, 90.0), true));
        aquarium.addFish(new Crucian(9000.0,  new Size(6.0, 15.0), 22.0));
        aquarium.addFish(new Crucian(110.0, new Size(7.0, 17.0), 24.0));

        System.out.println("Список всех рыб в аквариуме: ");
        for (Fish fish : aquarium.getAllFish()) {
            System.out.println(fish);
        }

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("\nВведите символ или часть названия вида для поиска: ");
            String searchChar = input.nextLine();

            System.out.println("Рыбы, содержащие '" + searchChar + "' в названии вида: ");
            for (Fish fish : aquarium.filterFishBySpecies(searchChar)) {
                System.out.println(fish);
            }

            System.out.print("\nВведите минимальный вес для фильтрации (г): ");
            while (!input.hasNextDouble()) {
                System.out.print("Ошибка! Введите число: ");
                input.next();
            }
            double minWeight = input.nextDouble();

            System.out.println("Рыбы с весом более " + minWeight + " г: ");
            for (Fish fish : aquarium.filterFishByWeight(minWeight)) {
                System.out.println(fish);
            }
        }

        // Задание 4: хищники, весящие больше 100 г
        System.out.println("\nХищные рыбы, которые весят больше 100 г:");
        for (Fish fish : aquarium.getPredators()) {
            if (fish.getWeight() > 100.0) {
                System.out.println(fish);
            }
        }

        // Задание 5: самая длинная рыба
        System.out.println("\nСамая длинная рыба в аквариуме:");
        System.out.println(aquarium.getLongestFish());
    }
}