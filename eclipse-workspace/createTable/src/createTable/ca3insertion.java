package createTable;

import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.hbase.HBaseConfiguration;

import org.apache.hadoop.hbase.HColumnDescriptor;

import org.apache.hadoop.hbase.HTableDescriptor;

import org.apache.hadoop.hbase.TableName;

import org.apache.hadoop.hbase.client.*;

import org.apache.hadoop.hbase.util.Bytes;



import java.io.IOException;

public class ca3insertion {
	public static void main(String[] args) throws IOException {
		Configuration conf=HBaseConfiguration.create();
		Connection connection = ConnectionFactory.createConnection(conf);

		Table table = connection.getTable(TableName.valueOf("ca3table"));

		Put put = new Put(Bytes.toBytes("1"));

		put.addColumn(Bytes.toBytes("colf1"), Bytes.toBytes("Country"),Bytes.toBytes("ind"));
		put.addColumn(Bytes.toBytes("colf1"), Bytes.toBytes("Name"),Bytes.toBytes("abc"));
		put.addColumn(Bytes.toBytes("colf1"), Bytes.toBytes("section"),Bytes.toBytes("xyz"));

		table.put(put);
		
		Put put2 = new Put(Bytes.toBytes("2"));

		put2.addColumn(Bytes.toBytes("colf1"), Bytes.toBytes("Country"),Bytes.toBytes("ind"));
		put2.addColumn(Bytes.toBytes("colf1"), Bytes.toBytes("Name"),Bytes.toBytes("abc"));
		put2.addColumn(Bytes.toBytes("colf1"), Bytes.toBytes("section"),Bytes.toBytes("xyz"));

		table.put(put2);

		}

}


