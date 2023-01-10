import java.util.ArrayList;

class MainArrayList
{
  public static void main(String[] args) 
  {
    ArrayList<String> languages = new ArrayList<>();

    // add elements in the array list
    languages.add("Java");
    languages.add("CSS");
    languages.add("C++");
    System.out.println("ArrayList: " + languages);

    // change the element of the array list
    languages.set(2, "JavaScript");
    System.out.println("Modified ArrayList: " + languages);
    System.out.println("==========================================");
    System.out.println("Removing the CSS Language");

    //remove the element in the array list
    String s=languages.remove(1);
    System.out.println("Updated ArrayList: "+languages);
    System.out.println("Removed Element: "+s);
    System.out.print("============================================");

  }
}
