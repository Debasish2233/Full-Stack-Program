import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by commas: ");
        String line = scanner.nextLine();
        scanner.close();

        String[] parts = line.trim().split("\\s*,\\s*"); // split by commas and optional spaces
        int[] input = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            input[i] = Integer.parseInt(parts[i]);
        }

        Map<Integer, Integer> multiplesCount = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            multiplesCount.put(i, 0);
        }

        for (int key = 1; key <= 9; key++) {
            int count = 0;
            for (int num : input) {
                if (num % key == 0) {
                    count++;
                }
            }
            multiplesCount.put(key, count);
        }

        System.out.print("{");
        int size = multiplesCount.size();
        int idx = 0;
        for (Map.Entry<Integer, Integer> entry : multiplesCount.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue());
            idx++;
            if (idx < size) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
