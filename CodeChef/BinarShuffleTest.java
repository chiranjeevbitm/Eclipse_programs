package CodeChef;


	public final class BinarShuffleTest
	{
	 private BinarShuffleTest(){}

	 public final static void shuffle(final int lo_bound, final int hi_bound,
	 final int pos, final int[] array,
	 final int index[], final int[] bits,
	 final int size)
	 {

	 System.out.print(">>> lo = "+lo_bound+"; hi = "+hi_bound);
	 System.out.print("Index: "+pos+"; Position: "+index[pos]);
	 System.out.println(" <<<");
	 System.out.println();
	 if(pos > size || lo_bound >= hi_bound) return;
	 int lo = lo_bound;
	 int hi = hi_bound;

	 while(lo < hi+1)
	 {
	 final int bit = (index[pos] >> array[lo]-1) & 0x00000001;

	 System.out.print(">>> lo = "+lo_bound+"; hi = "+hi_bound);
	 System.out.print("Index: "+pos+"; Position: "+index[pos]);
	 System.out.println(" <<<");
	 System.out.println();
	 printArray(array);
	 if(bit == bits[pos]) 
	 {
		 lo++;
		 }
		 else
		 {
		 int temp = array[hi];
		 array[hi] = array[lo];
		 array[lo] = temp;
		 hi--;

		 }//end if
		 }//end while
		 if(lo == hi_bound + 1)
		 {
		 shuffle(lo_bound,hi_bound,pos+1, array, index,bits,size);
		 }
		 else
		 {
		 shuffle(lo_bound, lo-1, pos+1, array,index,bits,size);
		 shuffle(lo, hi_bound, pos+1, array,index,bits,size);
		 }//end if

		 }//end shuffle
	 public final static void printArray(final int[] array)
	 {
	 System.out.print("Array = [");
	 for(int x=0;x<array.length;x++)
	 {
	 System.out.print(" "+array[x]);
	 }//end for
	 System.out.println(" ]");
	 }//end printArray

	 public final static void main(String[] args)
	 {

	 int[] data = new int[]{ 0, 1, 2, 3,
	 4, 5, 6, 7,
	 8, 9, 10, 11,
	 12, 13, 14, 15 };

	 int[] indx = new int[]{ 31, 30, 29, 28, 27, 26, 25, 24,
	 23, 22, 21, 20, 19, 18, 17, 16,
	 15, 14, 13, 12, 11, 10, 9, 8,
	 7, 6, 5, 4, 3, 2, 1, 0 };

	 int[] bits = new int[]{ 0, 1, 0, 1, 0, 1, 0, 1,
	 0, 1, 0, 1, 0, 1, 0, 1,
	 0, 1, 0, 1, 0, 1, 0, 1,
	 0, 1, 0, 1, 0, 1, 0, 1 };

	 System.out.println();
	 printArray(data);
	 System.out.println();

	 shuffle(0, data.length-1, 0, data, indx, bits, 8);
	 System.out.println();
	 printArray(data);
	 System.out.println();

	 System.exit(0);

	 }//end main

	}//end BinarShuffleTest 

