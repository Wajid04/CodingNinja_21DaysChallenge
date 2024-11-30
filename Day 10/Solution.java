import java.util.*;

public class Solution {
    public static int[] getFrequencies(int[] v) {
        Arrays.sort(v);

        int highestFrequency = 0, lowestFrequency = Integer.MAX_VALUE;
        int highestFrequencyElement = v[0], lowestFrequencyElement = v[0];

        int currentElement = v[0], currentFrequency = 1;

        for (int i = 1; i <= v.length; i++) {
            if (i < v.length && v[i] == currentElement) {
                currentFrequency++;
            } else {
                if (currentFrequency > highestFrequency ||
                    (currentFrequency == highestFrequency && currentElement < highestFrequencyElement)) {
                    highestFrequency = currentFrequency;
                    highestFrequencyElement = currentElement;
                }

                if (currentFrequency < lowestFrequency ||
                    (currentFrequency == lowestFrequency && currentElement < lowestFrequencyElement)) {
                    lowestFrequency = currentFrequency;
                    lowestFrequencyElement = currentElement;
                }

                if (i < v.length) {
                    currentElement = v[i];
                    currentFrequency = 1;
                }
            }
        }

        return new int[]{highestFrequencyElement, lowestFrequencyElement};
    }
}
