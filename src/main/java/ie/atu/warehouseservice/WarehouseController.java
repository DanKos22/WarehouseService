package ie.atu.warehouseservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class WarehouseController {


    @PostMapping("/warehouse")
    public class SomeWarehouse(@RequestBody Warehouse warehouse){

    }
}
