package com.stackroute.onlinefashionretail.consumer.Domain;


import java.util.List;
import java.util.Map;

public class DesignerOrder {
    private String id;
    private Design designOrder;
    private List<Map<Mapping,Double>> supplierList;
    private Manufacturer manufacturer;
    private String tagId;


    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Design getDesignOrder() {
        return designOrder;
    }

    public void setDesignOrder(Design designOrder) {
        this.designOrder = designOrder;
    }

    public List<Map<Mapping, Double>> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(List<Map<Mapping, Double>> supplierList) {
        this.supplierList = supplierList;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Dorder{" +
                "id='" + id + '\'' +
                ", designOrder=" + designOrder +
                ", supplierList=" + supplierList +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
