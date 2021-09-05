public class Oppg3Avsnitt128TurneringsTre {
    public static class Node{

        int value;
        Node left_child;
        Node right_child;

        Node(int value){
            this.value = value;
            this.left_child = null;
            this.left_child = null;
        }

        void print(){
            System.out.print(value + " ");

            if (left_child != null){
                this.left_child.print();
            }
            if (right_child != null){
                this.right_child.print();
            }
        }
    }

    static Node turneringKamp(Node tall1, Node tall2){


        int winner = (tall1.value < tall2.value) ? tall1.value : tall2.value;

        Node parent = new Node(winner);
        parent.left_child = tall1;
        parent.right_child = tall2;

        return parent;
    }

    public static void main(String[] args) {
        Node a1 = new Node(9);
        Node a2 = new Node(21);
        Node a3 = new Node(5);
        Node a4 = new Node(25);
        Node a5 = new Node(27);
        Node a6 = new Node(23);
        Node a7 = new Node(26);
        Node a8 = new Node(28);
        Node a9 = new Node(17);
        Node a10 = new Node(15);
        Node a11 = new Node(19);
        Node a12 = new Node(18);
        Node a13 = new Node(16);
        Node a14 = new Node(20);
        Node a15 = new Node(14);
        Node a16 = new Node(10);

        //Åttendels
        Node seksten1 = turneringKamp(a1,a2);
        Node seksten2 = turneringKamp(a3,a4);
        Node seksten3 = turneringKamp(a5,a6);
        Node seksten4 = turneringKamp(a7,a8);
        Node seksten5 = turneringKamp(a9,a10);
        Node seksten6 = turneringKamp(a11,a12);
        Node seksten7 = turneringKamp(a13,a14);
        Node seksten8 = turneringKamp(a15,a16);

        //Kvart
        Node aattendels1 = turneringKamp(seksten1,seksten2);
        Node aattendels2 = turneringKamp(seksten3,seksten4);
        Node aattendels3 = turneringKamp(seksten5,seksten6);
        Node aattendels4 = turneringKamp(seksten7,seksten8);

        //Semi
        Node kvart1 = turneringKamp(aattendels1, aattendels2);
        Node kvart2 = turneringKamp(aattendels3, aattendels4);

        //Finale
        Node finale = turneringKamp(kvart1,kvart2);

        System.out.println("Turneringstreet i pre-orden");

        finale.print();

    }
}
