class Zahlenfiler {
  public static void main(String[] args) {
    System.out.println("Leia!");

    for(int number = 1; number <201; number++)
    {
      if(result_is_five(number) || end_with_number_9(number) || result_is_part_of_three(number));
        System.out.println(number);
    }
  }
  private static boolean result_is_five(int number)
  {
    if (number % 5 == 0)
    {
      System.out.println(number + "Zahl ist durch 5 teilbar");
      return true;
    }
    return false;
  }
   private static boolean end_with_number_9(int number)
  {
    if(number % 10 == 9)
    {
      System.out.println(number + "Zahl endet auf 9");
      return true;
    }
    return false;
  }
  private static boolean result_is_part_of_three(int number)
  {
    int prev = number + (number -1);
    if(prev %3 == 0)
    {
      System.out.println(number + "ZAHL und VORGÄNGER addiert ergeben ERGEBNIS und ERGEBNIS ist durch 3 teilbar");
      return true;
    }
    return false;
  }

}