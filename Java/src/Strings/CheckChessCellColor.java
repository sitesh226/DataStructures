package Strings;

/*
Given two cells on the standard chess board, determine whether they have the same color or not.

    Example

        For cell1 = "A1" and cell2 = "C3", the output should be
        solution(cell1, cell2) = true.

 */
public class CheckChessCellColor {

    boolean areCellsSameColor(String cell1, String cell2) {

        int x1 = cell1.charAt(0) - 'A', x2 = cell1.charAt(1) - '1';
        int y1 = cell2.charAt(0) - 'A', y2 = cell2.charAt(1) - '1';
        return (x1 + y1) % 2 == (x2 + y2) % 2;

    }

    public static void main(String[] args) {
        CheckChessCellColor cellColor =new CheckChessCellColor();
        cellColor.areCellsSameColor("A1", "C3");
    }
}


