package org.example;

import java.util.ArrayList;
import java.util.List;


public class HomeWork extends BinaryIntSearchTree {

	public List<Integer> findMaxDigits(Node root, int count, int upperBound, List<Integer> result) {
		if (result.size() >= count) {
			return result;
		}

		if (root.left != null) {
			if (root.left.value <= upperBound) {
				result.add(root.left.value);
			}
			result = findMaxDigits(root.left, count, upperBound, result);
		}

		if (root.right != null) {
			if (root.right.value <= upperBound) {
				result.add(root.right.value);
			}
			result = findMaxDigits(root.right, count, upperBound, result);
		}

		return result;
	}

    /**
     * <h1>Задание 1.</h1>
     * Дан класс BinaryTree, который реализует бинарное дерево поиска.
     * Реализовать метод findMaxDigits, который возвращает массив
     * наибольших элементов в дереве, не превосходящих upperBound.
     * <br/>
     * Пример :
     * коллекция в дереве 1, 2, 3, 4, 5
     * count = 3, upperBound 4
     * ответ [4, 3, 2]

     *
     * @param count максимальное количество элементов в ответе
     * @param upperBound верхняя граница для поиска элементов
     * @return массив найденных максимальных значений не более чем upperBound и длиной не более count, отсортировано от большего к меньшему
     * Сигнатуру метода не меняем
     */
    public List<Integer> findMaxDigits(int count, int upperBound) {
        ArrayList<Integer> result = new ArrayList<>();
        return findMaxDigits(root, count, upperBound, result);
    }


}
