
public class Competitor 
{
	int points;	//Amount of points a competitor has
	boolean color;	//Red = true, Blue = false
	boolean seishun;	//True = seishuun
	int cat1pen;	//Category 1 penalties, max of 4
	int cat2pen;	//Category 2 penalties, max of 4
	
	public Competitor(boolean c)
	{
		points = 0;
		color = c;
		seishun = false;
		cat1pen = 0;
		cat2pen = 0;
	}
	
	int returnPoints()
	{
		return points;
	}
	
	boolean returnSeishun()
	{
		return seishun;
	}
	
	int returnPenalty1()
	{
		return cat1pen;
	}
	
	int returnPenalty2()
	{
		return cat2pen;
	}
	
	void addPenalty1(int x)
	{
		cat1pen +=x;
	}
	
	void addPenalty2(int x)
	{
		cat2pen +=x;
	}
	
	void addPoint(int x)
	{
		points+=x;
	}
	
	void addSeishun()
	{
		seishun = true;
	}
	

}
