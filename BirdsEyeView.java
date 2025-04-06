package day31;

public class BirdsEyeView {
    private static final int GRID_SIZE = 10;

    public static void main(String[] args) {
        char[][] grid = new char[GRID_SIZE][GRID_SIZE];
        initializeGrid(grid);
        printGrid(grid);
    }

    private static void initializeGrid(char[][] grid) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                grid[row][col] = '.'; // Use '.' to represent empty space
            }
        }

        // Example: Add some features to the grid
        grid[2][3] = 'T'; // T for tree
        grid[4][5] = 'B'; // B for building
        grid[7][8] = 'R'; // R for river
    }

    private static void printGrid(char[][] grid) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }
}

