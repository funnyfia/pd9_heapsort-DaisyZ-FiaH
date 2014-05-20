
public class Heapsort {

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

    public static void print (Integer[] array) {
	String a = "{";
	for (int i = 0; i < array.length; i++) {
	    a += array[i] + " , ";
	}
	System.out.println(a.substring(0, a.length() - 3) + "}\n");
    }

    public static void main (String[] args) {
	int n = 5;
	Integer[] data = new Integer[n];//{5, 3, 6, 2, 145, 78};
	for (int i = 0; i < data.length; i++) 
	    data[i] = (int) (50 * Math.random());
	sort(data);
    }

}
