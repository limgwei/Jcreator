
public class Drama extends Movie {
    final static double LATE_FEE=2.0;
    
    public Drama(int id, String title, String rating, int daysLate){
        super(id, title, rating, daysLate);
     }
    public double calcLateFees(){
        return super.getDaysLate()*LATE_FEE;
}
    public String toString(){
        return super.toString()+" "+"\ntotal late fees: RM"+calcLateFees();
    }
}
