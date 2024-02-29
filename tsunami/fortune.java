public class fortune {
    public static void main(String[] args) {
        int min = 1;
        int max = 999;
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);

        if (random_int >= 500)
            System.out.println("lucky, you rolled " + random_int);
        else
            System.out.println("open wide lucky luke, you rolled " + random_int);

    }
}
