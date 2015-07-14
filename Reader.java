import java.io.*;
import java.util.*;
//import Sample;

public class Reader {
  	public static void main(String[] args) throws IOException {
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	String s;
    	while ((s = in.readLine()) != null && s.length() != 0) {
    		String inputString = s;
    		String[] inputNumbers = inputString.split(" ");
    		List<Long> topay = new ArrayList<Long>();
    		Long sum = 0L;
    		for (int i = 0; i < inputNumbers.length; i++) {
    			//System.out.println(inputNumbers[i] + " " + i);
    			sum += Long.parseLong(inputNumbers[i]);
    			topay.add(Long.parseLong(inputNumbers[i]));
    		}
    		Long mean = sum / topay.size();
    		System.out.println("Mean: " + mean);
    		Long[] topay_array = new Long[topay.size()];
			topay.toArray(topay_array);
    		for (int i = 0; i < topay.size(); i++) {
    			topay_array[i] = topay_array[i] - mean;
    			System.out.println("Person " + i + ": "+ topay_array[i]);
    		}
    		Sample mysample = new Sample();
    		mysample.category(topay_array, mean);
            for (int i = 0; i < mysample.Result.length; i++) {
                System.out.println(Arrays.toString(mysample.Result[i]));
            }
    	}
	}
}