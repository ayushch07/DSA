package Heap;

import java.util.ArrayList;
//Heap is a complete Binary Tree(last level ko chode ke uske upar tak sab completely BT hone chahiye means each node should have 2 childs or last level me left to right data fill hona chahie )
//Priority Queue is different from normal queue.As in priority queue we extract data on the basis of priority and in normal queue we remove by following FIFO principle.

              //Sorted        //Unsorted    //Heap(PQ) 
//add data      O(n)			O(1)		log(n)	It means mean hip sorted data se badia hai or unsorted se bekar hai	
//remove data   O(n)			O(n)		log(n)	It means mean hip sorted data se badia hai or unsorted se bhi badia hai
//Get min       O(1)			O(n)		O(1)    It means mean hip unsorted data se badia hai or sorted se bekar hai
//Parent index=(Child Index-1)/2;
//2^h=(n) number of nodes so h=log(n) (tc for removing data from root node)
public class heap {
	private ArrayList<Integer> list;

	public heap() {
	
		list = new ArrayList<>();
	}

	public void add(int item) {
		list.add(item);
		upheapify(list.size() - 1);//peeche peeche se sahi kar rhe hai heap ko.

	}

	private void upheapify(int ci) {
		
		int pi = (ci - 1) / 2;
		if (list.get(pi) > list.get(ci)) {
			swap(ci, pi);
			upheapify(pi);
		}
	}

	public void swap(int i, int j) {
		int temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	public int remove() {
		int rv = list.get(0);
		swap(0, list.size() - 1);
		list.remove(list.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < list.size() && list.get(mini) > list.get(lci)) {
			mini = lci;
		}
		if (rci < list.size() && list.get(mini) > list.get(rci)) {
			mini = rci;
		}
		if (mini != pi) {

			swap(mini, pi);
			downheapify(mini);
		}
	}


	public int getmin() {
		return list.get(0);
	}

	public void Display() {
		System.out.println(list);
	}

}