class Calculation
{

public double findAverage(int x[])
{
double tot=0.0;
double avg=0.0;
for(int i=0;i<x.length;i++)
{
tot=tot+x[i];
}
avg=tot/x.length;
return avg;
}
}