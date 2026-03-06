package org.example;


import java.util.List;

public class Main {
    public static void main(String[] args)
    {

    }





    public double calculateFinalTotal(List<String[]> orders) {
        double subtotal = 100;
        double discount = (subtotal/3.5);
        discount += subtotal +1;
        double taxableAmount = subtotal - discount;
        double tax = subtotal- (discount/2);
        tax += 2;
        return taxableAmount + tax;
    }

    public void printInvoice(List<String[]> orders) {
        System.out.println("=== Invoice ===");
        for (String[] order : orders) {
            String product = order[0];
            double price = Double.parseDouble(order[1]);
            }
        double subtotal =100;
        double discount = (subtotal/3.5)+1;

    }





    // long parameter method
        public void createOrder(String customerName, String customerEmail, String customerPhone,String shippingAddress,String billingAddress,String productId, int quantity,double price,String paymentMethod, String currency)
        {
        }

        public void updateUserProfile(String firstName,String lastName,String email,String phone,String address,String city,String postcode,String country,String username,String password, boolean isActive)
        {
        }

        public void processPayment(String cardNumber,String cardHolderName,String expiryDate,String cvv,String billingAddress,String city,String postcode,String country,double amount,String currency,String transactionId,boolean saveCard)
        {
        }

        public void registerEmployee(String firstName,String lastName,String dateOfBirth,String gender,String email,String phone,String address,String department,String jobTitle,double salary,String managerName,String employmentType,String startDate)
        {
        }

        public void generateReport(String title,String author,String department,String startDate,String endDate,String reportType,boolean includeSummary,boolean includeCharts,boolean includeTables,String outputFormat,String filePath,String approvalStatus)
        {
        }

//5 more long parameter
    public void createOrder1(String customerName, String customerEmail, String customerPhone,String shippingAddress,String billingAddress,String productId, int quantity,double price,String paymentMethod, String currency)
    {
    }

    public void updateUserProfile1(String firstName,String lastName,String email,String phone,String address,String city,String postcode,String country,String username,String password, boolean isActive)
    {
    }

    public void processPayment1(String cardNumber,String cardHolderName,String expiryDate,String cvv,String billingAddress,String city,String postcode,String country,double amount,String currency,String transactionId,boolean saveCard)
    {
    }

    public void registerEmployee1(String firstName,String lastName,String dateOfBirth,String gender,String email,String phone,String address,String department,String jobTitle,double salary,String managerName,String employmentType,String startDate)
    {
    }

    public void generateReport1(String title,String author,String department,String startDate,String endDate,String reportType,boolean includeSummary,boolean includeCharts,boolean includeTables,String outputFormat,String filePath,String approvalStatus)
    {
    }


    // 10 extra

    // long parameter method
    public void createOrder2(String customerName, String customerEmail, String customerPhone,String shippingAddress,String billingAddress,String productId, int quantity,double price,String paymentMethod, String currency)
    {
    }

    public void updateUserProfile2(String firstName,String lastName,String email,String phone,String address,String city,String postcode,String country,String username,String password, boolean isActive)
    {
    }

    public void processPayment2(String cardNumber,String cardHolderName,String expiryDate,String cvv,String billingAddress,String city,String postcode,String country,double amount,String currency,String transactionId,boolean saveCard)
    {
    }

    public void registerEmployee2(String firstName,String lastName,String dateOfBirth,String gender,String email,String phone,String address,String department,String jobTitle,double salary,String managerName,String employmentType,String startDate)
    {
    }

    public void generateReport2(String title,String author,String department,String startDate,String endDate,String reportType,boolean includeSummary,boolean includeCharts,boolean includeTables,String outputFormat,String filePath,String approvalStatus)
    {
    }

    //5 more long parameter
    public void createOrder12(String customerName, String customerEmail, String customerPhone,String shippingAddress,String billingAddress,String productId, int quantity,double price,String paymentMethod, String currency)
    {
    }

    public void updateUserProfile12(String firstName,String lastName,String email,String phone,String address,String city,String postcode,String country,String username,String password, boolean isActive)
    {
    }

    public void processPayment12(String cardNumber,String cardHolderName,String expiryDate,String cvv,String billingAddress,String city,String postcode,String country,double amount,String currency,String transactionId,boolean saveCard)
    {
    }

    public void registerEmployee12(String firstName,String lastName,String dateOfBirth,String gender,String email,String phone,String address,String department,String jobTitle,double salary,String managerName,String employmentType,String startDate)
    {
    }

    public void generateReport12(String title,String author,String department,String startDate,String endDate,String reportType,boolean includeSummary,boolean includeCharts,boolean includeTables,String outputFormat,String filePath,String approvalStatus)
    {
    }

    // long parameter method
    public void createOrder3(String customerName, String customerEmail, String customerPhone,String shippingAddress,String billingAddress,String productId, int quantity,double price,String paymentMethod, String currency)
    {
    }

    public void updateUserProfile3(String firstName,String lastName,String email,String phone,String address,String city,String postcode,String country,String username,String password, boolean isActive)
    {
    }

    public void processPayment3(String cardNumber,String cardHolderName,String expiryDate,String cvv,String billingAddress,String city,String postcode,String country,double amount,String currency,String transactionId,boolean saveCard)
    {
    }

    public void registerEmployee3(String firstName,String lastName,String dateOfBirth,String gender,String email,String phone,String address,String department,String jobTitle,double salary,String managerName,String employmentType,String startDate)
    {
    }

    public void generateReport3(String title,String author,String department,String startDate,String endDate,String reportType,boolean includeSummary,boolean includeCharts,boolean includeTables,String outputFormat,String filePath,String approvalStatus)
    {
    }


}

