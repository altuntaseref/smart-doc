package com.example.smartdoc.service;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.example.smartdoc.KongModel;
import org.springframework.stereotype.Service;

@Service
public class KongService {

    public Object findApp(String appName) throws FilloException {

        KongModel kongModel = new KongModel();
        Fillo fillo = new Fillo();
        Connection connection =fillo.getConnection("C:\\Users\\serafettin.altuntas\\Desktop\\test3.xlsx");
        String query ="Select * from Kong where APP_NAME='"+appName+"'" ;
        Recordset recordset = connection.executeQuery(query);
        while (recordset.next()) {
            kongModel.setAppName(recordset.getField("APP_NAME"));

            kongModel.setProdKongLink(recordset.getField("PROD_KONG_LINK"));
            kongModel.setProdLink(recordset.getField("PROD_LINK"));
            kongModel.setProdPassword(recordset.getField("PROD_PASSWORD"));
            kongModel.setProdUsername(recordset.getField("PROD_USERNAME"));

            kongModel.setUatLink(recordset.getField("UAT_LINK"));
            kongModel.setUatKongLink(recordset.getField("UAT_KONG_LINK"));
            kongModel.setUatPassword(recordset.getField("UAT_PASSWORD"));
            kongModel.setUatUsername(recordset.getField("UAT_USERNAME"));


        }
        return kongModel;
    }
}
