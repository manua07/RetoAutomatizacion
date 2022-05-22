package co.sophos.banitsmo.certificate.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReportePetroleoPage {

    public static final Target BUTTON_EMPRESAS = Target.the("Este es el boton para empresas").located(By.id("header-empresas"));
    public static final Target BUTTON_CAPITAL2 = Target.the("Este es el boton para empresas").located(By.id("menu-sup"));
    public static final By BUTTON_CAPITAL = By.xpath("//*[@id=\"menu-sup\"]/li[5]/a");
    public static final Target BUTTON_ACTUALIDAD = Target.the("Este es el boton para actualidad economica").locatedBy("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a");
    public static final Target BUTTON_EVOLUCION = Target.the("Este es el boton para evolucion del contexto").locatedBy("//*[@id=\"capital_inteligente\"]/div[1]/div[49]/div[2]/h2/a");
    public static final Target BUTTON_DESCARGAR = Target.the("Este es el boton para descargar reporte").locatedBy("/html/body/portletapi:init/div[3]/div[1]/div/div[1]/p[15]/a/img");
    public static final Target BUTTON_VER_MAS = Target.the("Este es el boton para ver mas publicaciones").located(By.id("verMas"));
    public static final By BUTTON_REPORTE = By.xpath("//*[@id=\"capital_inteligente\"]/div[1]/div[28]/div[2]/h2/a");
    public static final Target NOMBRE_VALIDACION = Target.the("Este es el titulo del reporte").located(By.id("title"));
}
