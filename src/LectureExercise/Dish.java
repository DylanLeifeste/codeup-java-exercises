package LectureExercise;

public class Dish {

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

public void printSummary(){
    System.out.printf("Dish name: %s\n", nameOfDish);
    System.out.printf("Price: $%d\n", costInCents);
    System.out.printf("Chef Recommended: %b\n", wouldRecommend);
}

}
