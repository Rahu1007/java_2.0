import java.util.*;
public class TrappingRainwater {
    public static int TrappingRainwaterDemo(int height [] ) {
        // Calculate left max boundary
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // Calculate right max boundary
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]); // corrected from leftmax to rightmax
        }

        // Calculate trapped water and loop
        int trappedwater = 0;
        //loop
        for (int i = 0; i < height.length; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]); // water level is the minimum of both boundaries
            trappedwater += waterlevel - height[i]; // trapped water at each position
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(TrappingRainwaterDemo(height)); // Output should be 11
    }
}
