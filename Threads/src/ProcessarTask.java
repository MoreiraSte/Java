public class ProcessarTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Processamento iniciado");

        for (int i = 0; i < 500_000; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            System.out.println("Processando......" + i + " - "+ Thread.currentThread().getName());


        }

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Execução finalizada");
    }
}
