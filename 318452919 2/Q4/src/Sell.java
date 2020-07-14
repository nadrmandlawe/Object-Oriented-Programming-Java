import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Sell {
	private String client;
	private String seller;
	private double sum;

	public String getClient(){
		return client;
	}

	public String getSeller(){
		return seller;
	}

	public double getSum(){
		return sum;
	}

	public static void bestSeller(final java.util.List<Sell> sells) throws Exception {
         if (sells == null || sells.size() == 0) {
              throw new Exception("illigal list param");
         } else {

              final HashSet<String> set = new HashSet();

              final HashMap<String, Integer> map = new HashMap<String, Integer>();

              for (int i = 0; i < sells.size(); i++) {
                   final Sell s = sells.get(i);
                   final String key = s.getClient() + "," + s.getSeller();
                   set.add(key);
              }

              final Iterator<String> i = set.iterator();
              while (i.hasNext()) {
                   final String str = i.next();
                   final String[] client_seller = str.split(",");

                   final String seller = client_seller[1];
                   final Integer numSells = map.get(seller);
                   if (numSells == null) {
                        map.put(seller, 0);
                   } else {
                        map.put(seller, numSells + 1);
                   }
              }

              int maxV = 0;
              String maxK = "";

              for (final Entry<String, Integer> entry : map.entrySet()) {

                   if (entry.getValue() > maxV) {
                        maxV = entry.getValue();
                        maxK = entry.getKey();
                   }
              }

              System.out.println("Best assistent is " + maxK + " with the following " + maxV + " customers");

              // 2

              final HashMap<String, Double> map2 = new HashMap<String, Double>();

              for (int j = 0; j < sells.size(); j++) {
                   final Sell s = sells.get(j);
                   final String seller = s.getSeller();
                   final String client = s.getClient();

                   if (seller.equals(maxK)) {
                        final Double total = map2.get(client);
                        if (total == null) {
                             map2.put(client, s.getSum());
                        } else {
                             map2.put(client, total + s.getSum());
                        }
                   }
              }

              for (final Map.Entry m : map2.entrySet()) {
				System.out.println(m.getKey() + ":" + m.getValue() + " shekels");    
			}  
		}
	}
}