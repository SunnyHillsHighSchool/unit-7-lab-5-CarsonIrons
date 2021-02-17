//(c) A+ Computer Science
//www.apluscompsci.com
//Name Carson Irons 


//write the Number class
//use the handout and
//sample runner code
//to guide you

//header for Number class
public class Number{

//private instance variable (must be an Integer)
private Integer num;
//constructor
public Number(){
  num=0;
}

public Number(int n){
  num=n;
}
//getter method
public Integer getNum(){
  return num;
}

//setter method
public void setNum(int n){
  num =n;
}
//is odd method 

public boolean isOdd(){
//method for checking if it is an odd number parameter is int num 
// check if its odd with modulus (%2 ==1)
if(num%2==1)
//if odd return true
return true;
//otherwise return false 
return false;
}


//is perfect method
//Method for checking if it is a perfect number parameter is num 
public boolean isPerfect(){
//Declare int sum, init to 0
int sum =0;
//loop through all values from 1 to num-1 ( num is getValue of 
//calling number object)
for(int i=1;i<num;i++){
//check if number is a divisor
if(num%i==0){
//if it is add it to sum 
sum+=i;
//end if statement 
}
//end for loop
}
//check if the num is equal to sum 
if(num==sum)
//if so return true
return true;
//else return false
else
//to string method 
return false;
}
public String toString(){
return ""+num;
}

}