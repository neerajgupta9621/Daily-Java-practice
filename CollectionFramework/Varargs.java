package CollectionFramework;

class Varargs {
  public static String concatenateString(String... args) {
    StringBuilder sb = new StringBuilder();
    for (String str : args) {
      sb.append(str).append(" ");
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(concatenateString("Mala","Neeraj"));
    System.out.println(concatenateString("Neeraj","Weds","Mala"));
       System.out.println(concatenateString("Monika","is","My","Friend"));
    String result = concatenateString("Aman", "and", "Nikita", "is", "Friend");
    System.out.println(result);
    
  }
}
