package com.aquarium;

/**
 * Класс, представляющий карася — мирную рыбу.
 */
public class Crucian extends Fish {

    /** Предпочитаемая температура воды (°C). */
    private double preferredTemperature;

    /**
     * Конструктор для инициализации карася.
     *
     * @param weight               вес рыбы в граммах
     * @param size                 размер рыбы
     * @param preferredTemperature предпочитаемая температура воды
     */
    public Crucian(double weight, Size size, double preferredTemperature) {
        super("Карась", weight, size);
        this.preferredTemperature = preferredTemperature;
    }

    /**
     * Возвращает предпочитаемую температуру воды.
     *
     * @return температура в °C
     */
    public double getPreferredTemperature() {
        return preferredTemperature;
    }

    @Override
    public boolean isPredator() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " | Тип: Мирный (t° предпочтит.: " + preferredTemperature + "°C)";
    }
}