
public class Match 
{
	Competitor aka;	//Aka = red
	Competitor ao;	//Ao = blue
	boolean winnerC; //Winner color, red = true, blue = false
	int matchType;	//1 = 8pts to win, 2 = rolling 8, 3 = until time
	
	public Match(int mt)
	{
		aka = new Competitor(true);
		ao = new Competitor(false);
		matchType = mt;
	}
	
	public Competitor timesUp()
	{
		if (aka.returnPoints() > ao.returnPoints())
			return aka;
		else if (aka.returnPoints() == ao.returnPoints())
		{
			if (aka.returnSeishun() == true)
				return aka;
			else
				return ao;
		}
		else
			return ao;
	}
	
	public boolean autoQuit()
	{
		if (matchType == 1)
		{
			if (ao.returnPoints() == 8 || aka.returnPoints() == 8)
				return false;
		}
		
		else if (matchType == 2)
		{
			if (Math.abs(ao.returnPoints() - aka.returnPoints()) == 8 )
				return false;
		}
		
		if (aka.cat1pen == 4 || aka.cat2pen == 4 || ao.cat1pen == 4 || ao.cat2pen == 4)
		{
			return false;
		}
		
		return true;
	}
	
}
