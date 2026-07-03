public class Mainn {
    public static void main(String[] args) {
        DocumentFactory factory = new WordFactory() ;
        Document document = factory.createDocument();
        document.open();

    }
}
