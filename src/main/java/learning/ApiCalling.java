package learning;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiCalling {

    public static void main(String[] args) {
        try {
            // Specify the API endpoint URL
            URL url = new URL("https://api.example.com/data");

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method (GET, POST, etc.)
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();

            // Check if the request was successful (HTTP 200 OK)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response from the API
                InputStreamReader in = new InputStreamReader(connection.getInputStream());

                // Parse the JSON response using JSON.simple
                JSONParser parser = new JSONParser();
                JSONObject jsonResponse = (JSONObject) parser.parse(in);

                // Extract the 'data' array from the response
                JSONArray dataArray = (JSONArray) jsonResponse.get("data");

                // Iterate through the array and convert each JSON object to a Java object
                for (Object dataObj : dataArray) {
                    JSONObject data = (JSONObject) dataObj;

                    // Convert JSON fields to Java fields
                    long barcode = (Long) data.get("barcode");
                    String item = (String) data.get("item");
                    String category = (String) data.get("category");
                    double price = (Double) data.get("price");
                    double discount = (Double) data.get("discount");
                    double available = (Double) data.get("available");

                    // Create a custom Java object
                    Data responseObject = new Data(barcode, item, category, price, discount, available);

                    // Now you can use the 'responseObject' as a Java object
                    System.out.println(responseObject);
                }
            } else {
                System.out.println("Error: " + responseCode);
            }

            // Close the connection
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Data {
    long barcode;
    String item;
    String category;
    double price;
    double discount;
    double available;

    public Data(long barcode, String item, String category, double price, double discount, double available) {
        this.barcode = barcode;
        this.item = item;
        this.category = category;
        this.price = price;
        this.discount = discount;
        this.available = available;
    }

    @Override
    public String toString() {
        return "Data{" +
                "barcode=" + barcode +
                ", item='" + item + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", available=" + available +
                '}';
    }
}

