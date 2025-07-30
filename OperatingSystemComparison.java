public class OperatingSystemComparison {
    
    // Enum for Operating Systems
    enum OperatingSystem {
        OS1, OS2
    }

    // Method to compare OS architecture
    public static String compareArchitecture(OperatingSystem os) {
        return switch (os) {
            case OS1 -> "Architecture of OS1";
            case OS2 -> "Architecture of OS2";
            default -> "Unknown OS";
        };
    }

    // Method to compare User Interface
    public static String compareUserInterface(OperatingSystem os) {
        return switch (os) {
            case OS1 -> "User Interface of OS1";
            case OS2 -> "User Interface of OS2";
            default -> "Unknown OS";
        };
    }

    // Method to compare Security
    public static String compareSecurity(OperatingSystem os) {
        return switch (os) {
            case OS1 -> "Security features of OS1";
            case OS2 -> "Security features of OS2";
            default -> "Unknown OS";
        };
    }

    // Method to compare Resource Management
    public static String compareResourceManagement(OperatingSystem os) {
        return switch (os) {
            case OS1 -> "Resource Management of OS1";
            case OS2 -> "Resource Management of OS2";
            default -> "Unknown OS";
        };
    }

    // Method to compare Cost and Licensing
    public static String compareCostAndLicensing(OperatingSystem os) {
        return switch (os) {
            case OS1 -> "Cost and Licensing for OS1";
            case OS2 -> "Cost and Licensing for OS2";
            default -> "Unknown OS";
        };
    }

    // Method to compare Performance
    public static String comparePerformance(OperatingSystem os) {
        return switch (os) {
            case OS1 -> "Performance of OS1";
            case OS2 -> "Performance of OS2";
            default -> "Unknown OS";
        };
    }

    // Method to compare Compatibility
    public static String compareCompatibility(OperatingSystem os) {
        return switch (os) {
            case OS1 -> "Compatibility of OS1";
            case OS2 -> "Compatibility of OS2";
            default -> "Unknown OS";
        };
    }

    public static void main(String[] args) {
        // Example comparison
        OperatingSystem os1 = OperatingSystem.OS1;
        OperatingSystem os2 = OperatingSystem.OS2;

        System.out.println("Comparison between OS1 and OS2:");
        System.out.println("Architecture:\n" + compareArchitecture(os1) + "\n" + compareArchitecture(os2));
        System.out.println("User Interface:\n" + compareUserInterface(os1) + "\n" + compareUserInterface(os2));
        System.out.println("Security:\n" + compareSecurity(os1) + "\n" + compareSecurity(os2));
        System.out.println("Resource Management:\n" + compareResourceManagement(os1) + "\n" + compareResourceManagement(os2));
        System.out.println("Cost and Licensing:\n" + compareCostAndLicensing(os1) + "\n" + compareCostAndLicensing(os2));
        System.out.println("Performance:\n" + comparePerformance(os1) + "\n" + comparePerformance(os2));
        System.out.println("Compatibility:\n" + compareCompatibility(os1) + "\n" + compareCompatibility(os2));
    }
}
