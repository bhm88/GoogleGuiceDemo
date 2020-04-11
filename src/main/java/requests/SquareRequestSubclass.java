package requests;

import services.DrawShape;

import javax.inject.Inject;

public class SquareRequestSubclass extends SquareRequest {
    @Inject
    public SquareRequestSubclass(DrawShape d) {
        super(d);
    }

    @Override
    public void makeRequest() {
        System.out.println("squarerequest subclass with enhanced behaviour");
        super.makeRequest();
    }
}
