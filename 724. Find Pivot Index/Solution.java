class Solution {
    public int pivotIndex(int[] arr) {
       
        int subtotal=0;
        int sumleft=0;
        int sumright=0;

        for(int item:arr)
        {
            subtotal=subtotal+item;
        }
        for(int i=0;i<arr.length;i++)
        {
            sumright=subtotal-sumleft-arr[i];
            if(sumleft==sumright)
            {
                return i;
            }
            sumleft=sumleft+arr[i];
        }
        return -1;
    }
}
