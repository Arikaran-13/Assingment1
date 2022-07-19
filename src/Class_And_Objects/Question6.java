package Class_And_Objects;

public class Question6 {
    public static void main(String[] args) {


        App app1 = App.getInstance();
        App app2 = App.getInstance();
        App app3 = App.getInstance();

        System.out.println("Only one object created : ");
        System.out.println(app1.hashCode());
        System.out.println(app2.hashCode());
        System.out.println(app3.hashCode());
        System.out.println("It has a private constructor and cannot b inherited");

    }

}
class App{

    private App(){

    }
    static App app;

    public static App getInstance(){
        if(app==null){
            app=new App();
        }
        return app;
    }
}
