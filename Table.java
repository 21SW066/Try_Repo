import java.util.Scanner;
class Table{
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the number");
	int n=s.nextInt();
	System.out.print("Enter starting point");
	int i=s.nextInt();
	System.out.print("Enter the ending pont");
	int k=s.nextInt();
int j;
for(j=i;j<=k;j++)
{
System.out.print( n + " * " + j +"="+ (n*j));

System.out.print("\n");}
}}
