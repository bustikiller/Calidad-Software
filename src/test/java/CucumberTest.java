
import com.github.davidmoten.spaceinvaders.Coords;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class CucumberTest {

    public Coords coords = new Coords(0, 0);

    @Given("^unas coordenadas (\\d+), (\\d+)$")
    public void given_coords(int x, int y) {
        coords.setX(x);
        coords.setY(y);
    }

    @When("^se produzca un desplazamiento de (\\d+), (\\d+)$")
    public void when_mov(int x, int y) {
        Coords movement = new Coords(x, y);
        coords.sum(movement);
    }
    
    @Then("^la comprobación sera (true|false)$")
    public void is_valid (boolean result) {
        if(coords.isValid()) {
            Assert.assertTrue(result);
        } else {
            Assert.assertFalse(result);
        }
    }
}
