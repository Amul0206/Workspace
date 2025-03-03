package Java_Assignments.Assignment3.Q1;

public class Button {

    //state is on or off
    protected boolean state;

    public Button(boolean state){
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
}
