package com.aquarium;

/**
 * Абстрактный базовый класс, представляющий рыбу в аквариуме.
 */
public abstract class Fish {

    /** Название вида рыбы. */
    private String species;

    /** Вес рыбы (в граммах). */
    private double weight;

    /** Размер рыбы (ширина и длина). */
    private Size size;

    /**
     * Конструктор для инициализации базовых полей рыбы.
     *
     * @param species название вида
     * @param weight  вес рыбы в граммах
     * @param size    размер рыбы
     */
    public Fish(String species, double weight, Size size) {
        this.species = species;
        this.weight = weight;
        this.size = size;
    }

    /**
     * Является ли рыба хищником.
     * Переопределяется в наследниках.
     *
     * @return true, если хищник
     */
    public abstract boolean isPredator();

    /**
     * Возвращает название вида рыбы.
     *
     * @return название вида
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Возвращает вес рыбы.
     *
     * @return вес рыбы в граммах
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Возвращает размер рыбы.
     *
     * @return объект Size с шириной и длиной
     */
    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("Вид: %s | Вес: %.1f г | Размер: %s | Хищник: %s",
                species, weight, size, (isPredator() ? "Да" : "Нет"));
    }
}