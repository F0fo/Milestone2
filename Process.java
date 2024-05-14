public class Process {
    String name;
    int heapSize;
    int textSize;
    int dataSize;
    public Process(String n1, int s1,int s2,int s3)
    {
        this.name = n1;
        this.heapSize = s1;
        this.textSize = s2;
        this.dataSize = s3;
    }

    public String requestName()
    {
        return name;
    }

    public int requestHeap()
    {
        return heapSize;
    }
    public int requestText()
    {
        return textSize;
    }
    public int requestData()
    {
        return dataSize;
    }
}
