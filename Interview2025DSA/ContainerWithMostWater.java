package Interview2025DSA;

public class ContainerWithMostWater {

        public static void main(String[] args) {
            int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
            int left = 0, right = heights.length - 1;
            int maxArea = 0;

            while (left < right) {
                int width = right - left;
                int area = Math.min(heights[left], heights[right]) * width;
                maxArea = Math.max(maxArea, area);

                if (heights[left] < heights[right]) {
                    left++;
                } else {
                    right--;
                }
            }

            System.out.println("Max Area: " + maxArea);
        }
    }


