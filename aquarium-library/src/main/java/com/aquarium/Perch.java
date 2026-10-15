package com.aquarium;

/**
 * Класс, представляющий окуня — хищную рыбу.
 */
public class Perch extends Fish {

    /** Глубина обитания (в метрах). */
    private double habitatDepth;

    /**
     * Конструктор для инициализации окуня.
     *
     * @param weight       вес рыбы в граммах
     * @param size         размер рыбы
     * @param habitatDepth глубина обитания
     */
    public Perch(double weight, Size size, double habitatDepth) {
        super("Окунь", weight, size);
        this.habitatDepth = habitatDepth;
    }

    /**
     * Возвращает глубину обитания окуня.
     *
     * @return глубина обитания в метрах
     */
    public double getHabitatDepth() {
        return habitatDepth;
    }

    @Override
    public boolean isPredator() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " | Тип: Хищный (Глубина: " + habitatDepth + " м)";
    }
}