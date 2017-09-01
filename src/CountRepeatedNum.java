import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class CountRepeatedNum
{
	HashMap<Integer,Integer> dmap=new HashMap<Integer,Integer>();
	public void findDupOcc(ArrayList aL)
	{
		for(int i=0;i<aL.size();i++)
		{
			int val=(int) aL.get(i);
			//dmap holds the key & number of times of that Key Repeated in List of Numbers.
			if(dmap!=null&&!dmap.equals("")&&dmap.containsKey(val))
			{
				dmap.put(val, dmap.get(val)+1);
			}
			else
			{
				dmap.put(val,1);
			}
		}
		
		for(Map.Entry<Integer,Integer> entry:dmap.entrySet())
		{
			System.out.println("The Value"+entry.getKey()+"is repeated for"+entry.getValue()+"Times");
			
		}
		
	}
	

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> aList=new ArrayList<Integer>();
		aList.add(10);
		aList.add(5);aList.add(10);aList.add(8);aList.add(4);aList.add(8);aList.add(10);
		CountRepeatedNum crn=new CountRepeatedNum();
		crn.findDupOcc(aList);
		
	}

}
