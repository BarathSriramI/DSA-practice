// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.ArrayList;

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
    static void selectionsort(int [] arr)
    {
        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            int min=i;

            for(int j=i+1;j<n;j++)
            {
                if(arr[j] < arr[min]) min=j;
            }

            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

    }

    static void insertionsort(int [] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int j=i;
            while(j >0 && arr[j-1] > arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
    static void pattern1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n)
    {
        for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=i;j++) System.out.print(j+" ");
            System.out.println();
        }
    }
    static void pattern4(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++) System.out.print(i+" ");
            System.out.println();
        }
    }
    static void pattern5(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++) System.out.print( j+" ");
            System.out.println();
        }
    }
    static void pattern7(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++ ) System.out.print(" ");
            for(int j=1;j<=i*2-1;j++) System.out.print("*");
            System.out.println();
        }
    }

    // pattern 8 reverse pyramid
    static void pattern8(int n)
    {
        for(int i=1;i<=n;i++)
        {
            // sapce
            for(int j=1;j<i-1;j++)System.out.print(" ");
            // stars
            for(int j=1;j<=2*n-(2*i-1);j++) System.out.print("*");
            System.out.println();
        }
    }
   static  void printDiamond(int n) {
        for(int i=1;i<=n;i++)
        {
            // space
            for(int j=1;j<=n-i;j++)System.out.print(" ");
            for(int j=1;j<=i;j++)System.out.print("* ");
            System.out.println();
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++) System.out.print(" ");

            for(int j=0;j<=n-i;j++) System.out.print("* ");
            System.out.println();
        }
    }
    static void pattern10(int n) {
        for(int i=1;i<2*n;i++)
        {
            if(i<=n) for(int j=1;j<=i;j++) System.out.print("* ");
            else for(int j=1;j<=2*n-i;j++) System.out.print("* ");

            System.out.println();
        }

    }

    static void pattern11(int n) {
        int start=1;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0) start=1;
            else start=0;
            for(int j=1;j<=i;j++)
            {
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
     static void pattern12(int N) {
        // code here
        int spaces = 2*(N-1);

        // Outer loop for the number of rows.
        for(int i=1;i<=N;i++){

            // for printing numbers in each row
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }

            // for printing spaces in each row
            for(int j = 1;j<=spaces;j++){
                System.out.print(" "+" ");
            }

            // for printing numbers in each row
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }

            // As soon as the numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();

            // After each iteration nos. increase by 2, thus
            // spaces will decrement by 2.
            spaces-=2;
        }
    }
   static  void pattern13(int n) {

        int counter =1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(counter+" ");
                counter++;

            }
            System.out.println();
        }
    }

    static void pattern14(int n) {

        for(int i=1;i<=n;i++)
        {
            for(char ch='A';ch <'A'+i;ch++)
                System.out.print(ch);
            System.out.println();
        }
    }
    static void pattern16(int n) {
        for(int i=0;i<n;i++)
        {

            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(int)('A'+i));
            }

            System.out.println();
        }
    }
    static  void merge(int arr[],int low,int mid,int high)
    {
        ArrayList<Integer> temp =new ArrayList<>();

        int left = low;
        int right=mid+1;


        while(left <= mid && right <=high)
        {
            if(arr[left] <= arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else
            {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <=mid)
        {
            temp.add(arr[left]);
            left++;
        }
        while(right <=high)
        {
            temp.add(arr[right]);
            right++;

        }

        for(int i=low;i<=high;i++)
        {
            arr[i]=temp.get(i-low);
        }

    }

    static void mS(int arr[],int low,int high)
    {
        if(low == high ) return;

        int mid=(low + high)/2;

        mS(arr,low,mid);
        mS(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {

        int arr[]={12,2,35,65,9,1,35};

        int n=arr.length;
//        selectionsort(arr);
//        bubblesort(arr);
//        insertionsort(arr);
        mS(arr,0,n-1);

      for(int i=0;i<arr.length;i++)
          System.out.println(arr[i]);

//        pattern16(5);

    }
}
