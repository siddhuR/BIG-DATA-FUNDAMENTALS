package createTable;

import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.hbase.HBaseConfiguration;

import org.apache.hadoop.hbase.HColumnDescriptor;

import org.apache.hadoop.hbase.HTableDescriptor;

import org.apache.hadoop.hbase.TableName;

import org.apache.hadoop.hbase.client.*;

import org.apache.hadoop.hbase.util.Bytes;



import java.io.IOException;

public class insertionTable {
	public static void main(String[] args) throws IOException {
		Configuration conf=HBaseConfiguration.create();
		Connection connection = ConnectionFactory.createConnection(conf);

		Table table = connection.getTable(TableName.valueOf("mytable"));

		Put put = new Put(Bytes.toBytes("1"));

		put.addColumn(Bytes.toBytes("colfam1"), Bytes.toBytes("Channel"),Bytes.toBytes("ABC"));
		put.addColumn(Bytes.toBytes("colfam1"), Bytes.toBytes("Creator"),Bytes.toBytes("Sam"));
		put.addColumn(Bytes.toBytes("colfam1"), Bytes.toBytes("Country"),Bytes.toBytes("USA"));

		table.put(put);
		
		Put put2 = new Put(Bytes.toBytes("2"));

		put2.addColumn(Bytes.toBytes("colfam1"), Bytes.toBytes("Channel"),Bytes.toBytes("ABC"));
		put2.addColumn(Bytes.toBytes("colfam1"), Bytes.toBytes("Creator"),Bytes.toBytes("Sam"));
		put2.addColumn(Bytes.toBytes("colfam1"), Bytes.toBytes("Country"),Bytes.toBytes("USA"));

		table.put(put2);

		}

}
