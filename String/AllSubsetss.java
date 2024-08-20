package String;
 class AllSubsetss {
    public static void main(String args[]) {
        String str = "FUN";
        int length = str.length();
        int temp = 0;
        //Total possible subsets for string of size n is n*(n+1)/2
        String arr[] = new String[length * (length + 1) / 2];
        //this loop maintains the strating the character
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                arr[temp] = str.substring(i, j);
                temp++;
            }
        }

        //This loop prints all the subsets formed from the string.
        System.out.println("All subsets for given string are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
