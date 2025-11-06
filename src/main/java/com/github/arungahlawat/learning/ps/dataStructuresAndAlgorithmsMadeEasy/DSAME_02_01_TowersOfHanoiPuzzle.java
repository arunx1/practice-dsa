package com.github.arungahlawat.learning.ps.dataStructuresAndAlgorithmsMadeEasy;

/*

 */
public class DSAME_02_01_TowersOfHanoiPuzzle {
    public void printTowersOfHanoiPuzzleMovesForNDisks(int towerHeight) {
        if (towerHeight == 0) {
            System.out.println("\nEmpty tower");
            return;
        }
        towersOfHanoi(towerHeight, 'A', 'B', 'C');
        System.out.printf("\nTotal moves: %.0f\n",Math.pow(2, towerHeight)-1);
    }

    private void towersOfHanoi(int n, char sourceTower, char destinationTower, char temporaryTower) {
        if (n == 1) {
            System.out.printf("\nMove disk 1 from tower %c to tower %c", sourceTower, destinationTower);
            return;
        }
        towersOfHanoi(n - 1, sourceTower, temporaryTower, destinationTower);
        System.out.printf("\nMove disk %d from tower %c to tower %c", n, sourceTower, destinationTower);
        towersOfHanoi(n - 1, temporaryTower, destinationTower, sourceTower);
    }
}
