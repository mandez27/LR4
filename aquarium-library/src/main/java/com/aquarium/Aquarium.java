package com.aquarium;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, представляющий аквариум.
 */
public class Aquarium {

    /** Список рыб в аквариуме. */
    private List<Fish> aquarium = new ArrayList<>();

    public Aquarium() { }

    /**
     * Добавляет рыбу в аквариум.
     *
     * @param fish объект рыбы, который нужно добавить
     */
    public void addFish(Fish fish) {
        aquarium.add(fish);
    }

    /**
     * Возвращает полный список всех рыб в аквариуме.
     *
     * @return список объектов Fish
     */
    public List<Fish> getAllFish() {
        return this.aquarium;
    }

    /**
     * Фильтрует рыб по названию вида.
     * Поиск не зависит от регистра символов.
     *
     * @param search строка или символ для поиска в названии вида
     * @return список рыб, чей вид содержит искомую строку
     */
    public List<Fish> filterFishBySpecies(String search) {
        List<Fish> filtered = new ArrayList<>();

        for (Fish fish : aquarium) {
            if (fish.getSpecies().toUpperCase().contains(search.toUpperCase())) {
                filtered.add(fish);
            }
        }

        return filtered;
    }

    /**
     * Фильтрует рыб по минимальному весу.
     * Находит рыб, чей вес строго больше указанного числа.
     *
     * @param minWeight минимальный вес (эксклюзивно)
     * @return список рыб, чей вес превышает minWeight
     */
    public List<Fish> filterFishByWeight(double minWeight) {
        List<Fish> filtered = new ArrayList<>();

        for (Fish fish : aquarium) {
            if (fish.getWeight() > minWeight) {
                filtered.add(fish);
            }
        }

        return filtered;
    }

    /**
     * Возвращает список только хищных рыб.
     *
     * @return список хищников
     */
    public List<Fish> getPredators() {
        List<Fish> filtered = new ArrayList<>();

        for (Fish fish : aquarium) {
            if (fish.isPredator()) {
                filtered.add(fish);
            }
        }

        return filtered;
    }

    /**
     * Находит самую длинную рыбу в аквариуме.
     *
     * @return объект Fish с максимальной длиной, либо null, если аквариум пуст
     */
    public Fish getLongestFish() {
        if (aquarium.isEmpty()) {
            return null;
        }

        Fish longest = aquarium.get(0);
        for (Fish fish : aquarium) {
            if (fish.getSize().getLength() > longest.getSize().getLength()) {
                longest = fish;
            }
        }

        return longest;
    }
}