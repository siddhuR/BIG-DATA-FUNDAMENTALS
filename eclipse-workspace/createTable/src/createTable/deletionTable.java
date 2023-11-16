package createTable;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;


public class deletionTable {

public static void main(String[] args) throws IOException {
Configuration conf=HBaseConfiguration.create();
Connection connection = ConnectionFactory.createConnection(conf);

Table table = connection.getTable(TableName.valueOf("mytable"));

Delete delete=new Delete(Bytes.toBytes("1"));

delete.addColumn(Bytes.toBytes("colfam1"), Bytes.toBytes("Channel"));

table.delete(delete);

table.close();

}
}