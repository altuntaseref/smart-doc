package com.example.smartdoc.service.generators;

import com.example.smartdoc.model.EntityGeneratorModel;
import freemarker.template.Configuration;
import freemarker.template.Template;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.management.ManagementFactory;
import java.util.HashMap;

@Service
@NoArgsConstructor
@Slf4j
public class EntityGenerator {


    public Object execute(EntityGeneratorModel entityGeneratorModel) throws IOException {


        Configuration cfg = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
        String fileName = String.format( "C:\\BUSINESS\\privProject\\smart-doc\\smart-doc\\src\\main\\java\\com\\example\\smartdoc\\entity\\%s.java",entityGeneratorModel.getAppName());
        FileWriter myWriter = new FileWriter(fileName);
        HashMap<String, Object> args = new HashMap<>();
        args.put("tableName", entityGeneratorModel.getTableName());
        args.put("className",entityGeneratorModel.getAppName());
        args.put("fieldNameList",entityGeneratorModel.getFieldName());

        String templateFile ="src/main/resources/templates/model.ftl";
        Template template = cfg.getTemplate(templateFile);
        StringWriter stringWriter = new StringWriter();
        try{
            template.process(args,stringWriter);
        }catch(Exception e){
            log.error(e.getMessage(),e);
        }

        myWriter.write(stringWriter.toString());
        myWriter.close();
        return stringWriter.toString();

    }

}
