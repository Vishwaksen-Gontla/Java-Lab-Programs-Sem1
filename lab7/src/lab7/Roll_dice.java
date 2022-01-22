/*Aim : Write a java program to make rolling a pair of dice 10,000 times and counts the number of 
times doubles of are rolled for each different pair of doubles. Hint: Math.random()*/


package lab7;
public class Roll_dice {
	int c_pairs[]= {0,0,0,0,0,0,0};
	int dice1;
	int dice2;
	String str="";
	void start()
	{
		for(int i=0;i<10000;i++)
		{
			dice1= 1+ (int)( Math.random()*6);
			dice2=1+ (int) (Math.random()*6);
			if(dice1==dice2)
			{
				c_pairs[dice1]++;
			}
		}
	}
	
	public String toString()
	{
		for(int i=1;i<7;i++)
			str=str+" Number of occurences of pairs with face value "+ i + " is " +c_pairs[i] +"\n" ;
		return str;
	}

}
