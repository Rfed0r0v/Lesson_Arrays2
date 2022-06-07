import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void arrayPrintOut(List a) {
        for (Object str : a) {
            System.out.println(str);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Task 1.1 - LinkedList");
        LinkedList<String> lLst;
        lLst = new LinkedList<>();
        lLst.add("linkedList 0");
        lLst.add("linkedList 1");
        lLst.add("linkedList 2");
        lLst.add("linkedList 3");
        arrayPrintOut(lLst);
        lLst.add(2, "inserted in pos 2");
        if (lLst.contains("linkedList 1")) { // Удаление по объекту
            lLst.remove("linkedList 1");
        }
        int f = lLst.indexOf("linkedList 3"); // Удаление по индексу
        if (f >= 0) {
            lLst.remove(f);
        }
        arrayPrintOut(lLst);

        System.out.println("Task 1.2 - ArrayList");
        ArrayList<String> aList;
        aList = new ArrayList<>();
        aList.add("arrayListString 0");
        aList.add("arrayListString 1");
        aList.add("arrayListString 2");
        aList.add("arrayListString 3");
        arrayPrintOut(aList);
        aList.add(2, "inserted in pos 2");
        if (aList.contains("arrayListString 1")) { // Удаление по объекту
            aList.remove("arrayListString 1");
        }
        f = lLst.indexOf("linkedList 3"); // Удаление по индексу
        if (f >= 0) {
            lLst.remove(f);
        }
        arrayPrintOut(aList);

        System.out.println("Task 2 - MyArrayList");

        MyArrayList<String> myArrList;
        myArrList = new MyArrayList<>();
        myArrList.add("linkedListString 0");
        myArrList.add("linkedListString 1");
        myArrList.add("linkedListString 2");
        myArrList.add("linkedListString 3");
        myArrList.add(2, "inserted in pos. 2");
        arrayPrintOut(myArrList);


        System.out.println("Task 3 - MyLinkedList");


    }
}
