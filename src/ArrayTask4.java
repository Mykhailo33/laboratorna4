public class ArrayTask4 {
    public static void main(String[] args) {
        int[] array = {3, 6, 9, 2, 7}; // Приклад масиву

        // Змінюємо знак непарних елементів масиву
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] *= -1;
            }
        }

        // Виводимо змінений масив
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
