package pl.pcemekm.webBook.core.util;

public class ValidationUtils {
    
    private ValidationUtils() {
    }
    
    public static boolean isValidEmail(String email) {
        if (email == null || email.isBlank()) {
            return false;
        }
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
    
    public static boolean isNullOrBlank(String str) {
        return str == null || str.isBlank();
    }
    
    public static String sanitize(String input) {
        if (input == null) {
            return null;
        }
        return input.trim();
    }
}

