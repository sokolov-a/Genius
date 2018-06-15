public class IfClassLesson {
    public static void main (String[] args) {
        int x=1;
        while (x<10) { x = x + 1;
        if (x==3)
            System.out.println("x должен равняться 3");
        }
        System.out.println("А это будет выполняться в любом случае");
    }
}
