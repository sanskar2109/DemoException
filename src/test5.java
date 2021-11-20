public class test5 {
    public static void main(String[] args) {
        Thread obj=new Thread(() -> {
            System.out.println("hello");

        });
        obj.start();
        for (int i=0;i<10;i++){
            System.out.println("main thread");
        }
    }
}
