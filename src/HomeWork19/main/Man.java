package HomeWork19.main;


public class Man {
   private String name;
   private String position;
   private int age;
   private double growth;

   public Man(String name,String position, int age, double growth) {
       this.name = name;
       this.position = position;
       this.age = age;
       this.growth = growth;
   }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public double getGrowth() {
        return growth;
    }
}
class Main {
    public static void main(String[] args) {
        String sourceData = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист";
        String name =sourceData.substring(4, 8);
        String ageString =sourceData.substring(14, 16);
        int age = Integer.parseInt(ageString);
        String growthString = sourceData.substring(32, 37);
        double growth = Double.parseDouble(growthString);
        String position = sourceData.substring(54, 65);
        Man man = new Man(name, position, age, growth);
        System.out.println(man.getName() + " " + man.getPosition() + " " + man.getAge() + " " + man.getGrowth() + " ");


    }
}