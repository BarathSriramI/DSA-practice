// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.



public class Main
{
    static void bubblesort(int arr[])
    {
        int n=arr.length;

        for(int i=n-1;i>=0;i--)
        {
            boolean isSwap=false;
            for(int j=0;j<=i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwap=true;
                }
            }
            if(!isSwap) break;
        }
    }
    public static void main(String[] args) {

        int arr[]={5,8,3,16,12,66,4};
        //selection sort
//        selectionSort sc= new selectionSort();
//        int newarr []=  sc.selectsort(arr);

        bubblesort(arr);

      for(int i=0;i<arr.length;i++)
          System.out.println(arr[i]);

    }
}
