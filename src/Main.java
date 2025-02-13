public class Main {
    public static void main(String[] args) {
        Separator();

        Book Devils = new Book("Devils", new Author("Fedor", "Dostoevsky"), 1872);
        System.out.println("Book name: " + Devils.getBookName());
        Author devils = new Author("Fedor", "Dostoevsky");
        System.out.println("Author first name: " + devils.getFirstName());
        System.out.println("Author second name: " + devils.getSecondName());
        Devils.setPublishingYear(1873);
        System.out.println("Publishing year: " + Devils.getPublishingYear());

        Separator();

        Book TheIdiot = new Book("The Idiot", new Author("Fedor", "Dostoevsky"), 1869);
        System.out.println("Book name: " + TheIdiot.getBookName());
        Author theIdiot = new Author("Fedor", "Dostoevsky");
        System.out.println("Author first name: " + theIdiot.getFirstName());
        System.out.println("Author second name: " + theIdiot.getSecondName());
        System.out.println("Publishing year: " + TheIdiot.getPublishingYear());

        Separator();
    }
    public static void Separator() {
        System.out.println("------------------------------");
    }
}



