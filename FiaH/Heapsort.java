//Sofia Hargil
//HW#41
//APCS pd9
//2014-05-20

public class Heapsort {
    
    private static ALHeap _heap;

    public Heapsort() {
	_heap = new ALHeap();
    }

    public static Integer[] sort( Integer[] data ) {
	for (int i = 0; i < data.length; i++) {
	    _heap.add(data[i]);
	}
	for (int i = 0; i < data.length; i++) {
	    data[i] = _heap.removeMin();
	}
	return data;
    }

    public static void main( String[] args ) {
	HeapSort yo = new Heapsort();
	Integer[] yuss = {3,2,6,8,4,1,5,9,7};
	Integer[] fin = yo.sort(yuss);
	for (int i = 0; i < yuss.length; i++) {
	    System.out.print(fin[i] + " ");
	}
    }
}