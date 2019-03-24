/**
 * @(#)Player.java
 *
 *
 * @author 
 * @version 1.00 2018/11/26
 */

import java.io.*;
public class Player implements Comparable<Player>,Serializable{
private String name;
private int result;

    public Player(String name,int result) {
    	this.name=name;
    	this.result=result;
    }
    public String getName(){
    	return name;
    }
    public int getResult(){
    	return result;
    }
    public String toString(){
    	return "Name: "+name+"\nResult:"+result;
    	}
    public int compareTo(Player o){
    	int resultCompare = ((Player) o).getResult();
    	//ascending order
    	//return this.result - resultCompare;
    	
    	//descending order
    	return resultCompare-this.result;
    	
    }
    
    }
    
    
