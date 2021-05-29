package com.bridgelabz;
import java.util.*;
public class JavaCollectionDemo {
	 public static void main(String[] args) {
			doListDemo();
			doStackDemo();
			doQueueDemo();
			doSetDemo();
			doMapDemo();

		}

		public static void doListDemo() {
			System.out.println("In doListDemo");
			List<String> list = new ArrayList<String>();
			list.add("Ravi");
			list.add("Vijay");
			list.add("Ravi");
			list.add("Ajay");
			Iterator<String> itr = list.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());

			}

		}

		public static void doStackDemo() {
			System.out.println("\nIn doStackDemo");
			Stack<String> stack = new Stack<>();
			stack.push("Ayush");
			stack.push("Garvit");
			stack.push("Amit");
			stack.push("Ashish");
			stack.push("Garima");
			String pop = stack.pop();
			Iterator<String> itr = stack.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());

			}

		}

		public static void doQueueDemo() {
			System.out.println("\nIn doQueueDemo");
			PriorityQueue<String> queue = new PriorityQueue<>();
			queue.add("Amit sharma");
			queue.add("Vijay raj");
			queue.add("Jaishankar");
			queue.add("raj");
			System.out.println("head: " + queue.element());
			System.out.println("head: " + queue.peek());
			System.out.println("iterating queue elements");
			Iterator itr = queue.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());

			}
			queue.remove();
			queue.poll();
			System.out.println("after removing the element");
			Iterator<String> itr2 = queue.iterator();
			while (itr2.hasNext()) {
				System.out.println(itr2.next());
			}

		}

		public static void doSetDemo() {
			System.out.println("\nIn doSetDemo");
			Set<String> set = new LinkedHashSet<String>();
			set.add("Ravi");
			set.add("Vijay");
			set.add("Ravi");
			set.add("Ajay");
			for (String str : set) {
				System.out.println(str);
			}

		}

		public static void doMapDemo() {
			System.out.println("\nIn doMapDemo");
			Map<Integer, String> map = new HashMap<Integer, String>();
			map.put(100, "Amit");
			map.put(101, "Vijay");
			map.put(102, "Rahul");
			for (Map.Entry m : map.entrySet())
			{
				System.out.println(m.getKey() + " " + m.getValue());
			}
		}

	}  


