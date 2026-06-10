//arr = [0,1,3,1,2,3,0,1,3,2,1,0]
//find the frequency of each element in the array and print the element and its frequency without using hashmap or any collection framework
public class FrequencyOfElements {
    public static void main(String[] args) {

        int[] arr = {0, 1, 3, 1, 2, 3, 0, 1, 3, 2, 1, 0};

        boolean[] visited = new boolean[arr.length]; // To keep track of visited elements

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) { // If the element is already visited, skip it
                continue;
            }

            int frequency = 1; // 1 because the current element is counted as well, not 0 because it is already counted

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) { // If the element is found again, increment the frequency and mark it as visited
                    frequency++; // Increment frequency
                    visited[j] = true; // Mark the duplicate element as visited
                }
            }

            System.out.println(arr[i] + " -> " + frequency + " times"); // Print the element and its frequency
        }
    } 
}

//time complexity: O(n^2) because of the nested loops
//space complexity: O(n) because of the visited array used to keep track of visited elements