package interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationExample {

	public static void main(String[] args) {
		//withConcurrentMdofication();
		 withoutConcurrentMdofication();
		// collectionConcurrentModification();

	}

	private static void collectionConcurrentModification() {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String> safeList = new CopyOnWriteArrayList<>();
		safeList.add("A");
		safeList.add("B");

		for (String s : safeList) {
			safeList.add("C"); // ✅ No exception
		}

		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");

		CopyOnWriteArrayList<String> safeList2 = new CopyOnWriteArrayList<>(list);
		for (String s : safeList) {
			safeList.remove(s); // ✅ No exception
		}

	}

	private static void withoutConcurrentMdofication() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		int size = list.size();
		System.out.println("Size: "+size);
		
		for (int i = 0; i < list.size(); i++) {
			if (list.size() == i + 1) {
				list.add("C"); 
				break;
			}
		}

		System.out.println(list);
	}

	private static void withConcurrentMdofication() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");

		for (String s : list) {
			list.add("C"); // ❌ Throws ConcurrentModificationException
		}

	}

	private static void withoutConcurrentMdoficationmethodIterator() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			if (it.next().equals("B")) {
				it.remove(); // ✅ Safe removal
			}
		}

	}
}
