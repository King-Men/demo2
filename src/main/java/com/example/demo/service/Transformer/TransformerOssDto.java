package com.example.demo.service.Transformer;

import com.example.demo.control.model.oss;
import com.example.demo.service.model.OssDto;
import org.springframework.stereotype.Component;

@Component
public class TransformerOssDto {

   public OssDto transformObjectToDto(oss oss){

       OssDto ossDto = new OssDto();
       ossDto.setId(oss.getId());
       ossDto.setName(oss.getName());
       ossDto.setNmb(oss.getNmb());

       return ossDto;
          }

    public oss transformDtoToObject(OssDto ossDto){

        oss result = new oss();
        result.setId(ossDto.getId());
        result.setName(ossDto.getName());
        result.setNmb(ossDto.getNmb());

        return result;
    }
}
