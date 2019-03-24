/**
 * @(#)Problem.java
 *
 *
 * @author 
 * @version 1.00 2018/10/30
 */

import java.util.Random;
public class Problem {
private int op1;
private int op2;
private char operator;
    public Problem() {
    }
    
    public Problem( char operator){
    	Random rand=new Random();
    	 op1=rand.nextInt(20)+1;
    	 op2=rand.nextInt(20)+1;
    	this.operator=operator;	

}

    public int getAnswer(){
    int ans=0;
    if(operator=='+'){
    	ans=op1+op2;
    }
    else if(operator=='-'){
    	ans=op1-op2;
    }
    else if(operator=='/'){
    	ans=op1/op2;
    }
    else if(operator=='*'){
    	ans=op1*op2;
    }
    return ans;
    }
    
public  String toString(){
	String ope="";
	if(operator=='+'){
		ope="+";
	}
	else if(operator=='-'){
		ope="-";
	}
	else if(operator=='/'){
		ope="/";
	}
	else if(operator=='*'){
		ope="*";
	}
    	return op1+ope+op2+"=??";
    }
}