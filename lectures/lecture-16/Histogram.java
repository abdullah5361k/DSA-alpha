import java.util.*;

public class Histogram {

    public static void maxArea(int heights[]) {
        int maxArea = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        // Next smaller left
        Stack<Integer> s = new Stack<>;
        for(int i=heights.length; i>=0; i--) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next smaller right

        s = new Stack<>();
        for(int i=0; i>=heights.length; i++) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Current area  width = j-i-1 = nsr[i]-nsl[i]-1
        for(int i=0; i<heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 }; // Heights in Histogram
    }
}
