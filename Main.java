import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Encryption or decryption. Write first letter");
        Scanner n = new Scanner(System.in);
        String choice = n.nextLine().toLowerCase();

        switch (choice) {
            case "e":
                Code.Encryption();
                break;

            case "d":
                Code.Dencryption();
                break;

            default:
                System.out.println("Wrong option");
        }

    }

    public class Code {
        public static void Encryption() {
            System.out.println("Write something");
            Scanner scanner = new Scanner(System.in);
            String message = scanner.nextLine().toLowerCase();

            System.out.println("Enter key: ");
            int key = scanner.nextInt();

            String userMessage = "";

            for (int i = 0; i < message.length(); i++) {
                if ((int) message.charAt(i) == 32) {
                    userMessage += (char) 32;
                } else if ((int) message.charAt(i) + key > 122) {
                    int temp = (message.charAt(i) + key) - 122;
                    userMessage += (char) (96 + temp);
                } else if ((int) message.charAt(i) + key > 90) {
                    int temp = (message.charAt(i) + key) - 90;
                    userMessage += (char) (64 + temp);
                } else if ((int) message.charAt(i) + key < 96) {
                    int temp = (message.charAt(i) + key) - 90;
                    userMessage += (char) (64 + temp);

                } else {
                    userMessage += (char) ((int) message.charAt(i) + key);
                }
            }
            System.out.println(userMessage);
        }

        public static void Dencryption() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Write encrypted message: ");
            String message = scanner.nextLine().toLowerCase();
            System.out.println("Enter key: ");
            int key = scanner.nextInt();

            String userMessage = "";

            for (int i = 0; i < message.length(); i++) {

                if ((int) message.charAt(i) == 32) {
                    userMessage += (char) 32;


                } else if (((int) message.charAt(i) - key) < 91) { //pakeicio cia

                    int temp = ((int) message.charAt(i) - key) + 26;
                    userMessage += (char) temp;

                } else if (((int) message.charAt(i) - key) > 96) {

                    int temp = ((int) message.charAt(i) - key) + 26;
                    userMessage += (char) temp;

                } else if (((int) message.charAt(i) - key) < 64) { //pakeicio cia
                    int temp = ((int) message.charAt(i) - key) + 26;
                    userMessage += (char) temp;

                } else {
                    userMessage += (char) ((int) message.charAt(i) + key);

                }

            }
            System.out.println(userMessage);
        }
    }

}


