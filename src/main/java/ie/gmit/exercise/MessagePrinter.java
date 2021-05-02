/*
Name: Ricky Small
Email: G00352166@gmit.ie
Date: 01/05/2021
Title: Main Message edit in accordance to The Dependency Inversion Principal”
*/

package ie.gmit.exercise;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	//Writes message to a file
	public void writeMessage(Message msg, Formatter formatter, PrintWriter writer) throws IOException
	{
		writer.println(formatter.format(msg)); //formats and writes message
		writer.flush();
		writer.close();
	}
}
