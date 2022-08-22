public class Main {
    public static void main(String[]args){
        info();
    }

    public static void info(){
        System.out.println(Thread.currentThread().getName());

        Thread thread = new Thread(new ProcessarTask());
        thread.start();
        System.out.println(thread.getName());


        try {
            thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();

        }

        thread.interrupt();

        for (int i = 0; i < 12; i++) {
            Thread thread2 = new Thread(new ProcessarTask());
            thread2.start();
        }
        try {
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Execução finalizada");

        }
    }

