public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] salary = generateRandomArray();
        for (int i = 0; i <= salary.length - 1; i++) {
            System.out.println(salary[i]);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] salary = generateRandomArray();
        int maxSalary = salary[0];
        int minSalary = salary[0];
        for(int a : salary) {
            if (a < minSalary) minSalary = a;
            if (a > maxSalary) maxSalary =a;
        }
        System.out.println("Минимальная сумма трат за день составила" + minSalary + " рублей. Максимальная сумма трат за день составила " + maxSalary +  " рублей");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] salary = generateRandomArray();
        int maxSalary = salary[0];
        int minSalary = salary[0];
        double middleSalary = 0;
        for (int i = 0; i < salary.length - 1; i++) {
            if (i < minSalary) minSalary = i;
            if (i > maxSalary) maxSalary = i;
            middleSalary += salary[i]/salary.length;
        }

        System.out.println("Средняя сумма трат за месяц составила " + middleSalary + " рублей");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[0] = "n";
        for (int i =0; i = reverseFullName.length -1; i--) {
            System.out.println(reverseFullName[i]);
        }
    }

}