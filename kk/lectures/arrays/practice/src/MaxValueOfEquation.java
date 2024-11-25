/*
You are given an array points containing the coordinates of points on a 2D plane, sorted by the x-values,
where points[i] = [xi, yi] such that xi < xj for all 1 <= i < j <= points.length. You are also given an integer k.

Return the maximum value of the equation yi + yj + |xi - xj| where |xi - xj| <= k and 1 <= i < j <= points.length.
 */

public class MaxValueOfEquation {
    public static void main(String[] args) {
        int[][]points = {
                {1,3},
                {2,0},
                {5,10},
                {6,-10}
        };
        int k = 1;
        System.out.println(findMaxValueOfEquation(points,k));
    }
    public static int findMaxValueOfEquation(int[][] points, int k) {
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
//incomplete
            }

        }

        return 0;
    }
}
