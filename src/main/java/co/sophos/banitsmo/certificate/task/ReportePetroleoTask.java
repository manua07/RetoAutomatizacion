package co.sophos.banitsmo.certificate.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReportePetroleoTask implements Task {

    private final String contactName;
    private final String phone;
    private final String deliveryAddress;
    private final String email;

    public ReportePetroleoTask(String contactName, String phone, String deliveryAddress, String email) {
        this.contactName = contactName;
        this.phone = phone;
        this.deliveryAddress = deliveryAddress;
        this.email = email;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(        );
    }

    public static ReportePetroleoTask withAdditionalDataInformation(String contactName,String phone,String deliveryAddress,String email ){
        return instrumented(ReportePetroleoTask.class, contactName,phone,deliveryAddress,email);

}
}