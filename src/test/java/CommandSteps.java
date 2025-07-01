import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Command;
import org.junit.Assert;

public class CommandSteps {

    private Command command;

    @Given("Customer {string} who want to command for Someone")
    public void customerWhoWantToCommandForSomeone(String name){
        command = new Command();
        command.setFrom(name);
    }

    @When("a command is make for Someone")
    public void aCommandIsMakeForSomeone(){
        command.setTo("Tata");
    }

    @Then("there is no product in the Command")
    public void thereIsNoProductInTheCommand(){
        Assert.assertTrue(command.getProducts().isEmpty());
    }

    @And("the command come from Customer")
    public void theCommandComeFromCustomer(){
        Assert.assertEquals("Toto",command.getFrom());
    }

    // Scenario 2
    @Given("Customer {string} who want to command for Someone {int} products {string}")
    public void customerWhoWantToCommandForSomeoneProducts(String name, int nbProducts, String product){
        command = new Command();
        command.setFrom(name);
        command.setFrom(product);
        for (int i = 0; i < nbProducts; i++) {
            command.getProducts().add(product);
        }
    }

    @When("a command of 2 products is make for Someone")
    public void aCommandOf2ProductsIsMakeForSomeone(){
        command.setTo("Tata");
    }

    @Then("there is 2 products in the Command")
    public void thereIs2ProductsInTheCommand(){
        Assert.assertEquals(2,command.getProducts().size());
    }


}
