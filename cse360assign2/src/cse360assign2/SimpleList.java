/**
 * Name: Xavier Sifuentes
 * Class ID: 251
 * Assignment 2
 * The purpose of this file is to practice using a version control system.
 */
package cse360assign2;

import java.util.Arrays;

public class SimpleList
{
	/**
	 * Initializes variable and array to be used for the methods
	 */
	private int count = 0;
	private int[] listArray = new int[10];

	public SimpleList()
	{
		listArray = new int[10];
	}
	
	public void add(int num)
	{
		int[] temp = new int[listArray.length];
		if(listArray[listArray.length - 1] == 0)
		{
			for(int tick = 0; tick < listArray.length; tick++)
			{
				temp[tick] = listArray[tick];
			}
			listArray[0] = num;
			for(int tick = 1; tick < listArray.length - 1; tick++)
			{
			
				listArray[tick] = temp[tick - 1];

			}
		}
		else
		{
			int[] largerArray = new int[(int)(1.5*listArray.length)];
			int[] tempArray = new int[(int)(1.5 * listArray.length)];
			for(int tick = 0; tick < listArray.length; tick++)
			{
				tempArray[tick] = listArray[tick];
			}
			listArray[0] = num;
			for(int tick = 1; tick < largerArray.length - 1; tick++)
			{
				largerArray[tick] = tempArray[tick - 1];
			}
		}
		//listArray[0] = num;
		count++;
	}
	
	
	public void remove(int num)
	{
		int[] temp = new int[listArray.length];
		int mark = 0;

		for(int tick = 0; tick < listArray.length; tick++)
		{
			temp[tick] = listArray[tick];
			if(num == listArray[tick])
			{
				mark = tick;
			}
		}
		for(int tick = mark; tick < listArray.length - 1; tick++)
		{
			listArray[tick] = listArray[tick + 1];
		}
		if((listArray.length - count) > (int)(.25*listArray.length))
		{
			int[] shorterArray = new int[listArray.length - 1];
			for(int tick = 0; tick < shorterArray.length; tick++)
			{
				shorterArray[tick] = listArray[tick];
			}

		}
		count--;
	}
	
	
	public int count()
	{
		return count;
	}
	
	
	public String toString()
	{
		return Arrays.toString(listArray);
	}
	
	
	public int search(int num)
	{
		for(int tick = 0; tick < listArray.length; tick++)
		{
			if(listArray[tick] == num)
				return tick;
		}
		return -1;
	}
	
	public void append (int num)

	{
		int[] temp = new int[listArray.length];
		if(listArray[listArray.length - 1] == 0)
		{
			listArray[listArray.length - 1] = num;
		}
		else
		{
			int[] largerArray = new int[(int)(1.5*listArray.length)];
			//int[] tempArray = new int[(int)(1.5 * listArray.length)];
			for(int tick = 0; tick < listArray.length; tick++)
			{
				largerArray[tick] = listArray[tick];
			}
			largerArray[largerArray.length - 1] = num;
		}
	//listArray[0] = num;
	count++;
	}

	public int first()
	{
		if(listArray[0] == 0)
		{
			return -1;
		}
		else
		{
			return listArray[0];
		}
			
	}

	public int last()
	{
		if(listArray[listArray.length - 1] != 0)
			return listArray[listArray.length - 1];
		else
			return -1;
	}

	public int size()
	{
		return listArray.length;
	}
}

