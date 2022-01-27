package BinaryTree;

public class Main {

    public static void main(String[] args) {
        Binary b=new Binary();
        
        b.addNote(new Node(5));
        b.addNote(new Node(4));
        b.addNote(new Node(6));
        b.addNote(new Node(7));
        b.addNote(new Node(3));
        
        System.out.println(Binary.searchValue(b.root,3));
    }
}
