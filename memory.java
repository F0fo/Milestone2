public class memory {

    String[] heap;
    String[] text;
    String[] data;

    public memory()
    {   //each memory partition is 32 bytes
        this.heap = new String[32];
        this.text = new String[32];
        this.data = new String[32];

    }

        //Insert into the memory
    public void insertHeap(String input, int start,int end)
    {
        for (int i = start; i<end;i++)
        {
            heap[i] = input;
        }
    }
    public void insertText(String input, int start,int end)
    {
        for (int i = start; i<end;i++)
        {
            text[i] = input;
        }
    }
    public void insertData(String input, int start,int end)
    {
        for (int i = start; i<end;i++)
        {
            data[i] = input;
        }
    }

    //remove from the memory
    public void removeHeap(int start, int end)
    {
        for (int i = start; i<end;i++)
        {
            heap[i] = "NA";
        }
    }
    
    public void removeText(int start, int end)
    {
        for (int i = start; i<end;i++)
        {
            text[i] = "NA";
        }
    }
    
    public void removeData(int start, int end)
    {
        for (int i = start; i<end;i++)
        {
            data[i] = "NA";
        }
    }

    //print the memory
    public void printHeap()
    {
        for (int i = 0;i <heap.length; i++)
        {
             System.out.println(heap[i]);
        }
        
    }
    public void printText()
    {
        for (int i = 0;i <text.length; i++)
        {
             System.out.println(text[i]);
        }
    }
    public void printData()
    {
        for (int i = 0;i <data.length; i++)
        {
             System.out.println(data[i]);
        }
    }


}
