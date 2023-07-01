import java.util.*;
public class EncodeAndDecodeTinyUrl {
//leetcode 535

        HashMap<String , String> map;
        //ek hashmap rakho usme shorturl ke against longurl rakhoge
        public EncodeAndDecodeTinyUrl(){
            map = new HashMap<>();
        }
        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            StringBuilder sb = new StringBuilder();

            Random r = new Random();
            char ch = (char)r.nextInt(100);
            sb.append(ch);

            //jab tak aapke paas aise key hai jo hashmap me padi hai
            while(map.containsKey(sb.toString()) == true){
                //tab tab next next character generate karte rahe

                ch =(char)r.nextInt(100);
                //jab aisa character aa jaaye toh append kar do
                sb.append(ch);
            }

            //hashmap me nahi padi toh store karke
            map.put(sb.toString(), longUrl);
            //key me return kar do
            return sb.toString();
        }


        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            //decode me se kuch nahi karna shorturl se nikal ke dedena hai map ke andar se
            return map.get(shortUrl);
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
