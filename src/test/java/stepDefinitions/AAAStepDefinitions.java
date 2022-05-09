package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import utils.AbstractStepDefinitions;

public class AAAStepDefinitions extends AbstractStepDefinitions {

   @Dado("que estou no google chrome")
    public void que_estou_no_google_chrome() {

        open("https://youtube.com");
   }

   @Quando("clico em um video")
    public void clico_em_um_video() {

   }

   @Entao("deve reproduzir o video")
    public void deve_reproduzir_o_video() {

   }
}
