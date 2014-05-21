
/* ************************
 Summary: fickle, and did not always work as it should
feel like there should be more passes in the "remove" sect, but not sure
and there are probably too many loops....
 ************************ */
public class Heapsort {

    public static int[] sort (int[] data) {
	
	//heapify (max heap) 
	for (int p = 0; p < data.length; p++) {//partition & conveniently index of child
	    int parent = (p - 1) / 2;//regardless of whether the child is L or R b/c of int division
	    int child = p;
	    while (parent >= 0 && parent < data.length //parent is not out of bounds
		   && data[parent] < data[child]) {
		    int lesser = data[parent];
		    data[parent] = data[child];
		    data[child] = lesser;//smaller 1 swapped back
		    //System.out.println("parent: " + parent + " child: " + child);
		    //print(data);
		    child = parent;// childPos aft swap
		    parent = (parent - 1) / 2;
	    }
	}
	//print(data);
	//"remove"
	for (int last = data.length - 1; last >= 0; last--) {
	    int tmp = data[0];
	    data[0] = data[last];
	    int i = 0;
	    int lc = 1;
	    int rc = 2;
	    
	    while (rc < last && lc < last
		   && i < last) {
	        
		
		//swap with lower 1, lower 1 pushed up
		if (data[lc] > data[rc]) {
		    int prev = data[i];
		    data[i] = data[lc];
		    data[lc] = prev;
		    i = lc;
		    
		}
		else {
		    int prev = data[i];
		    data[i] = data[rc];
		    data[rc] = prev;
		    i = rc;
		    
		}
		lc = (2 * i) + 1;
		rc = (2 * i) + 2;
		//print(data);

	    }
	    data[last] = tmp;
	    //print(data);
	}
	//print(data);
      
	return data;
    }
    /*
    public static Integer[] sort (Integer[] data) {
	System.out.print("given: ");
	print(data);
	ALHeap heap = new ALHeap();
	for (int i = 0; i < data.length; i++) {
	    heap.add(data[i]);
	}
	System.out.println("converted to " + heap);
	Integer[] sorted = new Integer[data.length];
	for (int i = 0; i < data.length; i++)
	    sorted[i] = heap.removeMin();
	System.out.print("\nand sorted : ");
	print(sorted);
	return sorted;
    }
    */
    public static void print (int[] array) {
	String a = "{";
	for (int i = 0; i < array.length; i++) {
	    a += array[i] + " , ";
	}
	System.out.println(a.substring(0, a.length() - 3) + "}\n");
    }

    public static void main (String[] args) {
	int n = 7;
	int[] data = new int[n];//{5, 3, 6, 2, 145, 78};
	for (int i = 0; i < data.length; i++) 
	    data[i] = (int) (50 * Math.random());
	System.out.print("given: "); 
	print(data);
	System.out.println("after sorting... ");
	print(sort(data));
	//print(data);
    }

}
