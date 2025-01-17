package com.mnrc.sales.forecasting.mnrcsalesforecasting.model.repo;

import com.mnrc.sales.forecasting.mnrcsalesforecasting.dal.ProductSalesDAL;
import com.mnrc.sales.forecasting.mnrcsalesforecasting.model.ProductSales;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductSalesRepository extends MongoRepository<ProductSales, String>, ProductSalesDAL {
}
