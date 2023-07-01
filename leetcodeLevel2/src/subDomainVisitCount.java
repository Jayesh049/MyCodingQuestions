import java.util.*;
public class subDomainVisitCount {

        public List<String> subdomainVisits(String[] cpdomains) {
            HashMap<String ,Integer> map = new HashMap<>();


            //saare domains ke andar se ek subdomain nikaal liya
            for(String domain:cpdomains){
                //humne domain ke andar se split kar liya
                String tmp[] = domain.split(" ");

                int visitCount = Integer.parseInt(tmp[0]);//uska 0th element nikaal liya uske domain me se

                String words[] = tmp[1].split("\\.");

                StringBuilder sb = new StringBuilder();


                for(int idx = words.length -1 ;idx >= 0 ;idx--){
                    if(idx == words.length - 1){
                        sb.append(words[idx]);
                    }else{
                        sb.insert(0 , ".");
                        sb.insert(0 , words[idx]);
                    }

                    String subDomain = sb.toString();

                    if(map.containsKey(subDomain) == true){
                        int csf = map.get(subDomain);
                        map.put(subDomain , csf + visitCount);
                    }else{
                        map.put(subDomain, visitCount);
                    }
                }
            }

            ArrayList<String> res = new ArrayList<>();


            for(String subDomain : map.keySet()){
                StringBuilder sb = new StringBuilder();
                sb.append(map.get(subDomain));
                sb.append(" ");
                sb.append(subDomain);
                res.add(sb.toString());
            }
            return res;
        }
    }


















