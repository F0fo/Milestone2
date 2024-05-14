public class hole {
    int start;
    int end;
    int size;

    public hole(int start,int end)
    {
        this.start = start;
        this.end = end;
        this.size = end - start + 1;
    }

    public int holeStart()
    {
        return start;
    }
    public int holeEnd()
    {
        return end;
    }
    public int holeSize()
    {
        return size;
    }
}
