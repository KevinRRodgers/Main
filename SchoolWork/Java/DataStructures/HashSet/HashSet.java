public class HashSet {
	public static void main (String[] args) { // main code to test to see if everything in my HashSet works
		HashSet hashset = new HashSet(1000); // makes a HashSet
		HashSet hashset2 = new HashSet(1000); // makes a second HashSet to make sure it doesn't share variables
		hashset.add(20); //adds elements to HashSet
		hashset.add(35);
		hashset.add(50);
		hashset.add(55);
		hashset.add(100);
		System.out.println(hashset.contains(20)); // checks to see if HashSet contains 20
		System.out.println(hashset2.contains(20)); // checks to see if HashSet2 contains 20
		System.out.println(hashset.remove(20)); // removes 20 from HashSet and prints the functions return
		System.out.println(hashset.contains(20)); // checks to see if HashSet contains 20
		hashset.remove(20);//removes 20 from HashSet if it's in the HashSet
	}
	
	boolean[] Set; // Makes a global variable boolean array, I used a boolean array because it can work as a HashSet since there are no duplicates it either needs to know if a value is in the HashSet or isn't in the HashSet which in this case will be true or false at same time complexity O(1) and Space complexity O(n) as regular HashSet
	// you can also use an int array and instead of using true and false use 1 and 0 as substitutes but that one could allow duplicates while a boolean can't since it's either there or not, so I'd save int array for HashMaps, the down side to both is you can only use positive integers
	public HashSet(int n)
	{
	 Set = new boolean[n]; //constructs the boolean array with a size of n 
	}
	
	public void add(int key) { // function to add a value from the HashSet
	    Set[key] = true; // sets the key to true at that value which means the value is in the HashSet
	}

	public String remove(int key) { // function to remove a value from the HashSet
		if(Set[key] == true) { // checks to see if the value exists in the HashSet
			Set[key] = false; // if it does exist then make it not exist anymore
			return "Removed integer "+key;} // lets the user know which value was removed
		else // If the value does not exist 
			return "Hey value does not exist at all"; // returns “Hey value does not exist at all”.
	}
	
	public String contains(int key) { // function to see if a value is in the HashSet
		if(Set[key]==true)  // checks to see if the value exists in the HashSet 
			return Integer.toString(key); // if the value exists in the HashSet returns the particular integer value  
		else // if the value isn't in the HashSet
			return "Hey nothing there"; // returns “Hey Nothing there”.
	}
}
