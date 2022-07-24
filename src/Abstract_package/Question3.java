package Abstract_package;

public class Question3 {
    public static void main(String[]args){
        Persistance p = new DataPersistance();
        Persistance q = new FilePersistance();
        p.persist();
        q.persist();
    }

}
abstract class Persistance{

    public abstract void persist();
}
class FilePersistance extends Persistance{


    @Override
    public void persist() {
        System.out.println("From file pesistance");
    }
}
class DataPersistance extends Persistance{


    @Override
    public void persist() {
        System.out.println("From data Persistance");
    }
}
