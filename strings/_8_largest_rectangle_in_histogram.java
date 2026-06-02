import java.util.Stack;

public class _8_largest_rectangle_in_histogram {

    public static int largestRectangleArea(int[] heights) {

        int maxArea = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= heights.length; i++) {

            int currHeight;

            // For last iteration take height as 0
            if (i == heights.length) {
                currHeight = 0;
            } else {
                currHeight = heights[i];
            }

            // Process taller bars
            while (!stack.isEmpty() &&
                   heights[stack.peek()] > currHeight) {

                int height = heights[stack.pop()];

                int width;

                // If stack becomes empty
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }

            // Push current index
            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int[] heights = {2, 1, 5, 6, 2, 3};

        System.out.println(
            "Largest Rectangle Area = "
            + largestRectangleArea(heights)
        );
    }
}