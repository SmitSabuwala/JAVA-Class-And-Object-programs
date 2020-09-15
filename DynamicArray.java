public class Main
{
    int sampleArray[];
    int size;
    int count = 0;
    
    public Main(){
        sampleArray = new int[1];
        size=1;
        count=0;
    }
    
    public int sizeArray(){
        return sampleArray.length;
    }
    
    public void viewArray(){
        if(size==0){
            System.out.println("There are no element in array");
        }else{
            for(int i=0;i<size;i++){
                System.out.println(sampleArray[i]);
            }
        }
    }
    
    public int[] resizeArray(int[] array){
        int[] temp = new int[size*2];
        for(int i=0;i<size;i++){
            temp[i]=array[i];
        }
        array = temp;
        size = array.length;
        return array;
    }
    
    public void insertFirst(int number){
        if(count==size){
            sampleArray = resizeArray(sampleArray);
        }
        int[] temp = new int[size];
        // temp = sampleArray;
        for(int i=0;i<size;i++){
            temp[i]=sampleArray[i];
        }
        sampleArray[0]=number;
        for(int i=0;i<size-1;i++){
            sampleArray[i+1]=temp[i];
        }
        
        
        
        count++;
    }
    
    public void insertAtPos(int number,int position){
        if(position < 0 || position > size){
            System.out.println("Enter valid poition !!!");
        }else{
            if(count==size){
                sampleArray = resizeArray(sampleArray);
            }
            int[] temp = new int[size];
        // temp = sampleArray;
            for(int i=0;i<size;i++){
                temp[i]=sampleArray[i];
            }
            sampleArray[position]=number;
            int a = position;
            for(int i=0;i<size;i++){
                if(i>position){
                    sampleArray[i]=temp[i-1];
                    // System.out.println("This is this "+sampleArray[i]);
                }
                
            }
            // for(int i=0;i<temp.length;i++){
            //     System.out.print(" "+temp[i]);
            // }
            
        }
        count++;
        
    }
    
    public void insertElement(int number){
        if(count==size){
           sampleArray = resizeArray(sampleArray);
        }
        sampleArray[count] = number;
        count++;
    }
    
    public void removeElement(){
        if(count==0){
            System.out.println("Array is already empty !!!");
        }else{
            sampleArray[count-1]=0;
            count--;
        }
    }
    
    public void removeAtPos(int index){
        if(count==0){
            System.out.println("Array is already empty !!!");
        }else{
            if(index<0 || index>size){
                System.out.println("Kindly Enter valid position !!!");
            }else{
            int[] temp = new int[size];
        // temp = sampleArray;
        int j=0;
            for(int i=0;i<size;i++){
                if(i==index){
                    
                }else{
                temp[j]=sampleArray[i];
                j++;
                }
            }
            for(int i=0;i<size;i++){
                sampleArray[i]=temp[i];
            }
            // sampleArray[index]=0;
            // for(int i=0;i<size;i++){
            //     if(i>index){
            //         sampleArray[i]=temp[i-1];
            //         // System.out.println("This is this "+sampleArray[i]);
            //     }
            // }
            count--;
            }
        }
        
       
    }
    
     public void shrinkArray(){
            int temp[] = new int[count];
            for(int i=0;i<count;i++){
                temp[i]=sampleArray[i];
            }
            sampleArray = temp;
            size = count;
        }
    
    
	public static void main(String[] args) {
        Main obj = new Main();
        obj.insertElement(5);
        // obj.viewArray();
        obj.insertFirst(6);
        obj.insertElement(15);
        obj.insertElement(45);
        obj.insertElement(75);
        obj.insertFirst(64);
        obj.insertFirst(65);
        obj.insertFirst(61);
        obj.insertAtPos(44,2);
        obj.insertAtPos(100,3);
        obj.insertAtPos(111,4);
        obj.insertFirst(75);
        obj.removeElement();
        obj.removeElement();
        obj.removeAtPos(0);
        obj.removeAtPos(3);
        obj.removeAtPos(4);
        obj.shrinkArray();
        obj.viewArray();
	}
	
}
