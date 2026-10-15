package com.aquarium;

/**
 * Класс, представляющий размер рыбы.
 */
public class Size {

    /** Ширина рыбы (в сантиметрах). */
    private double width;

    /** Длина рыбы (в сантиметрах). */
    private double length;

    /**
     * Конструктор для инициализации размера рыбы.
     *
     * @param width  ширина рыбы
     * @param length длина рыбы
     */
    public Size(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Возвращает ширину рыбы.
     *
     * @return ширина рыбы
     */
    public double getWidth() {
        return width;
    }

    /**
     * Возвращает длину рыбы.
     *
     * @return длина рыбы
     */
    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return String.format("Ширина: %.1f см | Длина: %.1f см", width, length);
    }
}