package dsa.Bitmanuplation.convertdecimaltobinary;

public class ConvertDecimalToBinary {

    public static void main(String[] args) {
        int num = 10; // Example number

        String res = "";
        // Convert decimal to binary
        while (num > 0) {
            if (num % 2 == 1) {
                res += '1';
            } else {
                res += '0';
            }
            num = num / 2;
        }
        // Reverse the binary string and print it
        System.out.println(reverse(res));
    }

    // Method to reverse a string
    static String reverse(String res) {
        char[] arr = res.toCharArray();
        int n = res.length();
        for (int i = 0; i < n / 2; i++) {
            // Swap characters
            char temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return new String(arr);
    }
}
