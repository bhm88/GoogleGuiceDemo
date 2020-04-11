import com.google.inject.Guice;
import com.google.inject.Injector;
import modules.AppModule;
import requests.SquareRequest;

public class MainClass {

    private final static String SQUARE_STR = "SQUARE";

    private static final void sendRequest(String req) {
        if (req.equals(SQUARE_STR)) {
            Injector injector = Guice.createInjector(new AppModule());
            SquareRequest squareRequest1 = injector.getInstance(SquareRequest.class);
            squareRequest1.makeRequest();

            SquareRequest squareRequest2 = injector.getInstance(SquareRequest.class);
            squareRequest2.makeRequest();
            //singeloton check

            boolean SquareRequestInstance = squareRequest2 == squareRequest1;
            System.out.println("were SquareRequest equal " + SquareRequestInstance);

            boolean DrawSqrInstance = squareRequest2.getDrawShape() == squareRequest1.getDrawShape();
            System.out.println("were DrawSqrInstance equal " + DrawSqrInstance);
        }
    }

    public static void main(String[] args) {
        sendRequest(SQUARE_STR);
    }
}
