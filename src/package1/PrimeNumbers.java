package package1;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeNumbers {

	private String findPrimeNumbers(int n) {
		boolean flag = false;
		List<Integer> list = new ArrayList<>();
		if(n>1)
			list.add(2);
		for(int i=3;i<=n;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag = true;
					break;
				}
				else
					flag=false;
			}
			if(flag==false)
			{
				list.add(i);
			}
		}
		String primeNumbers = list.toString();
		return primeNumbers;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(findPrimeNumbers(16), "[2, 3, 5, 7, 11, 13]");
	}

}
