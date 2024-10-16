package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeWork extends BinaryIntSearchTree {

    /**
     * Метод находит максимальные элементы, которые не превышают upperBound, и возвращает их в отсортированном виде.
     *
     * @param count      максимальное количество элементов в ответе
     * @param upperBound верхняя граница для поиска элементов
     * @return список найденных максимальных значений не более чем upperBound и длиной не более count, отсортировано от большего к меньшему
     */
    public List<Integer> findMaxDigits(int count, int upperBound) {
        if (count <= 0 || upperBound < 0) {
            throw new IllegalArgumentException("Invalid count or upperBound");
        }

        List<Integer> result = new ArrayList<>();
        findElements(root, upperBound, result);

        // Сортируем элементы по убыванию
        Collections.sort(result, Collections.reverseOrder());

        // Возвращаем список не более count элементов
        return result.size() > count ? result.subList(0, count) : result;
    }

    /**
     * Рекурсивный метод для нахождения элементов в дереве, не превосходящих upperBound.
     *
     * @param node       текущий узел
     * @param upperBound верхняя граница для поиска элементов
     * @param result     список, в который добавляются элементы
     */
    private void findElements(Node node, int upperBound, List<Integer> result) {
        if (node == null) {
            return;
        }

        // Если текущий элемент меньше или равен upperBound, добавляем его в результат
        if (node.value <= upperBound) {
            result.add(node.value);
        }

        // Обходим левое поддерево
        findElements(node.left, upperBound, result);

        // Обходим правое поддерево (имеет смысл только если значение узла <= upperBound)
        if (node.value <= upperBound) {
            findElements(node.right, upperBound, result);
        }
    }
}
