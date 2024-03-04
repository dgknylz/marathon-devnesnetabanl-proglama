public class Main {

    public static void main(String[] args) {
        String[] students = {"Ali", "Ayşe", "Mehmet", "Fatma", "Mustafa"};
        int[] times = {210, 190, 220, 180, 200};

        Marathon manager = new Marathon(students, times);

        manager.printTopThree();
        manager.printLowestTimeStudent();
        manager.printSecondBestTime();
        manager.classifyStudents();
    }
}

