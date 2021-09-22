public class AO3PersonEncapsulation{
    private String fname;

    public String getName(){
        return fname;
    }
    public void setName(String NewVar) //set take paramter for assign value
    {
        this.fname = NewVar;    //this refer current object
    }
}