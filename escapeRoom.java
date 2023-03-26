
/*
Name: Vincent Wong
Date: 2022
Purpose: To create an Escape Room Scenario inside a Trampoline Park.
*/

import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // Variables
    int puzzle = 0, guessesP10 = 1, flashlight = 0, vowels = 0, vowels2 = 0, vowels3 = 0, vowels4 = 0, vowels5 = 0,
        menu = 0, PC1, PC2, PC3, PC4, PC5, input1 = 0, input2, input3, input4, input5; /* PC: PLAYER:CONSONANT; */

    String Player1, Player2, Player3, Player4, Player5, finalDecision, guess, playerNames, locate1, lock1, selection1,
        continue1 = "N", topcode1 = "04251", code1, cont1 = "N", decision3 = "N", animal1 = "Lion", animal2 = "Coyote",
        animal3 = "Bird", animal4 = "Mouse", aniaml5 = "Worm", Animal1, Animal2, Animal3, Animal4, Animal5,
        complete = "N", option, colors, c1 = "RED", c2 = "RED", c3 = "GREEN", c4 = "BLUE", c5 = "PURPLE"; // ANSWERS;
    String code, right, straight, left, r1, behind;

    // Loop whole program
    do {
      // Menu
      clearScreen();
      System.out.println(
          "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]\n\n\t\t\tESCAPE SKYZONE\n\n[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");

      System.out.println("\n\n1. Play Game\n\n2. About Escape Games\n\n3. Quit");

      // Loop check input
      boolean valid = false;
      do {
        System.out.print("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nWhat would you like to do?(#): ");
        try {
          menu = input.nextInt();

          // Check if input is valid
          if (menu > 3 || menu < 1) {
            System.out.println("Invalid! Input a Number 1-3!");
          } else {
            valid = true;
          }
        } catch (InputMismatchException e) {
          System.out.println("Invalid! Input a Number 1-3!");
          String flush = input.next();
        }
      } while (!valid || menu > 3 || menu < 1);

      // Check what to run
      if (menu == 1) {
        // User Input for roles

        clearScreen();
        System.out.print(
            "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]\n\n\t\t\t\t\t\tESCAPE SKYZONE\n\n[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]\n");
        System.out.println("\n\n\nEnter names for players:\n(If not enough players enter a random name): ");
        System.out.print("\nPlayer 1: ");
        Player1 = input.next();
        System.out.print("\nPlayer 2: ");
        Player2 = input.next();
        System.out.print("\nPlayer 3: ");
        Player3 = input.next();
        System.out.print("\nPlayer 4: ");
        Player4 = input.next();
        System.out.print("\nPlayer 5: ");
        Player5 = input.next();

        Player1 = Player1.toUpperCase();
        Player2 = Player2.toUpperCase();
        Player3 = Player3.toUpperCase();
        Player4 = Player4.toUpperCase();
        Player5 = Player5.toUpperCase();

        // Stop until enter
        System.out.print("\n< Press \"Enter\" to Continue >");
        input.nextLine();
        input.nextLine();

        // Beginning
        clearScreen();
        System.out.print(
            "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]\n\n\t\t\t\t\t\tESCAPE SKYZONE\n\n[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]\n\n");
        System.out.print("\n\n\nIt's " + Player1 + "'s birthday party.");
        pause(3000);
        System.out.println(" You and your friends are at a trampoline park to celebrate their birthday.");
        pause(3000);
        System.out.println(" It's getting late and you're all asked to leave the park as it is about to close.");
        pause(3000);
        System.out.println((" ") + Player2
            + " gives the bright idea to split up and hide past closing time... When you suddenly hear a screech...");
        // Stop until enter
        System.out.println("\n< Press \"Enter\" to Continue >");
        input.nextLine();
        clearScreen();

        // Puzzle #1
        puzzle += 1;
        System.out.print(
            "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]\n\n\t\t\t\t\t\tESCAPE SKYZONE\n\n[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]\n\n");
        System.out.println("The lights turn pitch black and you scramble to find your friends...");
        pause(4000);
        System.out.print(" You find yourself all alone and decide it would be best to look for a flashlight.");
        pause(4000);
        System.out.print(
            " You remember that a safety light is connected to your lanyard that earlier, you dropped in the foam pit.");
        pause(4000);
        System.out.print(" Your heart begins to pace as you don’t know where to go.");
        pause(4000);
        System.out.println(
            " You start running in the direction that you remembered it being in but you crash into a cabinet.");
        pause(4000);
        System.out.println(" An envelope lands on your head.");
        pause(4000);
        System.out.print(" You decide to take it with you as you can't read it in the dark.");
        pause(4000);
        System.out.println(" Maybe it will be of help later on.");
        pause(4000);
        System.out.print(" Finally, you catch a small glimpse of the foam pit");
        pause(4000);
        System.out.println(", but there's a gate.");
        pause(4000);
        System.out.println("You quickly climb over the gate and fall directly into the pit...");
        pause(4000);
        System.out.println("Search for your flashlight.");
        pause(4000);

        System.out.print("Did you find the flashlight? (Y/N): ");
        locate1 = input.next(); // Interactive Question with User Input
        while (!locate1.equalsIgnoreCase("Y") && !locate1.equalsIgnoreCase("N")) {
          System.out.print("Error! Enter (Y/N): ");
          locate1 = input.next();
        }

        while (!locate1.equalsIgnoreCase("Y")) { // If they couldn't find anything
          System.out.println("\nMaybe try and search a little deeper...\n");
          System.out.print("Did you find the flashlight? (Y/N): ");
          locate1 = input.next();

          // Error check
          while (!locate1.equalsIgnoreCase("Y") && !locate1.equalsIgnoreCase("N")) {
            System.out.print("Error! Enter (Y/N): ");
            locate1 = input.next();
          }
        }
        clearScreen();
        System.out.println(
            "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]\n\n\t\t\t\t\t\tESCAPE SKYZONE\n\n[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
        System.out.println("\nThere seems to be 3 different codes on the flashlight.");
        pause(2000);
        System.out.print(
            "\nYou realize the padlock has multiple ways to be unlocked. \n\nThe top is a number code, the middle is letters and the bottom code is more numbers.");
        pause(2000);
        // Reveal Puzzle

        do { // Back to "Menu" of what to configure
          System.out.print("\nWhat would you like to configure now? (Top/Middle/Bottom): ");
          lock1 = input.next();

          System.out.print("\n");

          if (lock1.equalsIgnoreCase("Top")) { // If user chooses top layer
            System.out.print("\nTOP LAYER:");

            do { // Loop for asking for the code
              System.out.print("\n\nEnter your code here: ");
              code1 = input.next(); // User input for code
              System.out.print("\nThat doesn't work, you change it back to what it was before...");

              System.out.print("\n\nWould you like to try another code? (Y/N): ");
              continue1 = input.next(); // Option to go back to "Menu"
              // Error check
              while (!continue1.equalsIgnoreCase("Y") && !continue1.equalsIgnoreCase("N")) {
                System.out.print("Error! Enter (Y/N): ");
                continue1 = input.next();
              }
            } while (!continue1.equalsIgnoreCase("N")); // Let's you put another code in if you don't decide to go back
                                                        // to "Menu"
          }

          else if (lock1.equalsIgnoreCase("Middle")) { // If user chooses middle layer
            System.out.print("\nMIDDLE LAYER:");

            do { // Loop for asking for the code
              System.out.print("\n\nEnter your code here: ");
              code1 = input.next(); // User input for code
              System.out.print("\nThat doesn't work, you change it back to what it was before...");

              System.out.print("Would you like to try another code? (Y/N): ");
              continue1 = input.next(); // Option to go back to "Menu"
              // Error check
              while (!continue1.equalsIgnoreCase("Y") && !continue1.equalsIgnoreCase("N")) {
                System.out.print("Error! Enter (Y/N): ");
                continue1 = input.next();
              }
            } while (!continue1.equalsIgnoreCase("N")); // Let's you put another code in if you don't decide to go back
                                                        // to "Menu"
          }

          else if (lock1.equalsIgnoreCase("Bottom")) { // If user chooses bottom layer
            System.out.print("\nBOTTOM LAYER:");

            do { // Loop for asking for the code
              System.out.print("\n\nEnter your code here: ");
              code1 = input.next(); // User input for code
              if (code1.equalsIgnoreCase(topcode1)) { // If code is correct
                System.out.print("\nThe gate opened! You must find your flashlight to search for your friends...");
                cont1 = "Y";
                continue1 = "N";
              } else { // If code is wrong
                System.out.print("\nThat doesn't work, you change it back to what it was before...");

                System.out.print("Would you like to try another code? (Y/N): ");
                continue1 = input.next();
                // Error check
                while (!continue1.equalsIgnoreCase("Y") && !continue1.equalsIgnoreCase("N")) {
                  System.out.print("Error! Enter (Y/N): ");
                  continue1 = input.next();
                }
              }
            } while (continue1.equalsIgnoreCase("Y")); // Let's you put another code in if you don't decide to go back
                                                       // to "Menu"
          }

        } while (cont1.equalsIgnoreCase("N")); // If code is correct it takes User out of code and into next Puzzle

        // Puzzle #2

        System.out.println(
            "\n\n\nAfter a bit of time you find your flashlight! You turn it on and quickly find your friends. ");
        pause(3000);
        System.out.print(
            "You all immediately start running to the main entrance with your flashlight as your guide, but the exit isn't there.");
        pause(3000);
        System.out.println(
            " Nothing is like what you remembered. This is no longer the trampoline place...\nYou continue to look around and find a locked door...");
        pause(3000);
        System.out.println(
            "\nYou scream for help but the echoes just bounce into the vast distance. You remember you picked up some sort of envelope.");
        pause(3000);

        // LAB Puzzle

        System.out.println("You open it and find a lab report. What can this mean?");
        pause(3000);
        // User Input
        System.out.print("\nYour friend thinks they found the code for the door and tries to enter the code: ");
        code = input.nextLine();
        while (!code.equalsIgnoreCase("The food chain")) {
          if (!code.equalsIgnoreCase("The food chain")) {
            System.out.println("ERROR!\n It seems like this may take a bit of reading...");
          } // end if
          System.out.println("\nTry and find the code for the door (You may used spaces): ");
          code = input.nextLine();

        }
        System.out.println("Correct!");
        pause(2000);
        System.out.println(
            "\nYou put the code in and as you open the door, it immediately gets slammed into your faces. “Someone doesn't want us to leave”, your friend says...");
        pause(2000);

        // Puzzle #3
        System.out.print(
            "\nYou suggest that since you and your friends are going to have to be here all night it only makes sense to look for food.");
        pause(4000);
        System.out.print(" You guys begin to wander this unknown place.");
        pause(4000);
        System.out.print(" The place that you remembered as a tampoline park.");
        pause(3000);
        System.out.print(" You wave your flashlight around...");
        pause(3000);
        System.out.println("\nYou find a sign labeled \"Cafeteria\".");
        pause(3000);
        System.out.println("\nAs you enter the cafeteria you find a large pizza and plates.");
        pause(3000);
        System.out.println("You distribute it amongst your friends.");
        pause(4000);
        System.out.println("Everyone begins to eat...");
        pause(3000);
        System.out.println("\n" + Player3 + ": What is this..? \n\nThey spit out a tooth...\n");
        pause(2000);

        System.out.println(Player2 + ": \"Was the pizza that stale?\"");
        pause(2000);
        System.out.print(Player3 + ": \"It's not mine...\"");
        pause(2000);
        System.out.print(
            "\n\nWhy is there a tooth in the pizza? Examine the tooth. What can this mean? Enter your findings below. Maybe you will need this info for later.");
        pause(2000);

        System.out.print("\n\nDid you examine the tooth? (Y/N): ");
        decision3 = input.next(); // Interactive Question
        while (!decision3.equalsIgnoreCase("Y")) { // If user hasn't found anything yet
          System.out.print("\n\nTry and look a little closer. Did you find anything? (Y/N): ");
          decision3 = input.next();
        }

        System.out.print(
            "\n\nThere seems to be a bunch of animals on the tooth. But why? Maybe they're trying to hint at something. Maybe theres an order... Try entering them into the locked kitchen console to your left.");
        pause(2000);
        do { // Ask for the order of animals

          System.out.print("\n\nEnter your first animal: ");
          Animal1 = input.next();
          System.out.print("Enter your second animal: ");
          Animal2 = input.next();
          System.out.print("Enter your third animal: ");
          Animal3 = input.next();
          System.out.print("Enter your fourth animal: ");
          Animal4 = input.next();
          System.out.print("Enter your fifth animal: ");
          Animal5 = input.next();

          if (!Animal1.equalsIgnoreCase("Lion") || // Check's if animals are wrong
              !Animal2.equalsIgnoreCase("Coyote") ||
              !Animal3.equalsIgnoreCase("Bird") || !Animal4.equalsIgnoreCase("Mouse")
              || !Animal5.equalsIgnoreCase("Worm")) {
            System.out.print(
                "\nERROR! ERROR!\n\nAt least one of the animals must of been in the wrong order. Try and find a pattern.");

          }

          // Check's the correct order of the animals
        } while (!Animal1.equalsIgnoreCase("Lion") || !Animal2.equalsIgnoreCase("Coyote")
            || !Animal3.equalsIgnoreCase("Bird") || !Animal4.equalsIgnoreCase("Mouse")
            || !Animal5.equalsIgnoreCase("Worm"));

        System.out.print(
            "\n\nThe console accepted the order of the animals. You realize that's the order of the food chain in terms of those animals. What can this mean?");
        pause(3000);

        // Puzzle #4
        System.out.println(
            "\n\n\nYou decide it would be best to throw the pizza away and resume looking for a way to leave the park.");
        pause(3000);
        System.out.println("You all get up to leave, but as you do, the parks’ lights turn red.");
        pause(2000);
        System.out.println("Look closely at the wall.");
        pause(2000);
        System.out.println("There is something written there...");
        pause(2000);
        System.out.println("\n<<<<WALL>>>>\n");
        pause(2000);
        System.out.println("\n" + Player1 + "\n" + Player2 + "\n" + Player3 + "\n" + Player4 + "\n" + Player5);
        pause(2000);
        System.out.println("\nThere seems to be something up with our names.\nThink C  a  R  e  F  u  LL  Y.\n");
        System.out.print("It's your name....");
        pause(2000);
        System.out.println(" and not only yours, but your friends as well.");
        pause(2000);
        // PLAYER 1: LOOP through each consonant/vowel
        for (int x = 0; x < Player1.length(); x++) {// x<Player1.length (); records number of characters in name
          if (Player1.charAt(x) == ('A') || Player1.charAt(x) == ('E') || Player1.charAt(x) == ('I')
              || Player1.charAt(x) == ('O') || Player1.charAt(x) == ('U')) {
            vowels++;
          } // END if
        } // END Loop PLAYER1
          // CONSONANTS CALCULATION PLAYER1
        PC1 = Player1.length() - vowels;
        boolean again = false;
        // INPUT: Player 1 consonants
        do {
          System.out.print("\nEntry 1: ");
          try {
            input1 = input.nextInt();
            again = true;
            while (input1 != PC1) {
              System.out.println("INCORRECT. Please try again.");
              System.out.print("\nEntry 1: ");
              input1 = input.nextInt();
            } // END while loop PLAYER 1
          } catch (InputMismatchException e) {
            System.out.println("ERROR. Please try again.");
            String flush = input.next();
          } // end catch
        } while (!again);

        System.out.println("Correct! Let's move on to the next part...");
        // PLAYER 2: LOOP through each consonant/vowel
        for (int x = 0; x < Player2.length(); x++) {
          if (Player2.charAt(x) == ('A') || Player2.charAt(x) == ('E') || Player2.charAt(x) == ('I')
              || Player2.charAt(x) == ('O') || Player2.charAt(x) == ('U')) {
            vowels2++;
          } // END if
        } // END Loop PLAYER2
          // CONSONANTS CALCULATION PLAYER2
        PC2 = Player2.length() - vowels2;

        boolean again2 = false;
        // INPUT: Player 2 consonants
        do {
          System.out.print("\nEntry 2: ");
          try {
            input2 = input.nextInt();
            again2 = true;
            while (input2 != PC2) {
              System.out.println("INCORRECT. Please try again.");
              System.out.print("\nEntry 2: ");
              input2 = input.nextInt();
            } // END while loop PLAYER 2
          } catch (InputMismatchException e) {
            System.out.println("ERROR. Please try again.");
            String flush = input.next();
          } // end catch
        } while (!again2);

        System.out.println("Correct! Let's move on to the next part...");
        // PLAYER 3: LOOP through each consonant/vowel
        for (int x = 0; x < Player3.length(); x++) {
          if (Player3.charAt(x) == ('A') || Player3.charAt(x) == ('E') || Player3.charAt(x) == ('I')
              || Player3.charAt(x) == ('O') || Player3.charAt(x) == ('U')) {
            vowels3++;
          } // END if
        } // END Loop PLAYER3
          // CONSONANTS CALCULATION PLAYER3
        PC3 = Player3.length() - vowels3;

        boolean again3 = false;
        // INPUT: Player 3 consonants
        do {
          System.out.print("\nEntry 3: ");
          try {
            input3 = input.nextInt();
            again3 = true;
            while (input3 != PC3) {
              System.out.println("INCORRECT. Please try again.");
              System.out.print("\nEntry 3: ");
              input3 = input.nextInt();
            } // END while loop PLAYER 1
          } catch (InputMismatchException e) {
            System.out.println("ERROR. Please try again.");
            String flush = input.next();
          } // end catch
        } while (!again3);

        System.out.println("Correct! Let's move on to the next part...");
        // PLAYER 4: LOOP through each consonant/vowel
        for (int x = 0; x < Player4.length(); x++) {// x<Player4.length (); records number of characters in name
          if (Player4.charAt(x) == ('A') || Player4.charAt(x) == ('E') || Player4.charAt(x) == ('I')
              || Player4.charAt(x) == ('O') || Player4.charAt(x) == ('U')) {
            vowels4++;
          } // END if
        } // END Loop PLAYER4
          // CONSONANTS CALCULATION PLAYER4
        PC4 = Player4.length() - vowels4;

        boolean again4 = false;
        // INPUT: Player 4 consonants
        do {
          System.out.print("\nEntry 4: ");
          try {
            input4 = input.nextInt();
            again4 = true;
            while (input4 != PC4) {
              System.out.println("INCORRECT. Please try again.");
              System.out.print("\nEntry 4: ");
              input4 = input.nextInt();
            } // END while loop PLAYER 4
          } catch (InputMismatchException e) {
            System.out.println("ERROR. Please try again.");
            String flush = input.next();
          } // end catch
        } while (!again4);

        System.out.println("Correct! Let's move on to the next part...");
        // PLAYER 5: LOOP through each consonant/vowel
        for (int x = 0; x < Player5.length(); x++) {
          if (Player5.charAt(x) == ('A') || Player5.charAt(x) == ('E') || Player5.charAt(x) == ('I')
              || Player5.charAt(x) == ('O') || Player5.charAt(x) == ('U')) {
            vowels5++;
          } // END if
        } // END Loop PLAYERS
          // CONSONANTS CALCULATION PLAYER5
        PC5 = Player5.length() - vowels5;

        boolean again5 = false;
        // INPUT: Player 5 consonants
        do {
          System.out.print("\nEntry 5: ");
          try {
            input5 = input.nextInt();
            again5 = true;
            while (input5 != PC5) {
              System.out.println("INCORRECT. Please try again.");
              System.out.print("\nEntry 5: ");
              input5 = input.nextInt();
            } // END while loop PLAYER 5
          } catch (InputMismatchException e) {
            System.out.println("ERROR. Please try again.");
            String flush = input.next();
          } // end catch
        } while (!again5);
        System.out.println("\n\nCorrect! You've made it past this stage. It looks like the door has unlocked!");

        // Puzzle #5 (TN)
        System.out.println(
            "\n\nYou finally open the door. As you walk through a deserted hallway, you notice a pattern of lights play with each step you take.\n\n");
        pause(2000);
        System.out.print("RED...");
        pause(1000);
        System.out.print("\t\tRED...");
        pause(1000);
        System.out.print("\t\tGREEN...");
        pause(1000);
        System.out.print("\t\tBLUE...");
        pause(1000);
        System.out.println("\t\tPURPLE...");
        pause(4000);
        clearScreen();

        System.out.println("\nWhen you get to the end of the hall, you see a screen light up.");
        pause(2000);
        System.out.println("Oh...");
        pause(2000);
        System.out.println("It looks like there's colored buttons.");
        pause(2000);
        System.out.print("\n(1. walk back?)\n(2. enter the colors?)\n\nWhat would you like to do next (1 or 2): ");
        option = input.next();

        // error check options
        while (!option.equals("1") && !option.equals("2")) {
          System.out.println("\nERROR! Please enter either 1 or 2.");
          System.out.print("\n(1. walk back?)\n(2. enter the colors?)\n\nWhat would you like to do next (1 or 2): ");
          option = input.next();
        } // end check for 1 or 2
          // bc you r going to walk bachwards, the pattern plays backwards
        if (option.equalsIgnoreCase("1")) {
          System.out.println(
              "You and the group decide to walk back. As you walk back, a pattern of lights play with each step you take.");
          pause(2000);
          System.out.print("\nPURPLE...");
          pause(1000);
          System.out.print("\t\tBLUE...");
          pause(1000);
          System.out.print("\t\tGREEN...");
          pause(1000);
          System.out.print("\t\tRED...");
          pause(1000);
          System.out.println("\t\tRED...");
          pause(4000);

          clearScreen();
          System.out.println("\nIt seems like the door must've locked behind you when you first entered the room.");
          pause(2000);
          System.out.println("With no other choice, it looks like you MUST enter the colors. ");
          pause(2000);
          System.out.println("As you proceed forward, a pattern of lights play with each step you take.");
          pause(2000);
          System.out.print("\nRED...");
          pause(1000);
          System.out.print("\t\tRED...");
          pause(1000);
          System.out.print("\t\tGREEN...");
          pause(1000);
          System.out.print("\t\tBLUE...");
          pause(1000);
          System.out.println("\t\tPURPLE...");
          pause(4000);

          clearScreen();
          System.out.println("You and the group decide to proceed to enter the colors.");

          do {
            if (!c1.equalsIgnoreCase("red") || !c2.equalsIgnoreCase("red") || !c3.equalsIgnoreCase("green")
                || !c4.equalsIgnoreCase("blue") || !c5.equalsIgnoreCase("purple")) {
              System.out.println("INCORRECT! Please try again!");
            }
            System.out.print("Enter color #1: ");
            c1 = input.next();
            System.out.print("Enter color #2: ");
            c2 = input.next();
            System.out.print("Enter color #3: ");
            c3 = input.next();
            System.out.print("Enter color #4: ");
            c4 = input.next();
            System.out.print("Enter color #5: ");
            c5 = input.next();
          } while (!c1.equalsIgnoreCase("red") || !c2.equalsIgnoreCase("red") || !c3.equalsIgnoreCase("green")
              || !c4.equalsIgnoreCase("blue") || !c5.equalsIgnoreCase("purple"));
          System.out.println("Correct! You may proceed forwards.");

        } // end if: walk back

        else if (option.equalsIgnoreCase("2")) {
          System.out.println("You and the group decide to proceed to enter the colors.");

          do {
            if (!c1.equalsIgnoreCase("red") || !c2.equalsIgnoreCase("red") || !c3.equalsIgnoreCase("green")
                || !c4.equalsIgnoreCase("blue") || !c5.equalsIgnoreCase("purple")) {
              System.out.println("INCORRECT! Please try again!");
            }
            System.out.print("\nEnter color #1: ");
            c1 = input.next();
            System.out.print("Enter color #2: ");
            c2 = input.next();
            System.out.print("Enter color #3: ");
            c3 = input.next();
            System.out.print("Enter color #4: ");
            c4 = input.next();
            System.out.print("Enter color #5: ");
            c5 = input.next();
          } while (!c1.equalsIgnoreCase("red") || !c2.equalsIgnoreCase("red") || !c3.equalsIgnoreCase("green")
              || !c4.equalsIgnoreCase("blue") || !c5.equalsIgnoreCase("purple"));
          System.out.println("Correct! You may proceed forwards.");
          pause(2000);
        } // end check for 1 or 2

        System.out.println(
            "\n\n\nYou and your friends walk through the narrow hallway and find an opened room which you decide to enter.");
        pause(2000);

        // Puzzle #6
        System.out.print("\n\n\n" + Player5.toUpperCase() + ": What's this?");
        pause(2000);
        System.out.print("\nOn the screen, there seems to be a slide show being displayed on a projector.");

        // VARIABLES
        int code6 = 0;

        System.out.println("\nThere are 4 slides in total, each displaying a different animal.");

        System.out.println("\nLeopard\nEagle\nGoldfish\nSpider");
        // USER INPUT
        System.out.println("\nEnter the code: ");
        code6 = input.nextInt();
        // CHECK
        if (code6 == 4208) {
          System.out.println("\nCongratulations! You have solved the puzzle!");
        } else {
          do {
            System.out.println("\nEnter the code: ");
            code6 = input.nextInt();
          } while (code6 != 4208);
        }
        System.out.println("After entering the code, you and your friends hear a door open.");
        pause(2000);

        // Puzzle #7
        System.out.println("\n\n\nAs you guys enter the room, spikes fall from the ceiling!");
        pause(2000);
        System.out.println("\n\n\n" + Player2.toUpperCase() + ": AHHHHH!!");
        pause(2000);
        System.out.println("\n\n\n" + Player4.toUpperCase() + ": WHAT WAS THAT!?!?");
        pause(2000);
        System.out.println("Spikes fall periodically 7 different times in differing amounts.\n9\n19\n5\n5\n25\n15\n21");
        pause(3000);
        System.out.println("Maybe there's a hidden code you'll need before you may progress...");
        pause(1500);
        // VARIABLES
        String spikes;
        // USER INPUT
        System.out.println("\nEnter the code: ");
        spikes = input.next();
        // CHECK
        if (spikes.equalsIgnoreCase("ISEEYOU")) {
          System.out.println("\nI. See. You.");
          System.out.println("\n. . .");
          System.out.println("\nThe wall infront of you opens up, revealing a secret passageway.");
        } else {
          do {
            System.out.println("\nEnter the code: ");
            spikes = input.next();
          } while (!spikes.equalsIgnoreCase("ISEEYOU"));
        }

        // Puzzle #8
        puzzle = 8;
        // Output details
        System.out.println("\n\n\nYou enter a science lab and look around for clues on how to escape");
        pause(3000);
        System.out.println("You see a door with a lock that requires a passcode to unlock");
        pause(3000);
        System.out.println(
            "As you look around the room you spot a periodic table, some sort of list, and letters on the wall");
        pause(3000);
        System.out.println("\n\n<<<<WALL>>>>\nH2\n+\nO2\n->\n?");

        // loop asking for input
        do {

          // Input
          System.out.print("\nEnter the password for the lock: ");
          guess = input.next().toLowerCase();

          // Check/Output
          switch (guess) {

            // If code is correct
            case ("water"):
              System.out.println("Unlocked!");
              puzzle += 1;
              break;

            // If code is incorrect
            default:
              System.out.println("The lock doesn't budge!\nTry again!");
          }// End switch case check
        } while (puzzle == 8); // end loop
        // Puzzle #9
        // Instructions will be already given in the physical lab report.
        System.out.println("\n\nNow you and your friends are inside the bathroom. You're all looking for a way out.");
        pause(4000);
        System.out
            .println("Since the bathroom is very cold. One of your friends says that there must be a vent in here. ");
        pause(4000);
        System.out.println("You all look around but can't see the vent.");
        pause(4000);
        System.out.println(
            "You and your friends needs to take specific steps to find the vent.\n\nDirectional Options: Left, right, straight, behind\n");
        pause(3000);

        // START loop
        do {
          System.out.print("\nWhich way do you want to go 1st: ");
          right = input.next();

          System.out.print("Which way do you want to go 2nd: ");
          straight = input.next();

          System.out.print("Which way do you want to go 3rd: ");
          left = input.next();

          System.out.print("Which way do you want to go 4th: ");
          r1 = input.next();

          System.out.print("Which way do you want to go 5th: ");
          behind = input.next();
          clearScreen();
          System.out.println("Now you and your friends are inside the bathroom. You're all looking for a way out.");
          System.out
              .println("Since the bathroom is very cold. One of your friends says that there must be a vent in here. ");
          System.out.println("You all look around but can't see the vent.");
          System.out.println("You and your friends needs to take specific steps to find the vent.");

        } while (!right.equalsIgnoreCase("right") || !straight.equalsIgnoreCase("straight")
            || !left.equalsIgnoreCase("left") || !r1.equalsIgnoreCase("right") || !behind.equalsIgnoreCase("behind"));
        pause(2000);
        // END loop
        System.out.println("\nThe vent is behind you. You remove the cover from the vent,");
        pause(3000);
        System.out.println("and shout: \"I found the vent!\"");

        // Puzzle #10
        puzzle = 10;
        // Output details
        System.out.println("\n\n\nYou and your friends gathered around vent and try to climb inside.");
        pause(3000);
        System.out.println("There is a mesh screen and you try to open it, but it won't budge.");
        pause(2000);
        System.out.println("You realize there is a lock that requires a five digit combination.");
        pause(2000);
        System.out.println("You decide to crawl out the vent and search the washroom for clues.");
        pause(2000);
        System.out
            .println("You look around the washroom and find an old advertisement poster for the trampoline park.");
        pause(3000);
        System.out.println("The poster might have some useful information...\n\n\n");
        pause(1000);

        // Loop asking for input
        do {

          // Input
          System.out.print("\nEnter the code (#): ");
          guess = input.next();

          // Check if code is correct/output
          switch (guess) {

            // Code is correct
            case ("32946"):
              System.out.println("Unlocked!");
              puzzle++;
              break;

            // Code is incorrect
            default:
              System.out.println("The lock doesn't budge!\nTry again!");

              // Give hint if the user struggles to find the code after 5 attempts. This will
              // only print 1 time after 5 attempts
              if (guessesP10 == 5 && !guess.equals("32946")) {
                System.out.println(
                    "\nStruggling to find the code? Once you find the second digit try to understand why it's the second digit.\nThis should help with finding every digit of the code.");

              } // end if statement

              guessesP10++;
          }// end switch case

        } while (puzzle == 10); // end loop

        // End
        System.out.println("\n\n\nYou and your friends finally open the vent.");
        pause(3000);
        System.out.println("You are all climbing in one by one.");
        pause(3000);
        System.out.println("You can see the light at the end of the tunnel...");
        pause(3000);
        System.out.println("A chill runs down your spine...");
        pause(3000);
        System.out.println("As you get closer, you realize that you and your friends are not the only ones in there.");
        pause(3000);
        System.out.println("A scary figure begins coming towards you.");
        pause(3000);
        System.out.println("There’s a split in the vent and you guys don’t know which way to go.");
        pause(3000);
        System.out.println("Divide in pairs and decide which pair is going left or going right...");
        pause(5000);
        System.out.println("You must decide fast before it comes for you...");

        System.out.print("\n\n\nY O U   M U S T   D E C I D E ! (Left/Right): ");
        finalDecision = input.next();

        // End (Right)
        if (finalDecision.equalsIgnoreCase("right")) {

          System.out.println("\n\n\nYou and your buddy are about to escape, but you hear a scream behind you.");
          pause(3000);
          System.out.println("You know what has happened, but you know you can’t turn back.");
          pause(3000);
          System.out.println("As you enter the bright light,  you realize you’re at the back of a facility.");
          pause(3000);
          System.out.println("You haven’t actually escaped at all.");
          pause(3000);
          System.out.println("You’ve only walked right into their trap.");
          pause(3000);
          System.out.println("You feel nauseous and suddenly pass out.");
          pause(3000);
          System.out.println("You wake up on a hospital bed with a doctor.");
          pause(2000);
          System.out.println("The room is completely red.");
          pause(2000);
          System.out.println("This isn't just any doctor.");
          pause(2000);
          System.out.println("It’s the same mysterious figure.");
          pause(2000);
          System.out.println("It begins to show you it's “trophies”...");
          pause(3000);
          System.out.println("Something about them feels familiar...");
          pause(3000);
          System.out.println("It says you’ll be the next addition to it's collection...");
          // Return to menu after hitting "ENTER"
          System.out.print(" \n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
          System.out.println("\n[ Press \"Enter\" to Return to Menu ]");
          input.nextLine();
          input.nextLine();

        } else if (finalDecision.equalsIgnoreCase("left")) {

          // End (Left)

          System.out.print(
              "\n\n\nYou continue in the vent and you look behind to check on your friend, but they aren’t there anymore...");
          pause(3000);
          System.out.print("You look forward and you suddenly feeling numb...");
          pause(5000);
          clearScreen();
          System.out.print("\n\n\nYOU");
          pause(1000);
          System.out.print(" WERE");
          pause(1000);
          System.out.println(" CAUGHT...");
          // Return to menu after hitting "ENTER"
          System.out.print(" \n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
          System.out.println("\n[ Press \"Enter\" to Return to Menu ]");
          input.nextLine();
          input.nextLine();
        } else {

          // End (Didn't Choose left or right)

          clearScreen();
          System.out.print("\n\n\nYou couldn't decide fast enough, and suddenly everything goes black...");
          pause(3000);
          clearScreen();
          System.out.print("\n\n\nYOU");
          pause(1000);
          System.out.print(" WERE");
          pause(1000);
          System.out.println(" CAUGHT...");
          // Return to menu after hitting "ENTER"
          System.out.print(" \n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
          System.out.println("\n[ Press \"Enter\" to Return to Menu ]");
          input.nextLine();
          input.nextLine();
        }
      } // End escape room game/Start "About Escape game"
      else if (menu == 2) {

        // Print Details
        clearScreen();
        System.out.println(
            "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]\n\n\t\t\t\t\t\tESCAPE SKYZONE\n\n[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]\n\n");
        System.out.println(
            "An escape room also known as an escape game, puzzle room, exit game, or riddle room\nis a game in which the player(s) have to find and use clues to complete puzzles\nand, in most cases, escape in a set time or in the least amount of time possible. ");
        System.out.println(
            "\n\nIn this escape room your goal is to use the given clues to escape in 60 minutes or in the least amount of time possible.\nSome clues are even hidden in the room and story so look carefully!");
        System.out.println("\n\nExtra rules:\n- No Phones\n- Don't use the Internet\n- Have Fun!");

        // Return to menu after hitting "ENTER"
        System.out.print("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        System.out.println("\n[ Press \"Enter\" to Return to Menu ]");
        input.nextLine();
        input.nextLine();
      } // End about escape game

    } while (menu != 3);

  }// DO NOT DELETE

  // TIME DELAY METHOD

  public static void pause(int ms) {

    try {
      Thread.sleep(ms);
    } catch (InterruptedException e) {
      System.err.format("IOException: %s%n", e);
    }
  }// END TIME DELAY METHOD

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    // DO NOT DELETE
  }
}
