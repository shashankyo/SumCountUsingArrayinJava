package driveoroject;

public class Program {
public static void main(String[] args) {
int a[] = {10,20,5,-5,15,0,40};
int count  = 0;
for(int i = 0;i <=a.length-2; i++)
{
	for(int j=i+1;j<=a.length-1;j++)
	{
		if(a[i]+a[j] == 15)
		{
			count ++;
		}
	}

}
System.out.println(count);
}
}