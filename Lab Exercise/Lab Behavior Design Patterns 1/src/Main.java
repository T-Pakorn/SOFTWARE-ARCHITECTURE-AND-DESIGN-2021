public class Main {

    public static void main(String[] args) {
        // write your code here
        StringPublisher publisher = new StringPublisher();

        StringSubscriber alphabetSubscriber = new AlphabetSubscriber();
        StringSubscriber numberSubscriber = new NumberSubscriber();
        StringSubscriber symbolSubscriber = new SymbolSubscriber();

        publisher.subscribe(alphabetSubscriber);
        publisher.subscribe(numberSubscriber);
        publisher.subscribe(symbolSubscriber);

        String stringList[] = { "test", "123456", "987654", "ABCD4567", "5555", "****", "@@@@REAS!", "^^^^^dfafadf1412423", "$$$$1124"};
        for (String s : stringList) {
            System.out.println("String : \"" + s + "\"");
            publisher.publish(s);
        }

    }
}
