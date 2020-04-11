package requests;

import services.DrawShape;
import services.DrawShape;

import javax.inject.Inject;

public class SquareRequest {
    DrawShape d;

   /* //example for field injection
    @Inject
    DrawShape d;*/


    /*//setter/method injection
    @Inject
    public void setDrawShape(DrawShape d){
        this.d=d;
    }*/


    //constructor injection
    @Inject
    public SquareRequest(DrawShape d) {
        this.d = d;
    }

    public void makeRequest() {
        d.draw();
    }

    public DrawShape getDrawShape() {
        return d;
    }


}
