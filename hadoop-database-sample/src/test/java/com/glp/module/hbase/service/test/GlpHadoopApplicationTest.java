package com.glp.module.hbase.service.test;

import com.glp.module.hbase.service.entity.HbaseQuotaDto;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GlpHadoopApplicationTest {

    @Autowired
    private Connection hadoopConnection;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getDataTest() throws IOException {
        String rowKey = "GLP_TRANSPORT|913305037405432112|91330503MA2B69YA6U|T421909-120620|062de93e-c253-4843-a449-1S580a5cwq79";
        Table table = hadoopConnection.getTable(TableName.valueOf("kpi:fact_kpi_car_depart_info"));
        Result result = table.get(new Get(Bytes.toBytes(rowKey)));
        if (result == null)
            return;
        List<HbaseQuotaDto> hbaseQuotaDtoList = new ArrayList<>();
        HbaseQuotaDto hbaseQuotaDto;
        for (Cell cell : result.rawCells()) {
            hbaseQuotaDto = new HbaseQuotaDto();
            hbaseQuotaDto.setRowkey(rowKey);
            hbaseQuotaDto.setColumnNames(new String(CellUtil.cloneQualifier(cell)));
            hbaseQuotaDto.setColumnValue(new String(CellUtil.cloneValue(cell)));
            hbaseQuotaDtoList.add(hbaseQuotaDto);
        }
        hbaseQuotaDtoList.forEach(System.out::println);
    }

}
