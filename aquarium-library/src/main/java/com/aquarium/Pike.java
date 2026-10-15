package com.aquarium;

/**
 * Класс, представляющий щуку — хищную рыбу.
 */
public class Pike extends Fish {

    /** Максимальная зафиксированная скорость (км/ч). */
    private double maxSpeed;

    /**
     * Конструктор для инициализации щуки.
     *
     * @param weight   вес рыбы в граммах
     * @param size     размер рыбы
     * @param maxSpeed максимальная скорость
     */
    public Pike(double weight, Size size, double maxSpeed) {
        super("Щука", weight, size);
        this.maxSpeed = maxSpeed;
    }

    /**
     * Возвращает максимальную скорость щуки.
     *
     * @return максимальная скорость в км/ч
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean isPredator() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " | Тип: Хищная (Скорость до: " + maxSpeed + " км/ч)";
    }
}