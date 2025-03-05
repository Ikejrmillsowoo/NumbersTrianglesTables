package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sb = new StringBuilder();
        for (int row = 1; row <= tableSize ; row++) {

            for (int col = 1; col <=tableSize ; col++) {
                int product = col * row;
                if (product < 10) {
                    sb.append("  ").append(product).append(" |");
                } else if (product < 100) {
                    sb.append(" ").append(product).append(" |");
                } else {
                    sb.append(product).append(" |");
                }
            }
            sb.append("\n");
        }

       // System.out.println(sb);
        return sb.toString();

    }

    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }


    public static void main(String[] args) {
        getMultiplicationTable(4);
    }
}
