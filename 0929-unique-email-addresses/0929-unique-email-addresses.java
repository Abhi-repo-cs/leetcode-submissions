import java.util.HashSet;
class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String email:emails){
            int Atpos=email.indexOf("@");
            String localHost=email.substring(0,Atpos);
            String domainHost=email.substring(Atpos);
            localHost=localHost.replaceAll("\\.","");
            if(localHost.contains("+")){
                int plus=localHost.indexOf("+");
                localHost=localHost.substring(0,plus);

            }
            email=localHost+domainHost;
            set.add(email);

            
        }

        return set.size();
        
    }
}