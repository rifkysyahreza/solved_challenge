class Solution {
    public String defangIPaddr(String address) {
        String[] arrayOfString = address.split("[.]");
        return String.join("[.]", arrayOfString);
    }
}