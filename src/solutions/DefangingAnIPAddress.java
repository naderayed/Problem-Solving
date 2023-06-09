package solutions;

public class DefangingAnIPAddress {

    /*
    Given a valid (IPv4) IP address, return a defanged version of that IP address.
    A defanged IP address replaces every period "." with "[.]".
    Link:https://leetcode.com/problems/defanging-an-ip-address/description/
     */

    public String defangIPaddr(String address) {

        return address.replaceAll("[.]", "[.]");
    }




}
