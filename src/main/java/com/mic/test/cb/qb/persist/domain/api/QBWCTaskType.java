package com.mic.test.cb.qb.persist.domain.api;

public enum QBWCTaskType {

    READ_CUSTOMER(1, "CustomerQueryRs"), // 客户
    ADD_CUSTOMER(2, "CustomerAddRs"), //
    MODIFY_CUSTOMER(3, "CustomerModRs"), //

    READ_VENDOR(4, "VendorQueryRs"), // 货主
    ADD_VENDOR(5, "VendorAddRs"), //
    MODIFY_VENDOR(6, "VendorModRs"), //

    READ_ITEM_INVENTORY(7, "ItemInventoryQueryRs"), // 货品
    ADD_ITEM_INVENTORY(8, "ItemInventoryAddRs"), //
    MODIFY_ITEM_INVENTORY(9, "ItemInventoryModRs"), //

    READ_SALES_ORDER(10, "SalesOrderQueryRs"), // 销售订单
    ADD_SALES_ORDER(11, "SalesOrderAddRs"), //
    MODIFY_SALES_ORDER(12, "SalesOrderModRs"),//

    ADD_SHIP_METHOD(13, "ShipMethodAddRq")
    ;

    private QBWCTaskType(int key, String resXMLTag) {
        this.key = key;
        this.resXMLTag = resXMLTag;
    }

    private int key;
    private String resXMLTag;


    public int getKey() {
        return key;
    }

    public String getResXMLTag() {
        return resXMLTag;
    }

    public static QBWCTaskType getByRootTag(String rootTag) {
        for (QBWCTaskType taskType : QBWCTaskType.values()) {
            if (taskType.resXMLTag.equals(rootTag)) {
                return taskType;
            }
        }
        return null;
    }
}
