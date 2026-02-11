public class AgeToGroup {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        int ageGroup = 1;
        ageGroup = (ageGroup <= 18) ? ageGroup : 0;
        ageGroup = (ageGroup >= 65) ? ageGroup : 2;     
        System.out.println("Age: " + age + ", Age Group: " + ageGroup);
    }
}
