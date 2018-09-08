import java.util.Random;

public class Table2 {

    public static int[][] getRandomArray(int r, int c) {
        Random random = new Random();
        int[][] array = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = random.nextInt(1000);
            }
        }
        return array;
    }
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int x = -1;
        int[][] tab = getRandomArray(10, 3);


        for (int j = 0; j < tab.length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < tab[j].length; i++) {
                if (max < tab[j][i]) ;
                max = tab[j][i];
                if (max < min) {
                    min = max;
                    x = j;

                }
            }

        }
        printArray(tab);
    }

}

