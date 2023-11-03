package createTable;

import org.apache.hadoop.conf.Configuration; 
import org.apache.hadoop.hbase.HBaseConfiguration; 
import org.apache.hadoop.hbase.TableName; 
import org.apache.hadoop.hbase.client.*; 
import org.apache.hadoop.hbase.util.Bytes; 
 
import java.io.IOException; 


public class retrievalOfValues {
	public static  void main(String[] args) throws IOException { 
		Configuration conf=HBaseConfiguration.create(); 
		Connection connection = ConnectionFactory.createConnection(conf); 
 
		Table table = connection.getTable(TableName.valueOf("mytable")); 
 
		// Instantiating Get Class 
		Get g=new Get(Bytes.toBytes("1")); 
 
		//Reading the data 
		Result result=table.get(g); 
 
		//Reading values from Result class object  
		byte [] value=result.getValue(Bytes.toBytes("colfam1"),Bytes.toBytes("Channel")); 
		byte [] value1=result.getValue(Bytes.toBytes("colfam1"),Bytes.toBytes("Creator"));
		byte [] value2=result.getValue(Bytes.toBytes("colfam1"),Bytes.toBytes("Country"));
 
		//printing the values 
 
		String ch=Bytes.toString(value); 
		String ch1=Bytes.toString(value1); 
		String ch2=Bytes.toString(value2);
 
 
		System.out.println("channel: " + ch + " creator: " + ch1 + " Country: " + ch2 ); 
	}

}