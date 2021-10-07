package D20211007;

/**
 * 468. Validate IP Address
 */
public class Q0468 {

    public String validIPAddress(String IP) {

        if(IP.length() == 0) return "Neither";

        String[] ipv4 = IP.split("\\.",-1);
        String[] ipv6 = IP.split("\\:",-1);

        if(ipv4.length == 4) return checkValidIpv4(ipv4);
        else if(ipv6.length == 8) return checkValidIpv6(ipv6);
        else return "Neither";
    }

    private String checkValidIpv4(String[] data) {
        for(String s : data) {
            try {
                if (s.matches("[a-zA-Z]+")
                        || (s.length() > 1 && s.startsWith("0"))
                        || Integer.parseInt(s) < 0
                        || Integer.parseInt(s) > 255) {
                    return "Neither";
                }
            } catch (NumberFormatException e) {
                return "Neither";
            }
        }
        return "IPv4";
    }

    private String checkValidIpv6(String[] data) {
        for(String s : data) {
            if (s.length() <= 0 || s.length() > 4
                    || s.matches(".*[g-zG-Z].*")) return "Neither";
        }
        return "IPv6";
    }
}
