package Interview2025DSA;

public class ReverseAString {

        public static void main(String[] args) {
            char[] str = "hello".toCharArray();
            int left = 0;
            int right = str.length - 1;

            while (left < right) {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }

            System.out.println(new String(str));
        }
    }


