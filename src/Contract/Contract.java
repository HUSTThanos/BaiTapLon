package Contract;

import ParkingLot.ParkingLot;
import ParkingLot.*;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Contract {

    private StringProperty IDContract;
    private ObjectProperty<LocalDate> dayInput;
    private ObjectProperty<LocalDate> dayOutput;
    private ParkingLot ForCar;
    private StringProperty groupCar;


    public String getGroupCar() {
        return groupCar.get();
    }

    public StringProperty groupCarProperty() {
        return groupCar;
    }

    public void setGroupCar(String groupCar) {
        this.groupCar.set(groupCar);
    }


    public String getIDContract() {
        return IDContract.get();
    }

    public StringProperty IDContractProperty() {
        return IDContract;
    }

    public void setIDContract(String IDContract) {
        this.IDContract.set(IDContract);
    }

    public LocalDate getDayInput() {
        return dayInput.get();
    }

    public ObjectProperty<LocalDate> dayInputProperty() {
        return dayInput;
    }

    public void setDayInput(LocalDate dayInput) {
        this.dayInput.set(dayInput);
    }

    public LocalDate getDayOutput() {
        return dayOutput.get();
    }

    public ObjectProperty<LocalDate> dayOutputProperty() {
        return dayOutput;
    }

    public void setDayOutput(LocalDate dayOutput) {
        this.dayOutput.set(dayOutput);
    }

    public ParkingLot getForCar() {
        return ForCar;
    }

    public void setForCar(ParkingLot forCar) {
        ForCar = forCar;
    }


    public Contract(String IDContract, LocalDate dayInput, LocalDate dayOutput, ParkingLot forCar, String groupCar) {
        this.IDContract = new SimpleStringProperty(IDContract);
        this.dayInput = new SimpleObjectProperty<>(dayInput);
        this.dayOutput = new SimpleObjectProperty<>(dayOutput);
        this.ForCar = forCar;
        this.groupCar = new SimpleStringProperty(groupCar);
    }

    public Contract(){}


}
