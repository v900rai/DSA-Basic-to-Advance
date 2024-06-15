package ArraysProgram;


public class LeadersInArrays {
    public static void getResult(int arr[], int N)
    {
        for (int i = 0; i < N; i++)
        {
            int j;
            for (j = i + 1; j < N; j++)
            {
                if (arr[i] <=arr[j])
                {
                    break;
                }
            }

            // The loop didn't break
            if (j == N)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        LeadersInArrays res=new LeadersInArrays();
        int arr[] = new int[]{15, 37, 1, 32, 135, 2};
        int n = arr.length;
       // System.out.print(“Input :-”);
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] );
        }
       // System.out.print(“Output :-”);

        res.getResult(arr, n);
    }
}
