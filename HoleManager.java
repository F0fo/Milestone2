import java.util.ArrayList;

public class HoleManager {
    ArrayList<hole> holeList;
    static int length;
    
    public HoleManager()
    {
        this.holeList = new ArrayList<hole>();
    }

    public void insertHole(hole newHole)
    {
        holeList.add(newHole);
   
    }

    public void printHoles()
    {
        for (int i =0; i < holeList.size(); i++)
        {
            System.out.println(holeList.get(i));
        }
    }
    public void mergeHoles()
    {
        for (int i =0; i < holeList.size() ; i++)
        {
            for(int j = 0; i <holeList.size(); j++)
            if (holeList.get(i).start == holeList.get(j).size)
            {

            } 
        }
    }
}
