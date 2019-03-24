/**
 * @(#)Sorting.java
 *
 *
 * @author 
 * @version 1.00 2018/11/26
 */
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Sorting {
ArrayList<Player> playerArrayList=new ArrayList<Player>();

Player r;
String name="";
String file="playerFile";
public void start(Stage primaryStage){
	
}
    public Sorting() {
    }
    private void sort(){
    	Collections.sort(playerArrayList);
    	for(Player st:playerArrayList){
    		System.out.println(st.toString)());
    	}
    	System.out.println("Top:");
    	System.out.println("Top player:"+
    		playerArrayList.get(0).toString());
    }
    public void writePlayer(){
    	FileOutputStream fileOut;
    	try{
    		fileOut=new FileOutputStream(file);
    		ObjectOutputStream out=new ObjectOutputStream (fileOut);
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }
    public ArrayList<Player> readPlayer(){
    	//---------read staffArrayList---------
    	ArrayList<Player> players=null;
    	try{
    		FileInputStream fileIn=new FileInputStream(file);
    		ObjectInputStream in=new ObjectInputStream(fileIn);
    		players=(ArrayList<Player>) in.readObject();
    		in.close();
    		fileIn.close();
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    	return players;
    }
    
}