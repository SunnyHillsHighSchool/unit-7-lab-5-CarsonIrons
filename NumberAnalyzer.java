//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
public NumberAnalyzer(int[] n ){
list= new ArrayList<Number>();
  for(int i=0; i<n.length;i++){
    list.add(new Number(n[i]));
  }
}
	//write count odds
public int countOdds(){
  int oddCount=0;
  for(Number z : list){
    if(z.isOdd())
    oddCount++;
  }
  return oddCount;
}
	//write count evens
public int countEvens(){
  int evenCount =0;
  for(Number z : list){
    if(!z.isOdd())
    evenCount++;
  }
  return evenCount; 
}
	//write count perfects
	public int countPerfects(){
    int perfectCount=0; 
    for(Number z : list){
    if(z.isPerfect())
    perfectCount++;
  }
  return perfectCount;
  }
	//write a toString
  public String toString(){
  return ""+ list;
}
}