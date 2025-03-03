package Java.Day4.HasARelationship;

public class Controller {
    protected Button button;
    protected Curtain curtain; 

    protected void toggle(){
        if (button.isState() == false ) {
            
            button.setState(true) ;
            curtain.setState(true);
            System.out.println("curtain is now "+this.curtain);
            //System.out.println("Current state of button is " + button.state + ". succesfully toggled to different state.");
        }

        else{
            System.out.println("Cutain is closed!");
            button.setState(false) ;
            curtain.setState(false);
            System.out.println("curtain is now "+this.curtain);
            //System.out.println("Current state of button is " + button.state + ". succesfully toggled to different state.");
        }

    }

        //ASSOCIATION
    public Controller(Curtain c) {

        //HAS-A Relationship(COMPOSITION)
        this.button = new Button(false);

        this.curtain = c;

    }

    public static void main(String[] args) {
        Curtain o1 = new Curtain(false);
        Controller c1 = new Controller(o1);
        c1.toggle();

    }
}
