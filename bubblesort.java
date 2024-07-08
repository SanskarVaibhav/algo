// ALGO FOR BUBBLESORT
public class bubblesort {
    static void Sort(int [] arr,int n)
    {
        int i,j,temp;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                } 
            }
        }
    }

    static void printArray(int [] arr,int size)
    {
        int i;
        for(i=0;i<size;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={5,4,2,3,6,1};
        int n=arr.length;
        System.out.println("original arrya");
        printArray(arr, n);
        Sort(arr, n);
        System.out.println("sorted array : ");
        printArray(arr, n);
    }
}
/*
 *steps to sort an array using bubble sort 
 step1: traverse the array index  using for loop ,i<n-1(n is the no. of elements)
 step2: check the elements of the two consecutive index using one more for loop , j<n-i-1
 step3: compare the elements, if the a[j]>a[j+1]
 step4: apply swaping else move
 */