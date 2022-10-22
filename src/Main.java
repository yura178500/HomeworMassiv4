//Задача 4
import java.util.Arrays;
public class Main {
    public static void reverse(char[] reverseFullName) {
        if (reverseFullName == null) {
            return;
        }
        for (int i = 0, j = reverseFullName.length - 1; j > i; i++, j--) {
            int temp = reverseFullName[j];
            reverseFullName[j] = reverseFullName[i];
            reverseFullName[i] = (char) temp;
        }
    }
    public static void main(String[] args) {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverse(reverseFullName);
        System.out.println(Arrays.toString(reverseFullName));
    }
}
