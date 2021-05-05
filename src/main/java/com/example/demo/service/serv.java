package com.example.demo.service;
import com.example.demo.control.model.oss;
import com.example.demo.service.Transformer.TransformerOssDto;
import com.example.demo.service.interfaceservice.IService;
import com.example.demo.service.model.OssDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class serv implements IService {

    @Autowired
    TransformerOssDto transformerOssDto;

    private List<OssDto> tot= new ArrayList<OssDto>(Arrays.asList(
            new OssDto(1, "oussama", 5),
            new OssDto(2,"Youness",10))

    );
    public List<oss> findd(){

        List<oss> list =new ArrayList<>();
        for (OssDto ossDto:tot ) {
            list.add(transformerOssDto.transformDtoToObject(ossDto));
        }
        return list;
    }

    @Override
    public Void modifier(oss oss) {
        return null;
    }

    public oss getbyid(int id){
        for(OssDto x:tot){
            if(x.getId()==id)return transformerOssDto.transformDtoToObject(x);
        }
        return new oss(id,"anonym",0);
    }
    public boolean save(oss x){


        return  tot.add(transformerOssDto.transformObjectToDto(x));
    }
    public void delet(int id){
        for(OssDto x:tot){
            if(x.getId()==id){
                tot.remove(x);
                break;
            }

        }
    }
}
