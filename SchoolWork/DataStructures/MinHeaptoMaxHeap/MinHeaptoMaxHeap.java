import java.util.*; // imports java library functions
public class MinHeaptoMaxHeap{
	public static void main(String []args){// I wasn't sure if I was allowed to use priority queue so I put 2 different methods in to convert from min heap to max heap, one keeps it in the same array the whole time the other one uses priority queue to convert from min heap to max
		// but both functions work I just wasn't sure how you wanted
		int arr[] = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9}; //Makes the array that is the minimum heap
		   if(arr.length==0){    //checks if Array is empty
		          System.out.println("Array is empty");  // if array is empty print "Array is empty"
		        } 
		   else { // if array is not empty then continue
        System.out.print("MinHeap: "); 
        System.out.println(Arrays.toString(arr)); //Could also print string with for loop that iterates through array like for(int i=0;i<arr.length;i++){ System.out.print(arr[i]+" ")} but this is neater and I assumed we are allowed to use the Arrays to String function if not then use for loop;
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder()); // Makes a priority  queue to use for max heap, since I wasn't sure if I could use priority queue I did it another way too
        for(int i =0;i<arr.length;i++) {
		 pQueue.add(arr[i]);} // adds elements to priority queue
        System.out.print("MaxHeap: ");
        System.out.println(Arrays.toString(pQueue.toArray()));// prints priority queue max heap
        convertMinToMaxHeap(arr); // Calls function to convert min heap to max heap
        System.out.print("MaxHeap: "); 
        System.out.println(Arrays.toString(arr)); // prints new heap
}}

	
	private static int leftChild(int pos){ // gets integer value of left child
		return (2 * pos) + 1;
} 
	private static int rightChild(int pos){ // gets integer value of right child
		return (2 * pos) + 2;
} 
	private static void swap(int arr[],int i, int n){ //swaps value at arr[i] with value at arr[n]
        int x = arr[i]; // temporary int holder of value at arr[i] to be later placed at arr[n]
        arr[i] = arr[n];  // switches the value at arr[i] with value at arr[n] 
        arr[n] = x;     //switches the value at arr[n] with x which is holding the original value from arr[i]
} 
	
    static void MaxHeapify(int arr[], int i){ 
            int largest = i; 
            if (leftChild(i) < arr.length && arr[leftChild(i)] > arr[i]) // if left child is bigger than largest set largest to value of left child 
                    largest = leftChild(i); 
            if (rightChild(i) < arr.length && arr[rightChild(i)] > arr[largest])// if right child is bigger than largest set largest to value of right child
                    largest = rightChild(i); 
            if (largest != i) { // if largest has been changed after going through left and right child
        	        swap(arr,i,largest);// swap arr[i] and arr[largest] 
                    MaxHeapify(arr, largest); // recursively moves largest until in right place
            } 
    } 

    static void convertMinToMaxHeap(int arr[]){ // keeps heap in same array to convert from min to max
            for (int i = arr.length; i >= 0; --i) //iterates through array
                    MaxHeapify(arr, i);//keeps going through to make sure largest is at the top
    } 
}
