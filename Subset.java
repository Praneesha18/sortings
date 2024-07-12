import java.util.*;
public class Subset
{
public static void main(String[] args)
{
int i,t,n,sum,l;
t=0;
int a[]=new int[100];
int b[]=new int[100];
Scanner s=new Scanner(System.in);
System.out.println("enter no. of elements");
n=s.nextInt();
System.out.println("enter the elements");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("enter the sum of the no.s");
sum=s.nextInt();
for(i=0;i<n;i++)
{
t=t+a[i];
if(t<=sum)
{
b[i]=t;
}
if(t>sum)
{
t=t-a[i];
}
}


for(i=0;i<n;i++)
{
t=t+a[i];
if(t<=sum)
{
b[i]=t;
}
if(t>sum)
{
t=t-a[i];
}
}

for(i=0;i<n;i++)
{l=0;
l+=b[i];
if(l==sum)
{
System.out.println(b[i]);
}
}



for(i=1;i<n;i++)
{
t=t+a[i];
if(t<=sum)
{
b[i]=t;
}
if(t>sum)
{
t=t-a[i];
}
}


for(i=1;i<n;i++)
{l=0;
l+=b[i];
if(l==sum)
{
System.out.println(b[i]);
}
}


for(i=2;i<n;i++)
{
t=t+a[i];
if(t<=sum)
{
b[i]=t;
}
if(t>sum)
{
t=t-a[i];
}
}



for(i=2;i<n;i++)
{l=0;
l+=b[i];
if(l==sum)
{
System.out.println(b[i]);
}
}



for(i=3;i<n;i++)
{
t=t+a[i];
if(t<=sum)
{
b[i]=t;
}
if(t>sum)
{
t=t-a[i];
}
}


for(i=3;i<n;i++)
{l=0;
l+=b[i];
if(l==sum)
{
System.out.println(b[i]);
}
}

for(i=4;i<n;i++)
{
t=t+a[i];
if(t<=sum)
{
b[i]=t;
}
if(t>sum)
{
t=t-a[i];
}
}


for(i=4;i<n;i++)
{l=0;
l+=b[i];
if(l==sum)
{
System.out.println(b[i]);
}
}




System.out.println("Subset is");
for(i=0;i<n;i++)
{
System.out.println(b[i]);
}
}
}