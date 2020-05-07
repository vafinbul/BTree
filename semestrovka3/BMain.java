package ru.itis.semestrovka3;

import java.util.Scanner;
public class BMain
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        int n,n2,temp;
        System.out.print("Enter the t of the Tree?  ");
        n=input.nextInt();

        while ( n<2)
        {
            System.out.print("Please enter a integer greater than 1 : ");
            n=input.nextInt();
        }
        BTree tree = new BTree(n);
        System.out.print("\n How many values do you want to enter?:  ");
        n2 = input.nextInt();

        for ( int i=0;i< n2;i++)
        {
            System.out.print("\nEnter Value:");
            System.out.println(i+1);
            temp=input.nextInt();
            tree.insert(tree,temp);
        }
        int choice,k;

        boolean flag;
        flag=true;
        System.out.println("\tM\tE\tN\tU\n");
        System.out.println("1. Enter more values in a Tree");
        System.out.println("2. Print the whole  Tree in preorder");
        System.out.println("3. Search for a Key and print the Node it belongs to");
        System.out.println("4. Delete a key from the leaf");
        System.out.println("5. Exit");

        while (flag)
        {
            System.out.print("\nPlease enter your choice::");
            choice=input.nextInt();
            if ( choice == 5)
            {
                System.exit(0);
                flag=false;
                break;
            }
            else
            {
                switch(choice)
                {
                    case 1:
                        System.out.print("How many values do you want to enter?:");
                        n2=input.nextInt();
                        for ( int i=0;i< n2;i++)
                        {
                            System.out.print("\nEnter Value: ");
                            System.out.println(i+1);
                            temp=input.nextInt();
                            tree.insert(tree,temp);
                        }
                        break;
                    case 2:
                        tree.print(tree.root);
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("What is the key you wish to search for:");
                        int key2=input.nextInt();
                        tree.SearchPrintNode(tree,key2);
                        break;
                    case 4:
                        System.out.println("Enter a key to be deleted:");
                        int key=input.nextInt();
                        tree.deleteKey(tree,key);
                        System.out.println("Here is the tree printed in preorder after delete");
                        tree.print(tree.root);
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nPlease enter a valid choice of 1,2,3 or 4\n");
                        break;
                }
            }
        }
    }
}
