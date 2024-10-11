import java.util.*;


public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    InputList inputList = new InputList();
    InputSet inputSet = new InputSet();
    InputMap inputMap = new InputMap();

    String dataStr = sc.nextLine();

    switch (dataStr) {
      case "List":
        inputList.listRecipe(dataStr);
        break;
      case "Set":
        inputSet.SetRecipe(dataStr);
        break;
      case "Map":
        inputMap.MapRecipe(dataStr);
        break;
    }


  }
}

//list class
class InputList {

  ArrayList<String> inputListValue = new ArrayList<>();
  Scanner scList = new Scanner(System.in);

  InputList() {
  }

  public void listRecipe(String dataStr) {
    String recipe;

    while (true) {
      recipe = scList.nextLine();
      if (recipe.equals("끝")) {
        break;
      } else {
        inputListValue.add(recipe);
      }
    }

    System.out.println("[ " + dataStr + " 으로 저장된 " + inputListValue.get(0) + " ]");
    for (int i = 0; i < inputListValue.size(); i++) {
      System.out.println(i + 1 + ". " + inputListValue.get(i));
    }
  }
}

class InputSet {

  Set<String> inputSetValue = new LinkedHashSet<>();
  Scanner scSet = new Scanner(System.in);

  InputSet() {
  }

  public void SetRecipe(String dataStr) {
    String recipe;
    String recipeTitle = scSet.nextLine();
    while (true) {
      recipe = scSet.nextLine();
      if (recipe.equals("끝")) {
        break;
      } else {
        inputSetValue.add(recipe);
      }

    }
    System.out.println("[ " + dataStr + " 으로 저장된 " + recipeTitle + " ]");
    int i = 1;
    for (String value : inputSetValue) {
      System.out.println(i + ". " + value);
      i++;
    }
  }

}

class InputMap {

  Map<Integer, String> inputMap = new TreeMap<>();
  Scanner scMap = new Scanner(System.in);

  InputMap() {
  }

  public void MapRecipe(String dataStr) {
    String recipe;
    String recipeTitle = scMap.nextLine();
    int i = 1;
    while (true) {
      recipe = scMap.nextLine();
      if (recipe.equals("끝")) {
        break;
      } else {
        inputMap.put(i, recipe);
        i++;
      }
    }
    System.out.println("[ " + dataStr + " 으로 저장된 " + recipeTitle + " ]");
    int j = 1;
    for (String key : inputMap.values()) {
      System.out.println(j + ". " + key);
      j++;
    }
  }

}