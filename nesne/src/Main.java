public class Main {

    public static void main(String[] args) {
        String[] students = {"Kadir", "Gökhan","Hakan", "Suzan","Pınar","Mehmet","Ali","Emel","Fırat","James","Jale","Ersin","Deniz","Gözde","Anıl","Burak","Fatma", "Mustafa"};
        int[] times = {341,273, 278, 329, 445,402,388,270,243,334,412,393,299,343,317,265};

        Marathon manager = new Marathon(students, times);

        manager.printTopThree();
        manager.printLowestTimeStudent();
        manager.printSecondBestTime();
        manager.classifyStudents();
    }
}

