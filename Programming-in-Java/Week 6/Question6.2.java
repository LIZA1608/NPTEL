public class Question62 implements Runnable {  
  
    @Override  
    public void run() {  
        System.out.print(Thread.currentThread().getName()+" has ended.");  
    }
    // Create main class Question62 with main() method and appropriate statements in it

public static void main(String[] args){
  System.out.println("Welcome to Java Week 6 New Question.");
  Question62  obj = new Question62();
  Thread t = new Thread(obj);
  t.start();
  t.setName("Main Thread");
  }
}
