package com.aquarium;

/**
 * Класс, представляющий сома — хищную рыбу.
 */
public class Catfish extends Fish {

    /** Наличие усов. */
    private boolean hasWhiskers;

    /**
     * Конструктор для инициализации сома.
     *
     * @param weight      вес рыбы в граммах
     * @param size        размер рыбы
     * @param hasWhiskers наличие усов
     */
    public Catfish(double weight, Size size, boolean hasWhiskers) {
        super("Сом", weight, size);
        this.hasWhiskers = hasWhiskers;
    }

    /**
     * Возвращает наличие усов.
     *
     * @return наличие усов
     */
    public boolean isHasWhiskers() {
        return hasWhiskers;
    }

    @Override
    public boolean isPredator() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " | Тип: Хищный (Усы: " + (hasWhiskers ? "Есть" : "Нет") + ")";
    }
}