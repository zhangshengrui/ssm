package cn.zsr.service.impl;

import cn.zsr.mapper.TestMapperDto;
import cn.zsr.service.SimpleTestBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SimpleTestBusinessImpl implements SimpleTestBusiness {

    @Autowired
    private TestMapperDto testMapperDto;
    @Override
    public String test() {
        return testMapperDto.test();
    }
}
