package prototypeRegistry;

public class IntelligentStudent extends Student{
    int iq;

    //create a  ocnstructor.
    public IntelligentStudent(){

    }

    //create a copy ocnstructor.
    public IntelligentStudent(IntelligentStudent s){
        super(s);
        this.iq = s.iq;
    }

    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }
}
