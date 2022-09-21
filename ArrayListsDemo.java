package Week_6.AssignmentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListsDemo {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add(345);
        arrayList.add("Aman");
        arrayList.add(45.98f);
        arrayList.add(true);

            for (Object al : arrayList)
            {
                System.out.println(al);
            }
            ArrayList<Integer>arrayList1=new ArrayList<>();
             arrayList1.add(1);
             arrayList1.add(2);
             arrayList1.add(3);
             arrayList1.add(4);
             arrayList1.add(5);
             arrayList1.add(6);
             arrayList1.add(7);
             arrayList1.add(8);

             ArrayList<Integer>arrayList2=new ArrayList<>();
             arrayList2.add(12);
             arrayList2.add(15);
             arrayList2.add(13);
             arrayList2.add(17);
             arrayList2.add(14);
             arrayList2.add(18);
             arrayList2.add(null);
             arrayList1.addAll(arrayList2);
             for(Integer index:arrayList1)
             {
                 System.out.println(index);
             }
        System.out.println("*****************************************");
        Iterator<Integer>iterator=arrayList.iterator();

        while(iterator.hasNext())
             {
                 Object element=iterator.next();
                 System.out.println(element);
             }
        ListIterator<Integer> listIterator=arrayList2.listIterator();
        System.out.println(arrayList2);
        while (listIterator.hasNext())
        {
            Object object=listIterator.next();
            System.out.println(object);
        }
        while (listIterator.hasNext())
        {
            System.out.println("The elements are "+listIterator.next()+"Next Index "+listIterator.nextIndex());
        }


        listIterator.set(17);
        System.out.println(arrayList2);
        listIterator.remove();
        System.out.println(arrayList2);

    }
}