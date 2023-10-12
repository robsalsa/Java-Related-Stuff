package CTI_Stuff;
import java.util.Scanner;

public class Paladrone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean flag = false;

        do {
            System.out.println("Please enter a string to check if it is a palindrome or enter 'exit' to leave:");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                flag = true;
            } else {
                if (isPalindrome(input)) {
                    System.out.println("This is a palindrome.");
                } else {
                    System.out.println("Sorry, but this is not a palindrome.");
                }
            }

        } while (!flag);
    }


    private static boolean isPalindrome(String something) {
        String cleaner = something.replaceAll("\\s", "").toLowerCase();
        int left = 0;
        int right = cleaner.length() - 1;

        while (left <= right) {
            if (cleaner.charAt(left) != cleaner.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}





//This is the One-to-One translation from java to python
/*
 * def is_palindrome(something):
    cleaner = ''.join(something.split()).lower()
    left, right = 0, len(cleaner) - 1

    while left <= right:
        if cleaner[left] != cleaner[right]:
            return False
        left += 1
        right -= 1

    return True

def main():
    flag = False

    while not flag:
        input_str = input("Please enter a string to check if it is a palindrome or enter 'exit' to leave:\n")

        if input_str.lower() == 'exit':
            flag = True
        else:
            if is_palindrome(input_str):
                print("This is a palindrome.")
            else:
                print("Sorry, but this is not a palindrome.")

if __name__ == "__main__":
    main()
*/

