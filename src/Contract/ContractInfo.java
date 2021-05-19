package Contract;

import ParkingLot.SubCar;
import ParkingLot.SubCarInfo;
import ParkingLot.Truck;
import ParkingLot.TruckInfo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.time.LocalDate;


public class ContractInfo {

    private static ObservableList contractsList;
    private static ObservableList<SubCar> subCarList;
    private static ObservableList<Truck> truckList;

    public static ObservableList ReturnContracts(){
        subCarList = SubCarInfo.ReturnCar();
        truckList = TruckInfo.ReturnTruck();

        contractsList = FXCollections.observableArrayList(
            new Contract("fasnfia", LocalDate.of(2021,1, 1), LocalDate.of(2021, 2, 1), subCarList.get(0), "Xe con"),
            new Contract("4561fas", LocalDate.of(2021, 1, 1), LocalDate.of(2026, 1, 1), truckList.get(0), "Xe tải"),
                new Contract("123fsa", LocalDate.of(2020,4, 10), LocalDate.of(2022, 2, 1), subCarList.get(1), "Xe con"),
                new Contract("miomsod", LocalDate.of(2019, 7, 1), LocalDate.of(2022, 7, 3), truckList.get(1), "Xe tải"),
                new Contract("116dfsfs", LocalDate.of(2018,12, 1), LocalDate.of(2023, 12, 12), subCarList.get(2), "Xe con"),
                new Contract("okokoko", LocalDate.of(2018,12, 1), LocalDate.of(2024, 12, 12), subCarList.get(3), "Xe con"),
            new Contract("hichic", LocalDate.of(2018,12, 1), LocalDate.of(2025, 12, 12), subCarList.get(4), "Xe con"),
                new Contract("miomsod", LocalDate.of(2020, 7, 1), LocalDate.of(2025, 7, 3), truckList.get(3), "Xe tải")
                );


        return contractsList;
    }
}
