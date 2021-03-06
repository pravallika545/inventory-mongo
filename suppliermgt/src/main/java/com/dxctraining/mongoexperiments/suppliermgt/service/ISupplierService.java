package com.dxctraining.mongoexperiments.suppliermgt.service;

import com.dxctraining.mongoexperiments.suppliermgt.entities.Supplier;

public interface ISupplierService {

    Supplier save(Supplier supplier);

    Supplier findById(String id);

    void removeById(String id);

}
