package Homework13;

public class Task3 {
    //3) Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling it is name.
  private String WordOfVowels (String str) {
      String newStr = str.replaceAll("[^aeiou]", "");
      return newStr;
  }

    public static void main(String[] args) {
        Task3 tester = new Task3();
        System.out.println(tester.WordOfVowels("aquarium"));


    }
}
