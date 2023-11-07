package ie.atu.warehouseservice;


import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class WarehouseService {

    public String getWarehouseById(){
        String message = "Warehouse %i at location %s with the capacity of %i has been retrieved", warehouse.getWarehouseID(), warehouse.getLocation(), warehouse.getCapacity();
        return message;
    }

}
