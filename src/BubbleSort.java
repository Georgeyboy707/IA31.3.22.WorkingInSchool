import java.util.Random;

      /*
      set swapped to true
      set sorted_count to 0
      while swapped = true:
          set swapped to false
              for i = 0 to array.length -1 - sorted_count:
                  if array[i] and array[i+1] are out of order:
                      swap them over
                      set swapped to true
              increment sorted_count
      */

public class BubbleSort {

    public static void BubbleSort(String[] args) {

        //String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //char[] splitAlpha = alphabet.toCharArray();

        String[] name;
        name = new String[100];


        boolean swapped = true;
        int sortedCount = 0;
        int[] numbers;
        numbers = new int[100];
        String tempVar = "a";
        int upperbound = 100;


        name[1] = "Alfred";
        name[2] = "Beatrice";
        name[3] = "Catherine";



//splits the alphabet into a char array with the alphabet in it
        //for (int i = 0; i < alphabet.length(); i++) {
        //   splitAlpha[i] = alphabet.charAt(i);
        //}



        while (swapped == true) {
            swapped = false;
            for (int i = 0; i < name.length - 1; i++) {

                if (posFirstLetter(name[i]) > posFirstLetter(name[i + 1])){

                    tempVar = name[i];
                    name[i] = name[i + 1];
                    name[i + 1] = tempVar;

                    swapped = true;
                }
            }
        }


        for (int i = 0; i < numbers.length - 1; i++) {

            System.out.println(numbers[i]);

        }




    }

    public static int posFirstLetter (String name){
        int num = 0;
        char firstLetter;

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] splitAlpha;// = alphabet.toCharArray();
        splitAlpha = new char[30];



        for (int i = 0; i < alphabet.length(); i++) {
            splitAlpha[i] = alphabet.charAt(i);
        }


        firstLetter = name.charAt(1);


        for (int i = 0; i < 26; i++) {
            if (firstLetter == splitAlpha[i]){
                num = i;

            }

        }

        return num;

    }
}



