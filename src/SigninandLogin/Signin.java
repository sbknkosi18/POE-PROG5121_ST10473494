/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * This project was created with assistance from ChatGPT by OpenAI.
 * Suggestions were used for code structure and logic, with additional modifications and implementation done by me.
 * 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SigninandLogin;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */

public class Signin {
    public static void main(String[] args) {
        /**
     * @param args the command line arguments
     */    
        Scanner scanner = new Scanner(System.in);

        // Registration
        System.out.println("USER REGISTRATION");

        System.out.print("Enter username (must contain _ and be no more than 5 characters): ");
        String username = scanner.nextLine();

        System.out.print("Enter password (min 8 chars, capital letter, number, special char): ");
        String password = scanner.nextLine();

        System.out.print("Enter your cell phone number (must start with +27 and be 12 digits total): ");
        String cellNumber = scanner.nextLine();

        Login user = new Login(username, password, cellNumber);
        String registrationMessage = user.registerUser();

        System.out.println(registrationMessage);
        if (!registrationMessage.equals("User registered successfully.")) {
            System.out.println("Registration failed. Please restart the program.");
            return;
        }

        System.out.println("\nUSER LOGIN");
        System.out.print("Enter username: ");
        String loginUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String loginPassword = scanner.nextLine();

        System.out.println(user.returnLoginStatus(loginUsername, loginPassword));
    }
}


