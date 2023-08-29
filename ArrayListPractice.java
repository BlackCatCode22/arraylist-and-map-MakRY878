import java.util.ArrayList;
//ArrayListPractice.java
//Makala Ramos Yang
//8-29-23

//class coding for array lists

public class ArrayListPractice {
    public static void main(String[] args) {
        System.out.println("\n\n Array List Practice\n\n");

        ArrayList<String> myFriendsList = new ArrayList<>();

        myFriendsList.add("John");
        myFriendsList.add("Chris");
        myFriendsList.add("Eric");
        myFriendsList.add("Luke");
        myFriendsList.add("Mitch");

        System.out.println("\n\n My fifth freind is " + myFriendsList.get(4));

        System.out.println("\n\n The size (number of elements) " + myFriendsList.size());

        //Set, change the data in an element

        myFriendsList.set(0, "Mak");
        System.out.println("\n\n My first friend is changed to..." + myFriendsList.get(0));

        // Remove the third elemtent

        myFriendsList.remove(2);

        //out put the without a for loop

        System.out.println(myFriendsList);

        //output the list with a for loop

        int myFriendNumber = 1;

        for (String s : myFriendsList) ;
        {

            System.out.println(" Friend " + myFriendNumber + " is " + myFriendsList.get(0));
            myFriendNumber++;
        }
        // add list emelemts with a for loop
        for (int i = 0; i < 10; i++) {
            //use .add()
            myFriendsList.add(i + 4, "new friend");
            System.out.println(" New friend added to list.");

            for (String s: myFriendsList) ;
            {

                System.out.println(" Friend " + myFriendNumber + " is " + myFriendsList.get(0));
                myFriendNumber++;
            }
            //write a for/each loop to output the list

        }
    }
}
