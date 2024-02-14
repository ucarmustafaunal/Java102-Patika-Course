public class Main {
    public static void main(String[] args) {
        Book harrypotter = new Book("Harry Potter", 150);
        Book lordoftherings = new Book("Lord of the Rings", -250);
        //lordoftherings.pageNumber = -100;
        lordoftherings.setPageNumber(-100);

        //System.out.println(lordoftherings.pageNumber);
        //System.out.println(lordoftherings.name);

        System.out.println(harrypotter.getName());
        System.out.println(harrypotter.getPageNumber());

        System.out.println(lordoftherings.getName());
        System.out.println(lordoftherings.getPageNumber());
    }
}