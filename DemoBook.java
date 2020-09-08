package ikbo2519pr1;

public class DemoBook {
    public static void main(String[] args) {
        Book n1=new Book("Physics and Philosophy",109);
        System.out.println(n1);
        Book n2=new Book("God doesn't play dice. My theory of relativity",666);
        n2.setNumberofpages(111);
    }
}
