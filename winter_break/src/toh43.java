import java.util.*;
public class toh43 {
    public static void moveDisk(int diskNumber, List<int[]> moves, int sourceStack, int destinationStack, int auxiliaryStack) {
        if (diskNumber == 1) {
            moves.add(new int[]{sourceStack, destinationStack});
            return;
        }
        moveDisk(diskNumber - 1, moves, sourceStack, auxiliaryStack, destinationStack);
        moves.add(new int[]{sourceStack, destinationStack});
        moveDisk(diskNumber - 1, moves, auxiliaryStack, destinationStack, sourceStack);
    }
    public static void towerOfHanoi(int numberOfDisks) {
        List<int[]> moves = new ArrayList<>();
        int sourceStack = 1, destinationStack = 3, auxiliaryStack = 2;
        moveDisk(numberOfDisks, moves, sourceStack, destinationStack, auxiliaryStack);
        System.out.println(moves.size());
        for (int[] move : moves) {
            System.out.println(move[0] + " " + move[1]);
        }
    }
    public static void main(String[] args) {
        int numberOfDisks = 2;
        towerOfHanoi(numberOfDisks);
    }
}