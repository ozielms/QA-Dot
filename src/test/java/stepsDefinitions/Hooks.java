package stepsDefinitions;

import static utils.Utils.acessarSistema;
import static utils.Utils.capturarTela;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void AddProducts() {
        acessarSistema();
    }

    @After
    public void tearDown(Scenario scenario) {
        capturarTela(scenario);
        // Pedir para o navegador encerrar depois que encerrar o teste
        // driver.quit();
    }

}
