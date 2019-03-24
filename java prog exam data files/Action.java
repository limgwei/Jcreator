public class Action extends Movie{
    final static double LATE_FEE=3.0;
    
    public Action(int id, String title, String rating, int daysLate){
        super(id, title, rating, daysLate);
     }
    public double calcLateFees(){
        return super.getDaysLate()*LATE_FEE;
}
    public String toString(){
        return super.toString()+" "+"\ntotal late fees: RM"+calcLateFees();
    }
}

