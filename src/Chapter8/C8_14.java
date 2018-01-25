package Chapter8;

/**
 * Program to read, store, and calculate employee work hours
 *
 * @author Jaydon Sims
 */
public class C8_14 {

    static final int EMP = 0;
    static final int TIME = 1;

    /**
     * Main method
     *
     * @param args reads input from the keyboard
     */
    public static void main(String[] args) {
        int[][] employeeHours = new int[][]{
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}};
        int[][] totalHours = calcTotalHours(employeeHours);
        descendingSort(totalHours);
        for (int i = 0; i < totalHours.length; i++) {
            System.out.println("Employee #" + totalHours[i][EMP] + " total hours = "
                    + totalHours[i][TIME]);
        }
    }

    /**
     * Method to assign hours to the array
     *
     * @param m holds one of the arrays
     * @return the total hours
     */
    public static int[][] calcTotalHours(int[][] m) {
        int[][] totalHoursChart = new int[m.length][2];

        for (int i = 0; i < m.length; i++) {
            totalHoursChart[i][TIME] = getRowTotalHour(m, i);
            totalHoursChart[i][EMP] = i;
        }
        return totalHoursChart;
    }

    /**
     * Method to calculate the total hours
     *
     * @param m part of the array
     * @param row rows in the array
     * @return the total
     */
    public static int getRowTotalHour(int[][] m, int row) {
        int total = 0;
        for (int column = 0; column < m[row].length; column++) {
            total += m[row][column];
        }
        return total;
    }

    /**
     * Method to sort the array
     *
     * @param m part of the array
     */
    public static void descendingSort(int[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            int currentIndex = i;
            int currentMax = m[i][TIME];
            int empNum = m[i][EMP];
            for (int k = i + 1; k < m.length; k++) {
                if (currentMax < m[k][TIME]) {
                    currentMax = m[k][TIME];
                    currentIndex = k;
                    empNum = m[k][EMP];
                }
            }
            if (currentIndex != i) {
                m[currentIndex][EMP] = m[i][EMP];
                m[currentIndex][TIME] = m[i][TIME];
                m[i][EMP] = empNum;
                m[i][TIME] = currentMax;
            }
        }
    }
}
