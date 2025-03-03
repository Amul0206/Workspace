package Java.Day4.HasARelationship;

public class Curtain {
    protected boolean state;

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String toString(){
        if (state == true){
            return "Open.";
        }

        else{
            return "Closed.";
        }
    }

    public Curtain(boolean state) {
        this.state = state;
    }
}

