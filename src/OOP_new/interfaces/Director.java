package OOP_new.interfaces;

//public class Director implements Worker {
//    @Override
//    public void work() {
//        System.out.println("Директор работает");
//    }
//}
public class Director  {

    public void force(Worker worker) {
        worker.work();
    }
}