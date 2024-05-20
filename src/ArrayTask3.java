public class ArrayTask3 {
    public static void main(String[] args) {
        double[] array = {3.5, 6.2, 9.8, 2.1, 7.4}; // Приклад масиву

        // Обчислення суми елементів масиву
        double sum = 0;
        for (double value : array) {
            sum += value;
        }

        System.out.println("Сума елементів масиву: " + sum);
    }
}
